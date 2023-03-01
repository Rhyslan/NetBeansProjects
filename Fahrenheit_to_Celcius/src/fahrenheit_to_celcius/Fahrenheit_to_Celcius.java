/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fahrenheit_to_celcius;

import javax.swing.JOptionPane;

/**
 *
 * @author dylan
 */
public class Fahrenheit_to_Celcius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter Fahrenheit", "Fahrenheit to Celcius", JOptionPane.QUESTION_MESSAGE);
        
        double numbericInput = Double.parseDouble(input);
        
        double result = ((5.0/9.0) * (numbericInput - 32.0));
        
        String output = "Converted to Celcius that is: " + result;
        JOptionPane.showMessageDialog(null, output);
    }
    
}
