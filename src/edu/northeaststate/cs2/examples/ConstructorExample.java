/**
 * -------------------------------------------------
 * File name: ConstructorExample.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 6, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples;

/**
 * <b>Purpose: Demonstrate creating objects from Monster class
 * - Public methods: main
 * </b>
 * <hr>
 * Date created: Feb 2, 2021
 * <hr>
 * @author John McMeen
 */
public class ConstructorExample {
    /**
     * Method description: Main method for application
     * Date: Feb 2, 2021
     * @return void
     */
    public static void main(String[] args) {
        //Monster reference
        Monster m;

        //Point monster reference to new Monster using default constructor
        m = new Monster();

        //Since we used a default constructor, none of the attributes of the Monster have been initialized. Java
        //will just give them default values until we set them
        m.setName("Fire Orc");
        m.setHitPoints(24);

        //Let's take a look at our Monster
        System.out.println(m.toString());

        //We can save some lines of code and enforce values to be set at initialization, if we provide an overloaded
        //constructor. Monster has an overloaded constructor that takes name and hit points as parameters and sets
        //the Monster attributes for us (See Monster)

        m = new Monster("Giant Spider", 21);

        //Let's take a look at our Monster
        System.out.println(m.toString());
    }
}
