/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chainedconditionals;

/**
 *
 * @author dylan
 */
public class ChainedConditionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 5;
        if (x > 0) {
            System.out.println("x is positive");
        }
        else if (x < 0) {
            System.out.println("x is negative");
        }
        else {
            System.out.println("x is zero");
        }
        
        double score = 80.5;
        char grade;
        if (score >= 90.0) {
            grade = 'A';
        }
        else if (score >= 80.0) {
            grade = 'B';
        }
        else if (score >= 70.0) {
            grade = 'C';
        }
        else if (score >= 60.0) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
    }
    
}
