/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package unit_3.outcome_1;

/**
 *
 * @author dylan
 */

// Imports
import java.nio.file.*;
import java.io.*;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class UI_Design extends javax.swing.JFrame {

    /**
     * Creates new form UI_Design
     */
    public UI_Design() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // Generate the array to store the data from the file
    class generateArray{
        // Globally accessable array
        private static String[][] loadedData;
        private static int lines = 0;
        private static Path dataFile;
        
        // Globally accessable file length
        public static int fileLength(Path file) {
            // Number of lines to be in the array
            lines = 0;
            try {
                // Load the file parsed through the parameter
                InputStream input = new BufferedInputStream(Files.newInputStream(file));
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                
                // Updates lines to length of file
                while (reader.readLine() != null) lines++;
                
                input.close();
                reader.close();
            }
            catch (IOException e) {
                System.out.println("Message: " + e);
            }
            return lines;
        }
        
        // Globally accessable array creation
        public static String[][] createArray(int length){           
            // Set the length of the array
            loadedData = new String[length][3]; 
            
            return loadedData;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        recordNum = new javax.swing.JComboBox<>();
        nameText = new javax.swing.JTextField();
        classText = new javax.swing.JTextField();
        yearText = new javax.swing.JTextField();
        load = new javax.swing.JButton();
        addRecord = new javax.swing.JButton();
        save = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        recordNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Heading: Name, Class, Year");

        recordNum.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empty" }));
        recordNum.setToolTipText("Record Number");
        recordNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordNumActionPerformed(evt);
            }
        });

        nameText.setEditable(false);
        nameText.setText("Empty");
        nameText.setToolTipText("Name");

        classText.setEditable(false);
        classText.setText("Empty");
        classText.setToolTipText("Class");

        yearText.setEditable(false);
        yearText.setText("Empty");
        yearText.setToolTipText("Year");

        load.setText("Load");
        load.setToolTipText("Load Data");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });

        addRecord.setText("Add Record");
        addRecord.setToolTipText("Add Record");
        addRecord.setEnabled(false);
        addRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRecordActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.setToolTipText("Save Records");
        save.setEnabled(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.setToolTipText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        recordNumber.setText("Record Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(load)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addRecord)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(recordNumber)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(recordNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(classText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(recordNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(recordNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(load)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addRecord)
                    .addComponent(exit)
                    .addComponent(save))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        // Path of the data file
        JFileChooser fileBrowser = new JFileChooser("C:/Users/dylan/School/Year 12/Software Development/NetBeansProjects/Unit_3-Outcome_1/src/unit_3/outcome_1/");
        fileBrowser.setSelectedFile(new File("record.txt"));
        fileBrowser.addChoosableFileFilter(new FileNameExtensionFilter("Text Documents", "txt"));
        fileBrowser.setAcceptAllFileFilterUsed(false);
        int r = fileBrowser.showOpenDialog(null);
        Path file = null;
        
        if (r == JFileChooser.APPROVE_OPTION) {
            file = Paths.get(fileBrowser.getSelectedFile().getAbsolutePath());
            generateArray.dataFile = file;
        }
        
        String s;
        String delimiter = ", ";
        
        try {
            int lines = generateArray.fileLength(file);
            // Load and set up a reader
            BufferedInputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            
            // Use global array creation
            String[][] splitArray = generateArray.createArray(lines);
            int recordIndex = 0;
            
            // Blank line and read first line of the file
            System.out.println();
            s = reader.readLine();
            
            // Loop while s has data
            while (s != null) {
                // Assign the specified sub-array to the current line of the file
                splitArray[recordIndex] = s.split(delimiter);
                s = reader.readLine();
                recordIndex += 1;                
            }
            input.close();
            reader.close();
           
            recordNum.removeAllItems();
            
            // Assign the comboBox options and the global array to the loaded data
            for (int i = 0; i < splitArray.length; i++) {
                recordNum.addItem(Integer.toString(i + 1));
                generateArray.loadedData[i] = splitArray[i];
                System.out.println(Arrays.toString(splitArray[i]));
            }
        }
        catch (IOException e) {
            System.out.println("Message: " + e);
        }
        addRecord.setEnabled(true);
    }//GEN-LAST:event_loadActionPerformed

    private void addRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRecordActionPerformed
        JFrame frame = new JFrame();
        String newName = (String)JOptionPane.showInputDialog(frame, "Name:");
        if ((newName == null)) return;
        
        String newClass = (String)JOptionPane.showInputDialog(frame, "Class:");
        if ((newClass == null)) return;
        
        String newYear = (String)JOptionPane.showInputDialog(frame, "Year:");
        if ((newYear == null)) return;
                
        String[][] oldData = generateArray.loadedData;
        
        String[][] newData = {{newName, newClass, newYear}};
               
        //generateArray.loadedData = generateArray.createArray(generateArray.lines++);
        
        String[][] fullData = generateArray.createArray(generateArray.lines + 1);
        
        for (int i = 0; i < fullData.length; i++) {
            if (i < fullData.length - 1) {
                fullData[i] = oldData[i];
            }
            else if (i == fullData.length - 1) {
                fullData[i] = newData[0];
            }
        }
        
        generateArray.loadedData = generateArray.createArray(generateArray.lines + 1);
        generateArray.loadedData = fullData;
        
        System.out.println();
        
        recordNum.removeAllItems();

        // Assign the comboBox options and the global array to the loaded data
        for (int i = 0; i < generateArray.loadedData.length; i++) {
            recordNum.addItem(Integer.toString(i + 1));
            System.out.println(Arrays.toString(generateArray.loadedData[i]));
        }
        
        save.setEnabled(true);
    }//GEN-LAST:event_addRecordActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void recordNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordNumActionPerformed
        // Load text fields based on the selected record index 
        if (recordNum.getSelectedItem() != null) {
            nameText.setText(generateArray.loadedData[Integer.parseInt((String)recordNum.getSelectedItem()) - 1][0]);
            classText.setText(generateArray.loadedData[Integer.parseInt((String)recordNum.getSelectedItem()) - 1][1]);
            yearText.setText(generateArray.loadedData[Integer.parseInt((String)recordNum.getSelectedItem()) - 1][2]);
        }
    }//GEN-LAST:event_recordNumActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
            FileWriter writer = new FileWriter(generateArray.dataFile.toString());
            String data;
                    
            for (int i = 0; i < generateArray.loadedData.length; i++) {
                data = Arrays.toString(generateArray.loadedData[i]);
                data = data.substring(1, data.length() - 1);
                
                writer.write(data);
                writer.write("\n");
            }
            writer.close();
            
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "File Saved Successfully");  
        }
        catch (IOException e) {
            System.out.println("Message: " + e);
        }
        save.setEnabled(false);
    }//GEN-LAST:event_saveActionPerformed

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
    private javax.swing.JButton addRecord;
    private javax.swing.JTextField classText;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton load;
    public javax.swing.JTextField nameText;
    private javax.swing.JComboBox<String> recordNum;
    private javax.swing.JLabel recordNumber;
    private javax.swing.JButton save;
    private javax.swing.JTextField yearText;
    // End of variables declaration//GEN-END:variables
}
