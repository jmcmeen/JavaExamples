/**
 * -------------------------------------------------
 * File name: DecimalFormatting.java
 * Project name: CS1 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 12, 2021
 * Last Updated By: Kayleigh Post
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples;

import java.text.DecimalFormat;

public class DecimalFormatting {
    public static void main(String[] args) {
        float myFloat = 15.2394872f;
        double myDouble = 9.541269873541265;

        //using String.format where %.2f is the placeholder and the formatting designation
        System.out.println(String.format("The value of myFloat = %.2f", myFloat));
        System.out.println(String.format("The value of myDouble = %.2f", myDouble));

        //using DecimalFormat object (advanced)
        DecimalFormat dc = new DecimalFormat("#.##");
        System.out.println("The values of myFloat = " + dc.format(myFloat));
        System.out.println("The values of myDouble = " + dc.format(myDouble));
    }
}
