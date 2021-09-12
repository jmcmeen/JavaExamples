/**
 * -------------------------------------------------
 * File name: PrimitiveDataTypes.java
 * Project name: CS1 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1010
 * -------------------------------------------------
 */

package edu.northeaststate.cs1.examples;

/**
 * Class Name: PrimitiveDataTypes
 * Purpose: Demonstrates various primitive data types in Java and shows an example of a valid declaration and assignment.
 * References:
 *      https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
 *      https://www.w3schools.com/java/java_data_types.asp
 */
public class PrimitiveDataTypes {
    /**
     * Method Name: main
     * Method Description: entry point for the program
     * @param args // args is not used in this example
     */
    public static void main(String[] args) {
        /**
         * Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals.
         * Valid types are byte, short, int and long. Which type you should use, depends on the numeric value. The minimum
         * and maximum values for each variable type is shown below.
         */
        byte b = 42;  //-128 : 127 (inclusive)
        short s = 365; //-32,768 : 32,767 (inclusive)
        int i = -2000000000;   //-2,147,483,648 : 2,147,483,647 (inclusive)
        long l = 9365965855441554L;  //-9,223,372,036,854,775,808 : 9,223,372,036,854,775,807 (inclusive)


        /**
         * Floating point types represents numbers with a fractional part, containing one or more decimals.
         * There are two types: float and double.- The precision of a floating point value indicates how many digits
         * the value can have after the decimal point. The precision of float is only six or seven decimal digits,
         * while double variables have a precision of about 15 digits. Therefore, it is safer to use double for
         * most calculations.
         */
        float f = -3.6f; //3.4e−038 : 3.4e+038
        double d = 9.80241212;     //1.7e−308 : 1.7e+308

        /**
         * The char data type is used to store a single character. The character must be surrounded by single quotes,
         * like 'A' or 'c':
         */
        char c = 'a';   //encoded using utf-8

        /**
         * A boolean data type is declared with the boolean keyword and can only take the values true or false.
         */
        boolean bool = true;
    }
}