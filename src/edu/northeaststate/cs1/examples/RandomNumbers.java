/**
 * -------------------------------------------------
 * File name: RandomNumbers.java
 * Project name: CS1 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Aug 30, 2020
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        final int NUM_RANDOM = 20; //create a constant to use for max number of random numbers to generate.
        final int UPPER_BOUND = 10; //used with a Random object as the upper bound, nextInt will generate 0-9

        for(int i = 0; i < NUM_RANDOM; i++){
            System.out.print(random.nextInt(10) + " ");
        }
    }
}
