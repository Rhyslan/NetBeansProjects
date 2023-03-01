/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package html.to.java;

/**
 *
 * @author dylan
 */

import java.util.Scanner;

public class HTMLToJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();
        
        // Check empty password field
        if (password.equals("")) {
            System.out.println("**Fill the password please");
            return;
        }
        
        // Minimum password length validation
        if (password.length() < 8) {
            System.out.println("**Password length must be at least 8 characters");
            return;
        }
        
        // Maxumum length of password validation
        if (password.length() > 15) {
            System.out.println("**Password length must not exceed 15 characters");
        } else {
            System.out.println("Password is correct");
        }
        
    }
    
}
