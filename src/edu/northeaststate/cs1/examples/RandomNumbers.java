/**
 * -------------------------------------------------
 * File name: RandomNumbers.java
 * Project Name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples;

import java.util.Random;

/**
 * Class Name: RandomNumbers
 * Purpose: Demonstrates the use of the Random class
 */
public class RandomNumbers {
    /**
     * Method Name: main
     * Method Description: entry point for the program
     * @param args not used in this program
     */
    public static void main(String[] args) {
        Random random = new Random();
        final int NUM_RANDOM = 20; //create a constant to use for max number of random numbers to generate.
        final int UPPER_BOUND = 10; //used with a Random object as the upper bound, nextInt will generate 0-9
        int currentInt;

        // create a loop to get NUM_RANDOM random integers
        for(int i = 0; i < NUM_RANDOM; i++){
            currentInt = random.nextInt(UPPER_BOUND);
            System.out.print(currentInt + " ");
        }
    }
}
