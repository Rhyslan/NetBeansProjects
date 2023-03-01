/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package converttheloop;

/**
 *
 * @author dylan
 */
public class ConvertTheLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        long sum = 0;
        for (int i=0; i<=1000; i++)
            sum = sum + i;
        */
        
        // While loop
        /*
        long sum = 0;
        int i = 0;
        while (i<=1000) {
            sum = sum + i;
            i++;
        }
        */
        
        // Do-while loop
        long sum = 0;
        int i = 0;
        do {
            sum = sum + i;
            i++;
        } while (i<=1000);
        
    }
    
}
