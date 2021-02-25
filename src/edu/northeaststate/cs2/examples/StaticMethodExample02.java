/**
 * -------------------------------------------------
 * File name: StaticMethodExample02.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 2, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples;

import java.util.Scanner;
import edu.northeaststate.cs2.dndstarter.util.Helper;

/**
 * An application that demonstrates static methods
 */
public class StaticMethodExample02 {
    /**
     * Method description: Main method for application
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String tempInput;
        int parsedInteger;
        double parsedDouble;

        //Classes with static methods do no require you to create an object first
        //The Helper class has a static method named isPositiveInteger
        //Just use the name of the class and the method you want to call
        System.out.print("Enter a positive integer: ");
        tempInput = keyboard.nextLine();

        //while the parsed integer is not positive, keep getting input
        while ((parsedInteger = Helper.isPositiveInteger(tempInput)) == -1) {
            System.out.println(tempInput + " is not a positive integer.");
            System.out.print("Enter a positive integer: ");
            tempInput = keyboard.nextLine();
        }

        System.out.println(parsedInteger + " is a positive integer.");
        System.out.println("------------------------------------------");

        System.out.print("Enter a positive double: ");
        tempInput = keyboard.nextLine();

        //while the parsed double is not positive, keep getting input
        while ((parsedDouble = Helper.isPositiveDouble(tempInput)) == -1) {
            System.out.println(tempInput + " is not a positive double.");
            System.out.print("Enter a positive double: ");
            tempInput = keyboard.nextLine();
        }

        System.out.println(parsedDouble + " is a positive double.");
    }
}
