/**
 * -------------------------------------------------
 * File Name: AssignmentOperators.java
 * Project Name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples;

/**
 * Class Name: AssignmentOperators
 * Purpose: Demonstrates basic assignment operators using integer variables
 * References:
 *      https://www.w3schools.com/java/java_operators.asp
 */
public class AssignmentOperators {
    /**
     * Method Name: main
     * Method Description: entry point for the program
     * @param args not used in this program
     */
    public static void main(String[] args) {
        //Declare some variables to use in this program
        int intOperand1;
        int intOperand2;
        int intResult;

        //Assign values to the integer variables and display
        intOperand1 = 32;
        System.out.println("intOperand1 = " + intOperand1);

        //To add to the variable, you must add to intOperand1 and assign the value back to intOperand1
        intOperand1 = intOperand1 + 5;
        System.out.println("intOperand1 = " + intOperand1);

        //To simplify this, Java provides an addition assignment operator which shortens the addition and assignment statement
        intOperand1 += 5;
        System.out.println("intOperand1 = " + intOperand1);

        //Subtraction assignment works the same way
        intOperand1 -= 5;
        System.out.println("intOperand1 = " + intOperand1);
        
        //The reference linked above has an exhaustive list of assignment operators and their equivalences
    }
}
