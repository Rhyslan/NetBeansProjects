/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unit_3.outcome_1;

/**
 *
 * @author dylan
 */
import java.nio.file.*;
import java.io.*;
import java.util.Arrays;

public class Unit_3Outcome_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path file = Paths.get("C:/Users/dylan/School/Year 12/Software Development/NetBeansProjects/Unit_3-Outcome_1/src/unit_3/outcome_1/record.txt");
        System.out.print(file);
        
        String[] splitArray = null;
        String s = "";
        String delimiter = ",";
        try {
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader;
            reader = new BufferedReader(new InputStreamReader(input));
            System.out.println();
            s = reader.readLine();
            while (s != null) {
                splitArray = s.split(delimiter);
                s = reader.readLine();
            }
            reader.close();
        }
        catch (IOException e) {
            System.out.println("Message: " + e);
        }
    }
    
}
