/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demoincrement;

/**
 *
 * @author dylan
 */
public class DemoIncrement2 {

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
        
        int w = 17, x = 17, y = 18;
        boolean compare1 = (++w == y);
        boolean comapre2 = (x++ == y);
        
        System.out.println("First compare is " + compare1);
        System.out.println("Second compare is " + comapre2);
    }
    
}
