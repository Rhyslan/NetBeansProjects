/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divideevenly;

/**
 *
 * @author dylan
 */
public class DivideEvenly {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int LIMIT = 100;
        int var;
        
        System.out.print(LIMIT + " is evenly divisible by ");
        
        for(var = 1; var <= LIMIT; ++var) {
            if(LIMIT % var == 0) {
                System.out.print(var + " ");
            }
        }
        
        System.out.println();
    }
    
}
