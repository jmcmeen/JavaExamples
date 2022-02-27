/**
 * -------------------------------------------------
 * File Name: MrEd.java
 * Project Name: CS2 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1020
 * -------------------------------------------------
 */

package edu.northeaststate.cs2.examples.inheritance.farmland;

/**
 * Class Name: MrEd
 * Purpose: Extends abstract Animal class and implements the makeSound method
 */
public class MrEd extends Horse{
    public MrEd(String name) {
        super(name);
    }

    public String makeSound(){
        return "Willlllburrrr";
    }
}
