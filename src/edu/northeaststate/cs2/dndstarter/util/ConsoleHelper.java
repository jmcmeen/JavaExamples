/**
 * -------------------------------------------------
 * File name: ConsoleHelper.java
 * Project Name: DnD Utilities
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.dndstarter.util;

import java.util.Scanner;

/**
 * Class Name: ConsoleHelper
 * Purpose: ConsoleHelper provides static methods for interacting with the console
 */
public class ConsoleHelper {
    /**
     * Method Name: pressEnterToContinue
     * Method Description: Prints message to user and waits for Enter key to be pressed, uses Scanner class
     */
    public static void pressEnterToContinue() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Press <ENTER> to continue.");
        keyboard.nextLine();
    }
}
