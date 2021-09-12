/**
 * -------------------------------------------------
 * File Name: ControlStructures03.java
 * Project Name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples;

import java.util.Scanner;

/**
 * Class Name: ControlStructures03
 * Purpose: Demonstrates a simple if-else control structure
 */
public class ControlStructures03 {
    /**
     * Method Name: main
     * Method Description: entry point for the program
     * @param args not used in this program
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
        }else if (value < 0){
            System.out.println("The integer value " + value + " is less than 0." );
        }else{
            System.out.println("The integer value " + value + " is equal to 0." );
        }
    }
}
