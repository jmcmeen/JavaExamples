/**
 * -------------------------------------------------
 * File name: SimpleDiceRoller.java
 * Project name: DnD Utilities
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Creation date: Apr 5, 2020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.dndstarter.util;

/* Imports */

import java.util.Random;

/**
 * <b>
 * Purpose: SimpleDiceRoller provides methods for rolling dice
 * - Public methods: roll
 * </b>
 * <hr>
 * Date created: Apr 5, 2020
 * <hr>
 *
 * @author John McMeen
 */
public class SimpleDiceRoller {
    /**
     * Method description: Takes an integer for number of side of "dice." Uses
     * Random class to generate a number between 1 and numSides.
     * Date: Apr 5, 2020
     * Parameters: int numSides
     * Return type: int
     */
    public static int roll(int numSides) {
        Random r = new Random();

        return r.nextInt(numSides) + 1;
    }
}
