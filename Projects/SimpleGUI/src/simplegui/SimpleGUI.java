/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplegui;

import javax.swing.JOptionPane;

/**
 *
 * @author dylan
 */
public class SimpleGUI {

    /************************************************************************************
    * This shows how to implement simple message boxes and input from dialog boxes.     *
    * The final line shows how output can be formatted to fit the console.              * 
    ************************************************************************************/
    
    public static void main(String[] args) {
        // Display welcome message in a dialog box:
        JOptionPane.showMessageDialog(null, "Welcome to java!", "Display message", JOptionPane.INFORMATION_MESSAGE);
        
        // Invite input via an input dialog box:
        String input = JOptionPane.showInputDialog(null, "Enter a number", "Input dialog demo", JOptionPane.QUESTION_MESSAGE);
        
        double numbericInput = Double.parseDouble(input); // Convert the string to a double
        
        double result = (numbericInput*5); // Perform a calculation
        String output = "The final answer is " + result;
        JOptionPane.showMessageDialog(null, output); // Show the result on a message dialog box
        
        // By way of comparison, show how the result can be formatted at the console
        // The final output will take up a total of 10 spaces, including 3 decimal places and the decimal point
        // An answer of 1172.839 will have two blank spaces inserted at the begining
        
        System.out.printf("%10.3f", result);
    }
    
}
