/**
 * -------------------------------------------------
 * File Name: ControlStructures01.java
 * Project Name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples;

import java.util.Scanner;

/**
 * Class Name: ControlStructures01
 * Purpose: Demonstrates a simple if control structure
 */
public class ControlStructures01 {
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

        //Prints a message if the user enters 0
        if(value == 0){
            System.out.println("The integer value " + value + " is equal to 0" );
        }
    }
}
