/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pyramid.print;

/**
 *
 * @author dylan
 */
import java.util.Scanner;

public class PyramidPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines (1-15): ");
        int n = input.nextInt();
        if (n < 1 || n > 15) {
            System.out.println("Error: the number of lines must be between 1 and 15 (inclusive)");
            return;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
