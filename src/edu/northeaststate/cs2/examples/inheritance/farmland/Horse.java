/**
 * -------------------------------------------------
 * File Name: Horse.java
 * Project Name: CS2 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1020
 * -------------------------------------------------
 */

package edu.northeaststate.cs2.examples.inheritance.farmland;

/**
 * Class Name: Horse
 * Purpose: Extends abstract Animal class and implements the makeSound method
 */
public class Horse extends Animal{
    public Horse(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "ney ney!";
    }
}
