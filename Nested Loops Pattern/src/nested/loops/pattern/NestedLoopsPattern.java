/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nested.loops.pattern;

/**
 *
 * @author dylan
 */
public class NestedLoopsPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j =1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
