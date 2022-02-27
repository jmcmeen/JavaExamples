/**
 * -------------------------------------------------
 * File name: ConsoleInput.java
 * Project Name: CS2 Examples
 * -------------------------------------------------
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 26, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.utilities;

import java.util.Scanner;

/**
 * A helper class with static methods for simplifying console input
 */
public class ConsoleInput {
    /**
     * Uses Scanner to get a line of String input from a user
     * @return the String a user enters in the console
     */
    public static String nextString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }

    /**
     * Displays a message and uses Scanner to get a line of String input from a user
     * @param message a message to display as a prompt
     * @return the String a user enters in the console
     */
    public static String nextString(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }
}
