/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dowhile;

import java.util.Scanner;
/**
 *
 * @author dylan
 */
public class DoWhile {
    /** Main Method */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data;
        int sum = 0;
        
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Keep reading data until the input is 0
        do {
            // Read the next data
            System.out.print("Enter an int value (the program exits if the input is 0): ");
            data  = input.nextInt();
            
            sum = sum + data;
        } while (data != 0);
        
        System.out.println("The sum is " + sum);
    }
    
}
