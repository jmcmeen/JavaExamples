/**
 * -------------------------------------------------
 * File Name: ArithmeticOperators.java
 * Project Name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples;

/**
 * Class Name: ArithmeticOperators
 * Purpose: Demonstrates basic arithmetic operators using integer variables
 */
public class ArithmeticOperators {
    /**
     * Method Name: main
     * Method Description: entry point for the program
     * @param args not used in this program
     */
    public static void main(String[] args) {
        //Create some variables to use in this program
        int intOperand1;
        int intOperand2;
        int intResult;

        //Give the integer variables values
        intOperand1 = 32;
        intOperand2 = 16;

        //Add the values and display result
        intResult = intOperand1 + intOperand2;
        System.out.println(intOperand1 + " + " + intOperand2 + " = " + intResult);

        //Subtract the values and display result
        intResult = intOperand1 - intOperand2;
        System.out.println(intOperand1 + " - " + intOperand2 + " = " + intResult);

        //Multiply the values and display result
        intResult = intOperand1 * intOperand2;
        System.out.println(intOperand1 + " * " + intOperand2 + " = " + intResult);

        //Divide the values and display result
        intResult = intOperand1 / intOperand2;
        System.out.println(intOperand1 + " / " + intOperand2 + " = " + intResult);

        //Modulus the values and display result (remainder)
        intResult = intOperand1 % intOperand2;
        System.out.println(intOperand1 + " % " + intOperand2 + " = " + intResult);
    }
}
