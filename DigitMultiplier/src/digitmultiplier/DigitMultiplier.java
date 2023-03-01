/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package digitmultiplier;

import java.util.Scanner;

/**
 *
 * @author dylan
 */
public class DigitMultiplier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String input = "";
        
        input = in.nextLine();
        
        int i = Integer.parseInt(input);
        
        if (i > 100 && i < 999) {
            
        
            int o1 = i % 10;
        
            i /= 10;
        
            int o2 = i % 10;
        
            i /= 10;
        
            int o3 = i;
        
            int output = o3 * o2 * o1;
            
            System.out.println(output);
        }
        else {
            System.out.println("The number is not between 100 and 999");
        }
        
        
    }
    
}
