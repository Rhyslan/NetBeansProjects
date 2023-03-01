/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switch_statements;

/**
 *
 * @author dylan
 */
public class Switch_Statements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * if (x==0) doSomething0();
         * else if (x==1) doSomething1();
         * else if (x==2) doSomething2();
         * else if (x==3) doSomething3();
         * else if (x==4) doSomething4();
         * else doSomethingElse();
         * 
         * switch (x) {
         *  case 0:
         *      doSomething0();
         *  case 1:
         *      doSomething1();
         *  case 2:
         *      doSomething2();
         *  case 3:
         *      doSomething3();
         *  case 4:
         *      doSomething4();
         *  default:
         *      doSomethingElse();
         */
        
        String comment; // The generated insult
        int which = (int)(Math.random() * 3); //Result is 0, 1 or 2
        
        switch (which) {
            case 0: comment = "You look so much better than usual.";
                break;
            case 1: comment = "Your work is up to its usual standards.";
                break;
            case 2: comment = "You're quite comepent for so litter experience.";
                break;
            default: comment = "Oops -- something is wrong with this code.";
        }
        
        if (which == 0) {
            comment = "You look so much better than usual.";
        } else if (which == 1) {
            comment = "Your work is up to its usual standards.";
        } else if (which == 2) {
            comment = "You're quite comepent for so litter experience.";
        } else {
            comment = "Oops -- something is wrong with this code.";
        }
        
        System.out.println(comment);
    }
    
}
