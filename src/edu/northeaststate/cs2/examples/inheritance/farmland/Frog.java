/**
 * -------------------------------------------------
 * File Name: Frog.java
 * Project Name: CS2 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.inheritance.farmland;

/**
 * Class Name: Frog
 * Purpose: Extends abstract Animal class and implements the makeSound method
 */
public class Frog extends Animal{
    public Frog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "It's not easy being green, ribbit.";
    }
}
