/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wind_chill_temp;
import java.util.Scanner;

/**
 *
 * @author dylan
 */
public class Wind_Chill_temp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.print("Outside temp (-58 to 41) (F): ");
        double Ta = in.nextDouble();
        
        System.out.print("Wind speed (Above 2) (m/h): ");
        double v1 = in.nextDouble();
        
        double v = Math.pow(v1, 0.16);
        
        if (Ta < -51.0 || Ta > 41.0 || v1 < 2.0) {
            System.out.println("Please check the input parameters!");
        }
        else {
            double Twc = 35.74 + 0.6215 * Ta - 35.75 * v + 0.4275 * Ta * v;
            System.out.print("Wind-Chill temp: ");
            System.out.println(Twc);
        }
                
        
        
    }
    
}
