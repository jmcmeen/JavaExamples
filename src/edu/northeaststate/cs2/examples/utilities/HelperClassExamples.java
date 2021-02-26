/**
 * -------------------------------------------------
 * File name: HelperClassExamples.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 26, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.utilities;

import edu.northeaststate.cs2.dndstarter.util.SimpleDiceRoller; //from the dndstarter.util package

/**
 * Examples using helper classes with static methods
 */
public class HelperClassExamples {
    /**
     * Entry point for the application
     * @param args command line arguments
     */
    public static void main(String[] args) {
        //ConsoleInput helper class encapsulates methods that use the Scanner class to accept input
        System.out.print("Enter some text: ");
        String s = ConsoleInput.nextString();
        System.out.println(s);

        //This example encapsulates the printed prompt as well
        s = ConsoleInput.nextString("Enter some more text: ");
        System.out.println(s);

        //The SimpleDiceRoller class has a static method named roll
        //Roll a D20 5 times
        for (int i = 0; i < 5; i++) {
            System.out.println("D20 = " + SimpleDiceRoller.roll(20));
        }
    }
}
