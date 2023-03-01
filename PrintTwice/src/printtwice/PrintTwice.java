/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printtwice;

/**
 *
 * @author dylan
 */
public class PrintTwice {

    /**
     * @param args the command line arguments
     */
    
    public static void printTwice(String s) {
        System.out.println(s);
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        printTwice("Dont make me say this twice!");
        String argument = "Never sya never";
        printTwice(argument);
        printTwice(17);
    }
    
}
