/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package unit_3.outcome_1;

/**
 *
 * @author dylan
 */

// <editor-fold defaultstate="collapsed" desc="Naming Conventions Key">
    /***********************************************
    *            NAMING CONVENTIONS KEY            *
    * ---------------------------------------------*
    *  Integer = intName                           *
    *  Float = floName                             *
    *  Double = dblName                            *
    *  String = strName                            *
    *  Boolean = blnName                           *
    *  Multi-Dimensional Array (String) = masName  *
    *  Path = pthName                              *
    *  InputStream = ismName                       *
    *  BufferedReader = bfrName                    *
    *  BufferedInputStream = bisName               *
    *  FileWriter = fwrName                        *
    *  IOException = ioeName                       *
    *  Label = lblName                             *
    *  Combo Box = cmbName                         * 
    *  Text Field = txtName                        *
    *  Button = btnName                            *
    *  JFileChooser = jfcName                      *
    *  Class = clsName                             *
    *  Method = mthName                            *
    *  Listener = lsnName                          *
    ***********************************************/
// </editor-fold>


import java.nio.file.*;
import java.io.*;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.lang.Math;

public class UI_Design extends javax.swing.JFrame {

    /**
     * Creates new form UI_Design
     */
    public UI_Design() {
        initComponents();
    }
    
    class clsGlobals {
        /**
         * Variables (respectively):
         *  - A Multi-Dimensional Array to eventually contain the data records
         *  - An Integer to store how long the records
         *     file is based on the number of lines it contains
         *  - A Path datatype to eventually store the path to the records file
         *  - A Boolean to record if there is any unsaved data that has been 
         *     added to the record
         */
        private static String[][] masRecords;
        private static int intFileLineCount = 0;
        private static Path pthDataFile;
        private static boolean blnIsSaved = true;
        private static int intSortDirection = 0; // 0 = Ascending, 1 = Descending
        private static int intSearchOption = 0; // 0 = Name, 1 = Class, 2 = Year
        
        /**
         * A method used to set 'intFileLineCount' based on the parsed file
         * path. Returns an Integer
         */
        public static int mthGetFileLength(Path pthFile) {
            // Reset the line count
            intFileLineCount = 0;
            try {
                // Create file input and reader
                InputStream ismFileInput = new BufferedInputStream(Files.newInputStream(pthFile));
                BufferedReader bfrFileReader = new BufferedReader(new InputStreamReader(ismFileInput));
                
                // Loop through file to increase line count
                while (bfrFileReader.readLine() != null) intFileLineCount++;
                
                ismFileInput.close();
                bfrFileReader.close();
            }
            catch (IOException ioeExcept) {
                System.err.println("IO Exception in 'clsGlobals.getFileLength()': " + ioeExcept);
            }
            return intFileLineCount;
        }
        
        /** 
         * A method to create and return a new array based on the parsed 
         * length. Returns a Multi-Dimensional Array with a size of 
         * ("parsed length" x "3")
         */
        public static String[][] mthCreateNewArray(int intLength){           
            masRecords = new String[intLength][3]; 
            
            return masRecords;
        }
        
        public static String[][] mthReverseArray(String[][] masInput) {
            // Create new string and find length of input array
            String[][] masReversed = new String[masInput.length][3];
            int intArrayLength  = masInput.length;
            
            // Loop through array backwards moving the values in the temp array into the exsiting array
            for (String[] masInput1 : masInput) {
                masReversed[intArrayLength  - 1] = masInput1;
                intArrayLength  -= 1;
            }
            
            return masReversed;
        }
    }
    
    class clsStringQuickSort {
        // Local variables
        private static String[][] masNames;
        private static int intLength;
        
        public static void mthSort(String[][] masArray, int intSubArrayIndex) {
            // Return if the array is unsable
            if (masArray == null || masArray.length == 0) return;
            
            // Asign local variables
            masNames = masArray;
            intLength = masArray.length;
            
            // Run quickSort algorithm
            mthQuickSort(0, intLength - 1, intSubArrayIndex, 0);
        }
        
