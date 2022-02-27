/**
 * -------------------------------------------------
 * File name: SimpleDiceRoller.java
 * Project Name: DnD Utilities
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.dndstarter.util;

import java.util.Random;

/**
 * Class Name: SimpleDiceRoller
 * Purpose: Provides methods for rolling dice
 */
public class SimpleDiceRoller {
    /**
     * Method Name: roll
     * Method description: Takes an integer for number of side of "dice." Uses Random class to generate a
     * number between 1 and numSides.
     * @param numSides
     * @return int
     */
    public static int roll(int numSides) {
        Random r = new Random();

        return r.nextInt(numSides) + 1;
    }
}
