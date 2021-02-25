/**
 * -------------------------------------------------
 * File name: Rectangle.java
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
 * A geometric rectangle
 */
public class Rectangle extends Shape{
    private double height;
    private double width;

    /**
     * Class constructor specifying height and width of the rectangle
     * @param height rectangle's height in unspecified units
     * @param width rectangle's width in unspecified units
     */
    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    /**
     * Calculates the area of the rectangle
     * @return claculated area
     */
    @Override
    public double calculateArea() {
        return height * width;
    }

    /**
     * Generates a String representation of the rectangle
     * @return generated string
     */
    @Override
    public String toString() {
        return "Rectangle [" +
                "height=" + height +
                ", width=" + width +
                ", area=" + this.calculateArea() + "]";
    }
}
