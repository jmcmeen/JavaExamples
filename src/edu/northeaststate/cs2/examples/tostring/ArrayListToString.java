/**
 * -------------------------------------------------
 * File name: ArrayListToString.java
 * Project Name: CS2 Examples
 * -------------------------------------------------
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 6, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.tostring;

import edu.northeaststate.cs2.examples.commonmodels.Item;

import java.util.ArrayList;
/**
 * <b>Purpose: Demonstrates ArrayList toString
 * - Public methods: main
 * </b>
 * <hr>
 * Date created: Feb 2, 2021
 * <hr>
 * @author John McMeen
 */
public class ArrayListToString {
    /**
     * Entry point for application
     * @param args
     */
    public static void main(String[] args) {
        //Relying on ArrayList's toString method, which calls each objects toString
        //Notice in the output the placement of the brackets, created by ArrayList's toString
        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item("Wand of the Doomed", 256));
        items.add(new Item("Leather Gloves",32));

        System.out.println(items);

        System.out.println("----------------------------------");

        //Or manually loop through each test in tests ArrayList giving you more control of output
        for (Item t : items) {
            System.out.print(t.toString() + " "); //each test on a line
        }
    }
}


