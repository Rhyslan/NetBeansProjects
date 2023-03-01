/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package incometaxpayable;
import java.util.Scanner;

/**
 *
 * @author dylan
 */
public class IncomeTaxPayable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double taxable = in.nextDouble();
        
        double payable = 0.0;
        
        if (taxable >= 180000.0) {
            payable = 54550.0 + (taxable - 180000.0) * 0.45;
        }
        else if (taxable >= 80000.0) {
            payable = 17550.0 + (taxable - 80000.0) * 0.37;
        }
        else if (taxable >= 37000.0) {
            payable = 4650.0 + (taxable - 37000.0) * 0.30;
        }
        else if (taxable >= 6000.0) {
            payable = 0.0 + (taxable - 6000.0) * 0.15;
        }
        else if (taxable >= 0.0) {
            payable = 0.0 + (taxable - 0.0) * 0.00;
        }
        System.out.println(payable);
    }
    
}
