/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package random_number;

import java.util.Random;

/**
 *
 * @author dylan
 */
public class Random_Number {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Pick a random number
        Random random = new Random();
        
        int number = random.nextInt(100) + 1;
        
        System.out.println(number);
        
    }
    
}
