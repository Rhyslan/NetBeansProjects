/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessing.numbers;

import java.util.Scanner;
/**
 *
 * @author dylan
 */
public class GuessingNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generate a random number to be guessed
        int number = (int)(Math.random() * 101);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");
        
        int guess = -1; // Why not a number between 0 and 100?
        while (guess != number) {
            // Prompt the user to enter a number
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();
            
            if (guess == number) 
                System.out.println("Yes, the number is " + number);
            else if (guess > number)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
        } // End of loop
    } // End of main method
    
} // End of class
