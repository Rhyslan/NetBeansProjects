/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loops;

/**
 *
 * @author dylan
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 0;
        while (count < 100) {
            System.out.println("Welcome to Java!");  //This prints the message 100 times
            count++;
        }
        
        int sum = 0, i = 11;
        while (i>10) {
            sum = sum + 1;
            i++;
        }
        System.out.println("Sum is "+sum);   // 'Sum is 45' is displayed
    }
    
}