        /**
         * intLowerIndex: start of array
         * intHigherInded: array.length - 1
         * intSubArrayIndex: Specify Name, Class or year
         * intCharPosition: Which character of the string to start with
         */
        private static void mthQuickSort(int intLowerIndex, int intHigherIndex, int intSubArrayIndex, int intCharPosition) {
            // Asign low and high index values to ends of array
            int intLow = intLowerIndex;
            int intHigh = intHigherIndex;
            
            // Asign pivot to middle value or before if even
            String pivot = String.valueOf(masNames[intLowerIndex + (intHigherIndex - intLowerIndex) / 2][intSubArrayIndex].charAt(0));
            
            while (intLow <= intHigh) {
                // Loop to increase low for each value less than pivot to find lowest value
                while (String.valueOf(masNames[intLow][intSubArrayIndex].charAt(intCharPosition)).compareToIgnoreCase(pivot) < 0) {
                    intLow++;
                }
                
                // Loop to increase high for each value higher than pivot to find highest value
                while (String.valueOf(masNames[intHigh][intSubArrayIndex].charAt(intCharPosition)).compareToIgnoreCase(pivot) > 0) {
                    intHigh--;
                }
                
                // If the values are already 'sorted', move to next, otherwise swap them
                if (intLow <= intHigh) {
                    if (intLow != intHigh) {
                        mthExchangeNames(intLow, intHigh);
                    }
                    intLow++;
                    intHigh--;
                }
            }
            
            // If the character position is less than the length of the 
            if (intCharPosition < masNames[0][intSubArrayIndex].length() - 1) {
                if (intLowerIndex < intHigh) {
                    mthQuickSort(intLowerIndex, intHigh, intSubArrayIndex, intCharPosition);
                }
                if (intLow < intHigherIndex) {
                    mthQuickSort(intLow, intHigherIndex, intSubArrayIndex, intCharPosition);
                }
            }
            else {
                if (intLowerIndex < intHigh) {
                    mthQuickSort(intLowerIndex, intHigh, intSubArrayIndex, 0);
                }
                if (intLow < intHigherIndex) {
                    mthQuickSort(intLow, intHigherIndex, intSubArrayIndex, 0);
                }
            }
        }
        
        private static void mthExchangeNames(int i, int j) {
            String[] strTemp = masNames[i];
            masNames[i] = masNames[j];
            masNames[j] = strTemp;
        }
    }
    
    class clsIntegerQuickSort {
        private static String[][] masNumbers;
        private static int intLength;
        
        public static void mthSort(String[][] masArray, int intSubArrayIndex) {
            if (masArray == null || masArray.length == 0) {
                return;
            }
        
            masNumbers = masArray;
            intLength = masArray.length;
            mthQuickSort(0, intLength - 1, intSubArrayIndex);
        }
        
        private static void mthQuickSort(int intLowerIndex, int intHigherIndex, int intSubArrayIndex) {
        int intLow = intLowerIndex;
        int intHigh = intHigherIndex;
        int pivot = Integer.parseInt(masNumbers[intLowerIndex + (intHigherIndex - intLowerIndex) / 2][2]);
        
        while (intLow <= intHigh) {
            while (Integer.parseInt(masNumbers[intLow][intSubArrayIndex]) < pivot) {
                intLow++;
            }
            
            while (Integer.parseInt(masNumbers[intHigh][intSubArrayIndex]) > pivot) {
                intHigh--;
            }
            
            if (intLow <= intHigh) {
                mthExchangeNumbers(intLow, intHigh);
                intLow++;
                intHigh--;
            }
        }
        
        // Recursively call quicksort
        if (intLowerIndex < intHigh) {
            mthQuickSort(intLowerIndex, intHigh, intSubArrayIndex);
        }
        if (intLow < intHigherIndex) {
            mthQuickSort(intLow, intHigherIndex, intSubArrayIndex);
        }
    }
    
