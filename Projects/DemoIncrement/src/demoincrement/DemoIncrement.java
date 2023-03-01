/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demoincrement;

/**
 *
 * @author dylan
 */
public class DemoIncrement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v = 4;
        int plusPlusV = ++v;
        
        v = 4;
        int vPlusPlus = v++;
        
        System.out.println("v is " + v);
        System.out.println("++v is " + plusPlusV);
        System.out.println("v++ is " + vPlusPlus);
    }
    
}
