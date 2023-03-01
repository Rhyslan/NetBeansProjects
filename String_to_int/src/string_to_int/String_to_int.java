/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package string_to_int;

/**
 *
 * @author dylan
 */
public class String_to_int {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // String s = "fred"; // Use this if you want to test the exception below
        String s = "100";
        try {
            // The string to int happens here
            int i = Integer.parseInt(s.trim());
            
            // Print out the value after the conversion 
            System.out.println("int i = " + i);
        }
        catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
    }
    
}
