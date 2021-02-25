/**
 * -------------------------------------------------
 * File name: Shape.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 24, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.inheritance.shapes;

/**
 * Creates a generic super class to demonstrate inheritance and polymorphism
 */
public abstract class Shape {
    /**
     * Abstract method for calculating area, each subclass will need to define it's own
     * @return the area of the shape
     */
    public abstract double calculateArea();
}
