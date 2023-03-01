/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keyboard_input;

import java.util.Scanner;

/**
 *
 * @author dylan
 */
public class Keyboard_Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name = ""; // Declare & initialise a String to hold input
        
        Scanner input = new Scanner(System.in); // Use the Scanner class to create an object to read input from System.in
        
        System.out.print("What is your name? > "); // Ask for name
        name = input.next(); // Get what the user types
        System.out.println(); // Move down to a fresh line
        
        // Then reply and use their name
        System.out.println("That's an interesting name, " + name + "!");
    }
    
}
