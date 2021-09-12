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
 * Purpose: Demonstrates a simple input loop using a do-while loop
 */
public class InputLoop01 {
    /**
     * Method Name: main
     * Method Description: entry point for the program
     * @param args not used in this program
     */
    public static void main(String[] args) {
        //create program variables and Scanner for user input
        int numDice, numSides;
        Scanner scanner = new Scanner(System.in);

        do{
            //Prompt the user to enter a number of dice to roll
            System.out.print("Enter num dice: ");
            numDice = scanner.nextInt();

            //If the user enters a value greater than 0
            if(numDice > 0){
                //Then prompt the user to enter number of sides on dice
                System.out.print(" Enter num sides: ");
                numSides = scanner.nextInt();

                //TODO: implement dice roller algorithm here
            }
        }while(numDice > 0); //while the user entered a value greater than 0
    }
}
