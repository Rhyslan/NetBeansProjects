/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variables1;

/**
 *
 * @author dylan
 */
public class Variables1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String message1;
        int x;
        
        String fistName1; String lastName1; int hour1, minute1;
        
        String firstLine = "Hello, again!"; System.out.println(firstLine);
        
        System.out.print("The value of firstLine is "); System.out.println(firstLine);
        
        int hour2 = 11; int minute2 = 59;
        System.out.print("The current time is ");
        System.out.print(hour2);
        System.out.print(":");
        System.out.print(minute2);
        System.out.println(".");
        
        int hour3, minute3;
        
        String bob = "Hello"; // give bob the value "Hello."
        int hour4 = 11; // asign the value 11 to hour
        int minute4 = 59; // set minute to 59
        char letter = 'W'; // character literals must be surrounded by single quotes
        
        int hour5 = 11;
        int minute5 = 59;
        System.out.print("Number of minutes since midnight: ");
        System.out.println(hour5 * 60 + minute5);
        
        System.out.print("Fraction of the hour has passed: "); System.out.println(minute5 / 60);
        
        System.out.print("Percent of the hour that has passed: "); System.out.print(minute5 * 100 / 60);
        
        double pi;
        pi = 3.14159;
        
        double minute6 = 50.0;
        System.out.print("Fraction of the hour that has passed: "); System.out.println(minute6 / 60.0);
        
        System.out.print("Percent of the hour that has passed: "); System.out.println(minute6 * 100 / 60);
        
        double y = 1.0 / 3.0;
        
        System.out.println(0.1 * 10);
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);
        
        double balance = 123.45; // potential rounding error
        
        int balance2 = 12345; // total number of cents
        
        System.out.println(1 + 2 + "Hello"); // The output is 3Hello
        
        System.out.println("Hello" + 1 + 2); // The output is Hello12
        
        System.out.println(17 * 3);
        
        System.out.println(hour5 * 60 + minute5);
        
        int percentage;
        percentage = (minute5 * 100) / 60;
        
        hour5 = minute5 + 1; // Correct
        // minute5 + 1 = hour5; // Compiler error
        
        
    }
    
}
