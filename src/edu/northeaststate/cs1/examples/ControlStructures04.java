/**
 * -------------------------------------------------
 * File Name: ControlStructures04.java
 * Project Name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples;

import java.util.Scanner;

/**
 * Class Name: ControlStructures04
 * Purpose: Demonstrates a simple switch control structure
 */
public class ControlStructures04 {
    /**
     * Method Name: main
     * Method Description: entry point for the program
     * @param args // args is not used in this example
     */
    public static void main(String[] args) {
        //create program variables and Scanner for user input
        Scanner userInput = new Scanner(System.in);
        int value;

        //Prompt the user for a value
        System.out.print("Enter an integer value: ");
        value = userInput.nextInt();

        switch (value){
            case 1:
                System.out.println("The integer value is 1");
                break;
            case 2:
                System.out.println("The integer value is 2");
                break;
            default:
                System.out.println("No case defined for " + value);
                break;
        }
    }
}