        private static void mthExchangeNumbers(int i, int j) {
        String temp[] = masNumbers[i];
        masNumbers[i] = masNumbers[j];
        masNumbers[j] = temp;
    }
    }
    
    class clsBinarySearch {
        public static int mthSearch(String[] sasInput, String strSearchItem, int intCharPosition) {
            int intLeft = 0;
            int intRight = sasInput.length - 1;
            
            while (intLeft <= intRight) {
                int intCurrent = intLeft + (intRight - intLeft) / 2;
                
                int intResult = String.valueOf(strSearchItem.charAt(intCharPosition)).compareToIgnoreCase(String.valueOf(sasInput[intCurrent].charAt(intCharPosition)));
                
                if (intResult == 0) {
                    return intCurrent;
                }
                
                if (intResult > 0) {
                    intLeft = intCurrent + 1;
                }
                else {
                    intRight = intCurrent - 1;
                }
            }
            
            if (intCharPosition < )
            return -1;
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgpSortDirection = new javax.swing.ButtonGroup();
        bgpSearchSelection = new javax.swing.ButtonGroup();
        lblHeading = new javax.swing.JLabel();
        cmbRecordIndex = new javax.swing.JComboBox<>();
        txtName = new javax.swing.JTextField();
        txtClass = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        btnLoad = new javax.swing.JButton();
        btnAddRecord = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblRecordNumber = new javax.swing.JLabel();
        btnEditRecord = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        lblClass = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        btnNameSort = new javax.swing.JButton();
        btnYearSort = new javax.swing.JButton();
        btnClassSort = new javax.swing.JButton();
        rtnDes = new javax.swing.JRadioButton();
        rtnAsc = new javax.swing.JRadioButton();
        lblSortDirection = new javax.swing.JLabel();
        txtSearchItem = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        rtnNameSearch = new javax.swing.JRadioButton();
        rtnClassSearch = new javax.swing.JRadioButton();
        rtnYearSearch = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                lsnWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeading.setText("Heading: Name, Class, Year");
        getContentPane().add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        cmbRecordIndex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empty" }));
        cmbRecordIndex.setToolTipText("Record Number");
        cmbRecordIndex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRecordIndexActionPerformed(evt);
            }
        });
        getContentPane().add(cmbRecordIndex, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        txtName.setEditable(false);
        txtName.setText("Empty");
        txtName.setToolTipText("Name");
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 110, -1));

        txtClass.setEditable(false);
        txtClass.setText("Empty");
        txtClass.setToolTipText("Class");
        getContentPane().add(txtClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 110, -1));

        txtYear.setEditable(false);
        txtYear.setText("Empty");
        txtYear.setToolTipText("Year");
        getContentPane().add(txtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 110, -1));

        btnLoad.setText("Load");
        btnLoad.setToolTipText("Load Data");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });
        getContentPane().add(btnLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        btnAddRecord.setText("Add Record");
        btnAddRecord.setToolTipText("Add Record");
        btnAddRecord.setEnabled(false);
        btnAddRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRecordActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        btnSave.setText("Save");
        btnSave.setToolTipText("Save Records");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, -1, -1));

        btnExit.setText("Exit");
        btnExit.setToolTipText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, -1, -1));

        lblRecordNumber.setText("Record Number");
        getContentPane().add(lblRecordNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        btnEditRecord.setText("Edit Record");
        btnEditRecord.setToolTipText("Edit Record");
        btnEditRecord.setEnabled(false);
        btnEditRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditRecordActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        lblName.setText("Name");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        lblClass.setText("Class");
        getContentPane().add(lblClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        lblYear.setText("Year");
        getContentPane().add(lblYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        btnNameSort.setText("Sort");
        btnNameSort.setEnabled(false);
        btnNameSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNameSortActionPerformed(evt);
            }
        });
        getContentPane().add(btnNameSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 70, -1));

        btnYearSort.setText("Sort");
        btnYearSort.setEnabled(false);
        btnYearSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYearSortActionPerformed(evt);
            }
        });
        getContentPane().add(btnYearSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 70, -1));

        btnClassSort.setText("Sort");
        btnClassSort.setEnabled(false);
        btnClassSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassSortActionPerformed(evt);
            }
        });
        getContentPane().add(btnClassSort, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 70, -1));

        bgpSortDirection.add(rtnDes);
        rtnDes.setText("Descending");
        rtnDes.setEnabled(false);
        rtnDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtnDesActionPerformed(evt);
            }
        });
        getContentPane().add(rtnDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, -1));

        bgpSortDirection.add(rtnAsc);
        rtnAsc.setSelected(true);
        rtnAsc.setText("Ascending");
        rtnAsc.setEnabled(false);
        rtnAsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtnAscActionPerformed(evt);
            }
        });
        getContentPane().add(rtnAsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, -1, -1));

        lblSortDirection.setText("Sort Direction:");
        getContentPane().add(lblSortDirection, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, -1, -1));

        txtSearchItem.setText("Search");
        txtSearchItem.setEnabled(false);
        getContentPane().add(txtSearchItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        btnSearch.setText("Search");
        btnSearch.setEnabled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        bgpSearchSelection.add(rtnNameSearch);
        rtnNameSearch.setSelected(true);
        rtnNameSearch.setText("N");
        rtnNameSearch.setEnabled(false);
        rtnNameSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtnNameSearchActionPerformed(evt);
            }
        });
        getContentPane().add(rtnNameSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        bgpSearchSelection.add(rtnClassSearch);
        rtnClassSearch.setText("C");
        rtnClassSearch.setEnabled(false);
        rtnClassSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtnClassSearchActionPerformed(evt);
            }
        });
        getContentPane().add(rtnClassSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        bgpSearchSelection.add(rtnYearSearch);
        rtnYearSearch.setText("Y");
        rtnYearSearch.setEnabled(false);
        rtnYearSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtnYearSearchActionPerformed(evt);
            }
        });
        getContentPane().add(rtnYearSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        /** 
         * - Create a file browser to allow the user to select the records file
         * - Store the path of the file a file is selected and cancel the 
         *    operation if not
         */
        JFileChooser jfcFileBrowser = new JFileChooser(System.getProperty("user.dir") + "\\src\\unit_3\\outcome_1\\");
        jfcFileBrowser.setSelectedFile(new File("record.txt"));
        jfcFileBrowser.addChoosableFileFilter(new FileNameExtensionFilter("Text Documents", "txt"));
        jfcFileBrowser.setAcceptAllFileFilterUsed(false);
        int intResponse=  jfcFileBrowser.showOpenDialog(null);
        Path pthRecordFilePath = null;
        
        if (intResponse == JFileChooser.APPROVE_OPTION) {
            pthRecordFilePath = Paths.get(jfcFileBrowser.getSelectedFile().getAbsolutePath());
            clsGlobals.pthDataFile = pthRecordFilePath;
        }
        else {
            return;
        }
        
        String strCurrentLine;
        String strDelimiter = ", ";
        
        /**
         * (With error handling):
         * - Load the selected file and create a new array based on the length 
         *    of the loaded file
         * - Loop through the line of the file to set the new array to the data 
         *    within the file
         * - Close the file and clear the record index combo box before adding 
         *    indexes to it and setting the global array to the locally created 
         *    array of loaded data
         * - Catch any IO Exceptions and enable the add record button
         */
        try {
            BufferedInputStream bisFileInput = new BufferedInputStream(Files.newInputStream(pthRecordFilePath));
            BufferedReader bfrFileReader = new BufferedReader(new InputStreamReader(bisFileInput));
            
            String[][] masLoadedRecords = clsGlobals.mthCreateNewArray(clsGlobals.mthGetFileLength(pthRecordFilePath));
            int intRecordIndex = 0;
            
            System.out.println();
            strCurrentLine = bfrFileReader.readLine();
            
            while (strCurrentLine != null) {
                masLoadedRecords[intRecordIndex] = strCurrentLine.split(strDelimiter);
                strCurrentLine = bfrFileReader.readLine();
                intRecordIndex += 1;                
            }
            bisFileInput.close();
            bfrFileReader.close();
           
            cmbRecordIndex.removeAllItems();
            
            for (int i = 0; i < masLoadedRecords.length; i++) {
                cmbRecordIndex.addItem(Integer.toString(i + 1));
                clsGlobals.masRecords[i] = masLoadedRecords[i];
                // DEBUG: System.out.println(Arrays.toString(masLoadedRecords[i]));
            }
        }
        catch (IOException ioeExcept) {
            System.err.println("IO Exception in 'btnLoadActionPerformed': " + ioeExcept);
        }
        
        
        if (pthRecordFilePath != null) {
            btnAddRecord.setEnabled(true);
            btnEditRecord.setEnabled(true);
            rtnAsc.setEnabled(true);
            rtnDes.setEnabled(true);
            btnNameSort.setEnabled(true);
            btnClassSort.setEnabled(true);
            btnYearSort.setEnabled(true);
            txtSearchItem.setEnabled(true);
            btnSearch.setEnabled(true);
            rtnNameSearch.setEnabled(true);
            rtnClassSearch.setEnabled(true);
            rtnYearSearch.setEnabled(true);
        }
        else if (pthRecordFilePath == null) {
            btnAddRecord.setEnabled(false);
            btnEditRecord.setEnabled(false);
            rtnAsc.setEnabled(false);
            rtnDes.setEnabled(false);
            btnNameSort.setEnabled(false);
            btnClassSort.setEnabled(false);
            btnYearSort.setEnabled(false);
            txtSearchItem.setEnabled(true);
            btnSearch.setEnabled(true);
            rtnNameSearch.setEnabled(true);
            rtnClassSearch.setEnabled(true);
            rtnYearSearch.setEnabled(true);
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnAddRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRecordActionPerformed
        /**
         * - Prompt user for new data and load into separate variables
         * - Load old and new data into arrays and combine them into a new, 
         *    larger array
         * - Update global array and set the saved state to false and enable the 
         *    save button
         */
        String strNewName = (String)JOptionPane.showInputDialog(null, "Name:");
        if ((strNewName == null)) return;
        
        String strNewClass = (String)JOptionPane.showInputDialog(null, "Class:");
        if ((strNewClass == null)) return;
        
        String strNewYear = (String)JOptionPane.showInputDialog(null, "Year:");
        if ((strNewYear == null)) return;
                
        String[][] masExistingRecords = clsGlobals.masRecords;
        
        String[][] masNewRecord = {{strNewName, strNewClass, strNewYear}};
        
        String[][] masUpdatedRecords = clsGlobals.mthCreateNewArray(clsGlobals.intFileLineCount + 1);
        
        for (int i = 0; i < masUpdatedRecords.length; i++) {
            if (i < masUpdatedRecords.length - 1) {
                masUpdatedRecords[i] = masExistingRecords[i];
            }
            else if (i == masUpdatedRecords.length - 1) {
                masUpdatedRecords[i] = masNewRecord[0];
            }
        }
        
        clsGlobals.masRecords = clsGlobals.mthCreateNewArray(clsGlobals.intFileLineCount + 1);
        clsGlobals.masRecords = masUpdatedRecords;
        
        System.out.println();
        
        cmbRecordIndex.removeAllItems();

        for (int i = 0; i < clsGlobals.masRecords.length; i++) {
            cmbRecordIndex.addItem(Integer.toString(i + 1));
            // DEBUG: System.out.println(Arrays.toString(clsGlobals.masRecords[i]));
        }
        
        clsGlobals.blnIsSaved = false;
        btnSave.setEnabled(true);
        cmbRecordIndex.setSelectedIndex(clsGlobals.masRecords.length - 1);
    }//GEN-LAST:event_btnAddRecordActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        /**
         * - Warn the user of any unsaved record when the exit button is pressed
         */
        if (clsGlobals.blnIsSaved == false) {
            int intConfirmExit = (int) JOptionPane.showConfirmDialog(null, "Unsaved records!\nDo you wish to proceed?", "Unsaved Records", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if (intConfirmExit == 0) System.exit(0);
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void cmbRecordIndexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRecordIndexActionPerformed
        /**
         * - If the combo box has a selection, set the text fields to the 
         *    appropriate data based on the combo box selection
         */   
        if (cmbRecordIndex.getSelectedItem() != null) {
            txtName.setText(clsGlobals.masRecords[cmbRecordIndex.getSelectedIndex()][0]);
            txtClass.setText(clsGlobals.masRecords[cmbRecordIndex.getSelectedIndex()][1]);
            txtYear.setText(clsGlobals.masRecords[cmbRecordIndex.getSelectedIndex()][2]);
        }
    }//GEN-LAST:event_cmbRecordIndexActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        /**
         * - Loop through the global array and write the data to new lines in the original records file
         * - Notify the user of success and print any errors
         * - Set the saved state to true and disable the save button
         */
        try {
            FileWriter fwrFileWriter = new FileWriter(clsGlobals.pthDataFile.toString());
            String strData;
                    
            for (String[] masRecord : clsGlobals.masRecords) {
                strData = Arrays.toString(masRecord);
                strData = strData.substring(1, strData.length() - 1);
                fwrFileWriter.write(strData);
                fwrFileWriter.write("\n");
            }
            fwrFileWriter.close();
            
            JOptionPane.showMessageDialog(null, "File Saved Successfully");  
        }
        catch (IOException ioeExcept) {
            System.err.println("IO Exception in 'btnSaveActionPerformed: " + ioeExcept);
        }
        
        clsGlobals.blnIsSaved = true;
        btnSave.setEnabled(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditRecordActionPerformed
        /**
         * - Warn the user of any unsaved record when the "X" in the title bar 
         *    is pressed.
         */
        String strEditName = (String)JOptionPane.showInputDialog(null, "Name:", clsGlobals.masRecords[cmbRecordIndex.getSelectedIndex()][0]);
        if ((strEditName == null)) return;
        clsGlobals.masRecords[cmbRecordIndex.getSelectedIndex()][0] = strEditName;
        
        String strEditClass = (String)JOptionPane.showInputDialog(null, "Class:", clsGlobals.masRecords[cmbRecordIndex.getSelectedIndex()][1]);
        if ((strEditClass == null)) return;
        clsGlobals.masRecords[cmbRecordIndex.getSelectedIndex()][1] = strEditClass;
        
        String strEditYear = (String)JOptionPane.showInputDialog(null, "Year:", clsGlobals.masRecords[cmbRecordIndex.getSelectedIndex()][2]);
        if ((strEditYear == null)) return;
        clsGlobals.masRecords[cmbRecordIndex.getSelectedIndex()][2] = strEditYear;
        
        cmbRecordIndex.setSelectedIndex(cmbRecordIndex.getSelectedIndex());
        
        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnEditRecordActionPerformed

    private void lsnWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_lsnWindowClosing
        if (clsGlobals.blnIsSaved == false) {
            int intConfirmExit = (int) JOptionPane.showConfirmDialog(null, "Unsaved records!\nDo you wish to proceed?", "Unsaved Records", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if (intConfirmExit == 0) System.exit(0);
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_lsnWindowClosing

    private void btnNameSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNameSortActionPerformed
        if (clsGlobals.masRecords == null) {
            return;
        }
        String[][] words = new String[clsGlobals.masRecords.length][3];
        
        System.arraycopy(clsGlobals.masRecords, 0, words, 0, clsGlobals.masRecords.length);
        
        clsStringQuickSort.mthSort(words, 0);
        
        if (clsGlobals.intSortDirection == 1) {
            words = clsGlobals.mthReverseArray(words);
        }
        
        System.arraycopy(words, 0, clsGlobals.masRecords, 0, words.length);
        
        btnSave.setEnabled(true);
        cmbRecordIndex.setSelectedIndex(cmbRecordIndex.getSelectedIndex());
    }//GEN-LAST:event_btnNameSortActionPerformed

    private void btnClassSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassSortActionPerformed
        if (clsGlobals.masRecords == null) {
            return;
        }
        
        String[][] words = new String[clsGlobals.masRecords.length][3];
        
        System.arraycopy(clsGlobals.masRecords, 0, words, 0, clsGlobals.masRecords.length);
        
        clsStringQuickSort.mthSort(words, 1);
        
        if (clsGlobals.intSortDirection == 1) {
            words = clsGlobals.mthReverseArray(words);
        }
        
        System.arraycopy(words, 0, clsGlobals.masRecords, 0, words.length);
        
        btnSave.setEnabled(true);
        cmbRecordIndex.setSelectedIndex(cmbRecordIndex.getSelectedIndex());
    }//GEN-LAST:event_btnClassSortActionPerformed

    private void btnYearSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYearSortActionPerformed
        if (clsGlobals.masRecords == null) {
            return;
        }
        
        String[][] words = new String[clsGlobals.masRecords.length][3];
        
        System.arraycopy(clsGlobals.masRecords, 0, words, 0, clsGlobals.masRecords.length);
        
        clsIntegerQuickSort.mthSort(words, 2);
        
        if (clsGlobals.intSortDirection == 1) {
            words = clsGlobals.mthReverseArray(words);
        }
        
        System.arraycopy(words, 0, clsGlobals.masRecords, 0, words.length);
        
        btnSave.setEnabled(true);
        cmbRecordIndex.setSelectedIndex(cmbRecordIndex.getSelectedIndex());
    }//GEN-LAST:event_btnYearSortActionPerformed

    private void rtnAscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtnAscActionPerformed
        clsGlobals.intSortDirection = 0;
    }//GEN-LAST:event_rtnAscActionPerformed

    private void rtnDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtnDesActionPerformed
        clsGlobals.intSortDirection = 1;
    }//GEN-LAST:event_rtnDesActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String strSearchItem = txtSearchItem.getText();
        
        String[] array = new String[clsGlobals.masRecords.length];
        
        for (int i = 0; i < clsGlobals.masRecords.length; i++) {
            array[i] = clsGlobals.masRecords[i][clsGlobals.intSearchOption];
        }
        
        int intSearchItemIndex = clsBinarySearch.mthSearch(array, strSearchItem, 0);
        
        if (intSearchItemIndex != -1) {
            cmbRecordIndex.setSelectedIndex(intSearchItemIndex);
        }
        else {
            System.out.println("Not present");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void rtnNameSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtnNameSearchActionPerformed
        clsGlobals.intSearchOption = 0;
    }//GEN-LAST:event_rtnNameSearchActionPerformed

    private void rtnClassSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtnClassSearchActionPerformed
        clsGlobals.intSearchOption = 1;
    }//GEN-LAST:event_rtnClassSearchActionPerformed

    private void rtnYearSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtnYearSearchActionPerformed
        clsGlobals.intSearchOption = 2;
    }//GEN-LAST:event_rtnYearSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI_Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_Design().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgpSearchSelection;
    private javax.swing.ButtonGroup bgpSortDirection;
    private javax.swing.JButton btnAddRecord;
    private javax.swing.JButton btnClassSort;
    private javax.swing.JButton btnEditRecord;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnNameSort;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnYearSort;
    private javax.swing.JComboBox<String> cmbRecordIndex;
    private javax.swing.JLabel lblClass;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRecordNumber;
    private javax.swing.JLabel lblSortDirection;
    private javax.swing.JLabel lblYear;
    private javax.swing.JRadioButton rtnAsc;
    private javax.swing.JRadioButton rtnClassSearch;
    private javax.swing.JRadioButton rtnDes;
    private javax.swing.JRadioButton rtnNameSearch;
    private javax.swing.JRadioButton rtnYearSearch;
    private javax.swing.JTextField txtClass;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearchItem;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
