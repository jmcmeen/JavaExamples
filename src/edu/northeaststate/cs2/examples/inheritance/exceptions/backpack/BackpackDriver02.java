/**
 * -------------------------------------------------
 * File Name: BackpackDriver02.java
 * Project Name: CS2 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1020
 * -------------------------------------------------
 */

package edu.northeaststate.cs2.examples.inheritance.exceptions.backpack;

import edu.northeaststate.cs2.examples.commonmodels.Item;

/**
 * Class Name: BackpackDriver02
 * Purpose: Demonstrates try/catch blocks using a Backpack model
 */
public class BackpackDriver02 {
    /**
     * Method Name: main
     * Method Description: Entry point for the application
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Backpack backpack = new Backpack(2);

        try {
            backpack.addItem(new Item("Wand of Doom", 8));
            backpack.addItem(new Item("Hammer of Fate", 16));
            backpack.addItem(new Item("Pip's Dagger", 32));
        } catch (ContainerFullException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Are you ready for the next adventure?");
    }
}
