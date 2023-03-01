/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Echo;

import java.util.Scanner;

/**
 *
 * @author dylan
 */
public class Echo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String line;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Type something: ");
        line = in.nextLine();
        System.out.println("You said: " + line);
        
        System.out.print("Type something else: ");
        line = in.nextLine();
        System.out.println("You also said: " + line);
    }
    
}
