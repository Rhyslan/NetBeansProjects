/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package math;

/**
 *
 * @author dylan
 */

import java.util.Random;
        
public class Math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random1 = new Random(3);  // The seed is 3
        for (int i = 0; i < 10; i++) {
            System.out.println(random1.nextInt(1000) + " ");
        }
    }
    
}
