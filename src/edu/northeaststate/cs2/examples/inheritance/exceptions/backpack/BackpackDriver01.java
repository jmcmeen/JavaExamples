/**
 * -------------------------------------------------
 * File Name: BackpackDriver01.java
 * Project Name: CS2 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1020
 * -------------------------------------------------
 */

package edu.northeaststate.cs2.examples.inheritance.exceptions.backpack;

import edu.northeaststate.cs2.examples.commonmodels.Item;

/**
 * Class Name: BackpackDriver01
 * Purpose: Demonstrates unhandled exception causeing program to stop execution
 */
public class BackpackDriver01 {
    /**
     * Method Name: main
     * Method Description: Entry point for the application
     * @param args command line arguments
     */
    public static void main(String[] args) throws ContainerFullException {
        Backpack backpack = new Backpack(2);

        backpack.addItem(new Item("Wand of Doom", 8));
        backpack.addItem(new Item("Hammer of Fate", 16));
        backpack.addItem(new Item("Pip's Dagger", 32));

        //This code won't execute if to many items are entered because the exception will be thrown up one level,
        // in this case that is outside of main so the program will exit
        System.out.println("Are you ready for the next adventure?");
    }
}
