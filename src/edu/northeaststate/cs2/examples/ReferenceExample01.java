/**
 * -------------------------------------------------
 * File name: ReferenceExample01.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 6, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples;

/**
 * <b>Purpose: Demonstrates primitive data type
 * - Public methods: main
 * </b>
 * <hr>
 * Date created: Feb 6, 2021
 * <hr>
 * @author John McMeen
 */
public class ReferenceExample01 {
    /**
     * Method description: Main method for application
     * Date: Feb 2, 2021
     * @return void
     */
    public static void main(String[] args) {
        //Create an int
        int a = 42;

        System.out.println("a = " + a);

        //Integers are primitive types which always has a value, can not be null
        int b = a;

        System.out.println("b = " + b);

        a = a - 5;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}


