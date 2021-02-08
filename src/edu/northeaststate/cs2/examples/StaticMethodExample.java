/**
 * -------------------------------------------------
 * File name: StaticMethodExample.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 2, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples;

import edu.northeaststate.cs2.dndstarter.util.SimpleDiceRoller;

/**
 * <b>Purpose: Demonstrates static methods
 * - Public methods: main
 * </b>
 * <hr>
 * Date created: Feb 2, 2021
 * <hr>
 * @author John McMeen
 */
public class StaticMethodExample {
    /**
     * Method description: Main method for application
     * Date: Feb 2, 2021
     * @return void
     */
    public static void main(String[] args) {
        //Classes with static methods do no require you to create an object first

        //The SimpleDiceRoller class has a static method named roll
        //Just use the name of the class and the method you want to call
        //Roll a D20 5 times
        for (int i = 0; i < 5; i++) {
            System.out.println("D20 = " + SimpleDiceRoller.roll(20));
        }

        System.out.println();

        //You can create an object of that class, but it is not necessary
        SimpleDiceRoller d = new SimpleDiceRoller();
        for (int i = 0; i < 5; i++) {
            System.out.println("D20 = " + SimpleDiceRoller.roll(20));
        }
    }
}
