/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package average;
import java.util.Scanner;

/**
 *
 * @author dylan
 */
public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("First Number: ");
        double a = in.nextDouble();
        System.out.print("Second Number: ");
        double b = in.nextDouble();
        System.out.print("Third Number: ");
        double c = in.nextDouble();
        
        double output = a * b * c;
        output /= 3;
        
        System.out.print("Average: ");
        System.out.println(output);
        
    }
    
}
