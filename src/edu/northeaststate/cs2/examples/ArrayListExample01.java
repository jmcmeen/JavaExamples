/**
 * -------------------------------------------------
 * File name: ArrayListExample01.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 2, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples;

import java.util.ArrayList;

/**
 * <b>Purpose: Demonstrates ArrayList functionality with Strings
 * - Public methods: main
 * </b>
 * <hr>
 * Date created: Feb 2, 2021
 * <hr>
 * @author John McMeen
 */
public class ArrayListExample01 {
    /**
     * Method description: Main method for application
     * Date: Feb 2, 2021
     * @return void
     */
    public static void main(String[] args) {
        //create ArrayList of template type String
        ArrayList<String> listOfStrings;

        //ask for memory for ArrayList of Strings
        listOfStrings = new ArrayList<>();

        //the previous lines can be combined, but it is important to remember identifiers
        //for reference types are actually memory addresses
        //ArrayList<String> listOfStrings = new ArrayList<>();

        //unlike arrays, you don't have to state how many items are in the ArrayList before you use it
        listOfStrings.add("\tSuper Mario Bros.");
        listOfStrings.add("\tContra");
        listOfStrings.add("\tMega Man");

        //you can can access each item in the list by index like before
        for(int i = 0; i < listOfStrings.size(); i++){
            System.out.println(listOfStrings.get(i));
        }

        //print a line between examples
        System.out.println();

        //or you can access each with a foreach loop, creating an alias for each element in the list
        for(String currentString: listOfStrings) {
            System.out.println(currentString);
        }
    }
}
