/**
 * -------------------------------------------------
 * File name: ShapeDriver.java
 * Project name: CS2 Examples
 * -------------------------------------------------
 * Creator's name: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course and section: CISP 1020
 * Creation date: Feb 24, 2021
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.inheritance.shapes;

import java.util.ArrayList;

/**
 * Main application for demonstrating inheritance using shapes
 */
public class ShapeDriver {
    /**
     * Entry point for the application
     * @param args command line arguments
     */
    public static void main(String[] args) {
        //Create an array list of shape objects
        ArrayList<Shape> shapes = new ArrayList<>();

        //Create three different objects
        Circle circle = new Circle(1);
        Rectangle rectangle = new Rectangle(2,4);
        Triangle triangle = new Triangle(2,4);

        //Each object inherits from Shape, so they can be added to an ArrayList of shapes
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        //Loop through ArrayList and each Shape's toString method
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
