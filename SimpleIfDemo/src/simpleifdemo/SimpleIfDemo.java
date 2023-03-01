/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simpleifdemo;
import java.util.Scanner;

/**
 *
 * @author dylan
 */
public class SimpleIfDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();
        
        if (number % 5 == 0) {
            System.out.println("This number is a multiple of 5.");
        }
        
        if (number % 2 == 0) {
            System.out.println("This is an even number.");
        }
        
        printParity(number);
    }
    
    public static void printParity(int x) {
        if (x % 2 == 0) {
            System.out.println("x is even");
        }
        else {
            System.out.println("x is odd");
        }
    }
    
}
