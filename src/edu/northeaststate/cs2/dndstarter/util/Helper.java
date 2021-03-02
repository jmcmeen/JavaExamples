/**
 * -------------------------------------------------
 * File name: Helper.java
 * Project name: Validation Library
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Creation date: Mar 24, 2020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.dndstarter.util;

/**
 * Helper class with static methods for parsing String input
 */
public class Helper {

    /**
     * Takes a string and converts it to a positive integer,
     * if input string is not a positive integer (text or integer < 1) the method will return a -1
     * @param testString input String
     * @return a positive int
     */
    public static int isPositiveInteger(String testString) {
        int x;

        try {
            x = Integer.parseInt(testString);

            if (x < 1) {
                x = -1;
            }
        } catch (Exception e) {
            x = -1;
        }

        return x;
    }

    /**
     * Method description: Takes a string and converts it to a positive double,
     * if input string is not a positive double (text or number not greater than 0) the method will return a -1.0
     * @param testString input String
     * @return a positive double
     */
    public static double isPositiveDouble(String testString) {
        double x;
        try {
            x = Double.parseDouble(testString);

            if (!(x > 0.0)) {
                x = -1.0;
            }
        } catch (Exception e) {
            x = -1.0;
        }

        return x;
    }
}
