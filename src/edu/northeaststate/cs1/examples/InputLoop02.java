/**
 * -------------------------------------------------
 * File Name: InputLoop01.java
 * Project Name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * Last Updated By: Kayleigh Post
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples;

import java.util.Scanner;

/**
 * Class Name: InputLoop01
 * Purpose: Demonstrates a simple input loop using a while loop
 */
public class InputLoop02 {
    /**
     * Method Name: main
     * Method Description: entry point for the program
     * @param args // args is not used in this example
     */
    public static void main(String[] args) {
        //create program variables and Scanner for user input
        int numDice, numSides;
        Scanner scanner = new Scanner(System.in);

        //Prompt the user to enter a number of dice to roll
        System.out.print("Enter num dice: ");
        numDice = scanner.nextInt();

        //While the user enters a value greater than 0
        while(numDice > 0){
            //Then prompt the user to enter number of sides on dice
            System.out.print(" Enter num sides: ");
            numSides = scanner.nextInt();

            //TODO: implement dice roller algorithm here

            //Before we loop back, get numDice again to see if we continue
            System.out.print("Enter num dice: ");
            numDice = scanner.nextInt();
        }
    }
}
