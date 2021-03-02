/**
 * -------------------------------------------------
 * File name: AppendFile.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Mar 1, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.txtfiles;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Example application to demonstrate appending data to a text file
 */
public class AppendFile {
    /**
     * Entry point to the application
     * @param args command lin arguments
     */
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("src/edu/northeaststate/cs2/examples/txtfiles/test3.txt", true);
            myWriter.write("Append\nthis\non\nnew\nlines\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}