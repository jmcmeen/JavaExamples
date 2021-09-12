/**
 * -------------------------------------------------
 * File name: DecimalFormatting.java
 * Project name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * Last Updated By: Kayleigh Post
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples;

import java.text.DecimalFormat;

/**
 * Class Name: DecimalFormatting
 * Purpose: Demonstrates how to format a floating point type using various methods
 */
public class DecimalFormatting {
    /**
     * Method Name: main
     * Method Description: entry point for the program
     * @param args // args is not used in this example
     */
    public static void main(String[] args) {
        //declare some floating point variables and assign them values
        float myFloat = 15.2394872f;
        double myDouble = 9.541269873541265;

        //method 1 using String.format where %.2f is the placeholder and the formatting designation
        System.out.println(String.format("The value of myFloat = %.2f", myFloat));
        System.out.println(String.format("The value of myDouble = %.2f", myDouble));

        //method 2 using DecimalFormat object (advanced)
        DecimalFormat dc = new DecimalFormat("#.##");
        System.out.println("The values of myFloat = " + dc.format(myFloat));
        System.out.println("The values of myDouble = " + dc.format(myDouble));
    }
}
