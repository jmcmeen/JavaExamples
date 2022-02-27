/**
 * -------------------------------------------------
 * File name: ConstructorExample.java
 * Project Name: CS2 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.constructors;

import edu.northeaststate.cs2.examples.models.Monster;

/**
 * Demonstrate creating objects from Monster class
 */
public class ConstructorExample {
    /**
     * Entry point for application
     * @param args
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
