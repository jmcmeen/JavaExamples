/**
 * -------------------------------------------------
 * File name: InputValidation.java
 * Project Name: Validation Library
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.dndstarter.util;

/**
 * Class Name: InputValidation
 * Purpose: Helper class with static methods for parsing String input
 */
public class InputValidation {

    /**
     * Method Name: isPositiveInteger
     * Method Description: Takes a string and converts it to a positive integer and returns it, if input string is
     * not a positive integer (text or integer < 1) the method will return a -1
     * @param testString
     * @return int
     */
    public static int isPositiveInteger(String testString) {
        int tempInt;

        try {
            tempInt = Integer.parseInt(testString);

            if (tempInt < 1) {
                tempInt = -1;
            }
        } catch (NumberFormatException e) {
            tempInt = -1;
        }

        return tempInt;
    }

    /**
     * Method Name: isPositiveDouble
     * Method Description: Takes a string and converts it to a positive double and returns it, if input string is not a
     * positive double (text or number not greater than 0) the method will return a -1.0
     * @param testString
     * @return double
     */
    public static double isPositiveDouble(String testString) {
        double tempDouble;
        try {
            tempDouble = Double.parseDouble(testString);

            if (!(tempDouble > 0.0)) {
                tempDouble = -1.0;
            }
        } catch (NumberFormatException e) {
            tempDouble = -1.0;
        }

        return tempDouble;
    }
}
