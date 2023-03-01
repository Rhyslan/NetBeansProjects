/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nestedloops;

/**
 *
 * @author dylan
 */
public class NestedLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Display the table heading
        System.out.println("          Multiplication Table");
        
        // Display the number title
        System.out.print("  ");
        for (int j = 1; j <= 9; j++)
            System.out.print("   " + j);
        
        System.out.println("\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
        
        // Print table body
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + "|");
            for (int j = 1; j <= 9; j++) {
                // Display the product and align properly
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
    
}
