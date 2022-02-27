/**
 * -------------------------------------------------
 * File name: ConsoleHelper.java
 * Project Name: DnD Utilities
 * -------------------------------------------------
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Apr 5, 2020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.dndstarter.util;

/* Imports */

import java.util.Scanner;

/**
 * <b>
 * Purpose: ConsoleHelper provides static methods for interacting with the console
 * - Public methods: pressEnterToContinue
 * </b>
 * <hr>
 * Date created: Apr 5, 2020
 * <hr>
 *
 * @author John McMeen
 */
public class ConsoleHelper {
    /**
     * Method description: Prints message to user and waits for Enter key to be pressed, uses Scanner class
     * Date: Apr 5, 2020
     * Parameters: None
     * Return type: None
     */
    public static void pressEnterToContinue() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Press <ENTER> to continue.");
        keyboard.nextLine();
    }
}
