/**
 * -------------------------------------------------
 * File Name: Strings.java
 * Project Name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * -------------------------------------------------
 */
package edu.northeaststate.cs1.examples;

/**
 * Class Name: Strings
 * Purpose: Demonstrates Java String class
 */
public class Strings {
    /**
     * Method Name: main
     * Method Description: entry point for the program
     * @param args not used in this program
     */
    public static void main(String[] args) {
        String message1 = "Hello World";
        String message2 = "Nice To Meet You";
        System.out.println(message1);
        System.out.println(message1 + message2);
        System.out.println(message1.toLowerCase() + message2.toUpperCase());
    }
}
