/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newline;

/**
 *
 * @author dylan
 */
public class NewLine {

    /**
     * @param args the command line arguments
     */
    
    public static void newLine(){
        System.out.println();
    }
    
    public static void threeLine() {
        newLine();
        newLine();
        newLine();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("First line.");
        threeLine();
        System.out.println("Second line.");
    }
    
}
