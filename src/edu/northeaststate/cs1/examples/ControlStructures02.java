/**
 * -------------------------------------------------
 * File Name: ControlStructures02.java
 * Project Name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples;

import java.util.Scanner;

/**
 * Class Name: ControlStructures02
 * Purpose: Demonstrates a simple if-else control structure
 */
public class ControlStructures02 {
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

        //Prints a different message depending on user input
        if(value > 0){
            System.out.println("The integer value " + value + " is greater than 0." );
        }else{
            System.out.println("The integer value " + value + " is less than 1." );
        }
    }
}
