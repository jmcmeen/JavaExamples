/**
 * -------------------------------------------------
 * File name: StaticMethodExample02.java
 * Project Name: CS2 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.staticmethods;

import java.util.Scanner;
import edu.northeaststate.cs2.dndstarter.util.InputValidation;

/**
 * An application that demonstrates static methods
 */
public class StaticMethodExample02 {
    /**
     * Method Description: Main method for application
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
        parsedInteger = InputValidation.isPositiveInteger(tempInput);

        //while the parsed integer is not positive, keep getting input
        while (parsedInteger == -1) {
            System.out.println(tempInput + " is not a positive integer.");
            System.out.print("Enter a positive integer: ");
            tempInput = keyboard.nextLine();
            parsedInteger = InputValidation.isPositiveInteger(tempInput);
        }

        System.out.println(parsedInteger + " is a positive integer.");
        System.out.println("------------------------------------------");

        System.out.print("Enter a positive double: ");
        tempInput = keyboard.nextLine();
        parsedDouble = InputValidation.isPositiveDouble(tempInput);

        //while the parsed double is not positive, keep getting input
        while (parsedDouble == -1) {
            System.out.println(tempInput + " is not a positive double.");
            System.out.print("Enter a positive double: ");
            tempInput = keyboard.nextLine();
            parsedDouble = InputValidation.isPositiveDouble(tempInput);
        }

        System.out.println(parsedDouble + " is a positive double.");
    }
}
