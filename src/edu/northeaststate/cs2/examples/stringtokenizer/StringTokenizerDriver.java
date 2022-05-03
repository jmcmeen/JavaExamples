package edu.northeaststate.cs2.examples.stringtokenizer;
/**
 * -------------------------------------------------
 * File name: StringTokenizer.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: Joshua Nanney, John McMeen
 * Email: jnanney2@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 * -------------------------------------------------
 */

import java.util.StringTokenizer;

/**
 * Class name: StringTokenizerDriver
 * Purpose: Runs several examples of how StringTokenizer can be used.
 */
public class StringTokenizerDriver {
    /**
     * Method name: main
     * Description: Entry point of the program
     */
    public static void main(String[] args) {
        // Creating a new string tokenizer under "st1".
        StringTokenizer st1 = new StringTokenizer(
                "The dog is very thirsty");
        // Printing the number of tokens the string was split into.
        System.out.println("This string has " + st1.countTokens() + " tokens");
        // A While loops that repeatedly checks for more tokens, and then prints the next if a token is found.
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }
        // New line
        System.out.println();

        // All 3 of StringTokenizer's parameters are being used here: the string, the delimiter, and the delimiter return check.
        StringTokenizer st2 = new StringTokenizer(
                "Of course the moon landing was faked. It doesn't even exist!",
                "o",
                true);
        System.out.println("This string has " + st2.countTokens() + " tokens");
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }
        System.out.println();

        // Multiple delimiter example.
        StringTokenizer st3 = new StringTokenizer(
                "Hello. This is Harry, and he's pleased to meet you.",
                ",.'");
        System.out.println("This string has " + st3.countTokens() + " tokens");
        while (st3.hasMoreTokens()) {
            System.out.println(st3.nextToken());
        }
        System.out.println();

        // Delimiter case example.
        StringTokenizer st4 = new StringTokenizer(
                "OOoOOooOoo I'm a ghost!",
                "o");
        System.out.println("This string has " + st4.countTokens() + " tokens");
        while (st4.hasMoreTokens()) {
            System.out.println(st4.nextToken());
        }
    }
}
