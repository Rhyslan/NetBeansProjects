/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monte.carlo.simulation;

/**
 *
 * @author dylan
 */
public class MonteCarloSimulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int NUMBER_OF_TRIALS = 10000000; // What is the purpose of this line: to define a constant that specifies the number of iterations the simulation will run for
        int numberOfHits = 0;
        
        for (int i =0; i < NUMBER_OF_TRIALS; i++) {
            double x = Math.random() * 2.0 -1; // Explain this line!: generates a random double value between -1 and 1
            double y = Math.random() * 2.0 -1;
            if (x*x + y*y <= 1) {
                numberOfHits++;
            }
        }
        
        //double pi = 4.0 * (numberOfHits / NUMBER_OF_TRIALS); // This line has an error you will need to fix!
        double pi = (4.0 * numberOfHits) / NUMBER_OF_TRIALS; // Fixed
        System.out.println("pi is " + pi);
    }
    
}
