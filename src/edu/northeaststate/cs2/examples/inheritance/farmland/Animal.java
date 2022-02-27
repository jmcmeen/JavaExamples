/**
 * -------------------------------------------------
 * File Name: Animal.java
 * Project Name: CS2 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.inheritance.farmland;

/**
 * Class Name: Animal
 * Purpose: Abstract class that defines an Animal model to be extended
 */
public abstract class Animal {
    private String name;

    /**
     * Method Name: Animal
     * Method Description: Default constructor
     * @param name
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Method Name: getName
     * Method Description: Returns an Animal's name attribute
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Method Name: makeSound
     * Method Description: An abstract method for making a sound to be defined in extended class. Returns sound in
     * String format
     * @return String
     */
    public abstract String makeSound();
}
