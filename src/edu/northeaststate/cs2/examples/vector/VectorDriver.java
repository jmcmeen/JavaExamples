/**
 * -------------------------------------------------
 * File name: VectorDriver.java
 * Created by: Brandon Linkous
 *             John McMeen
 * Email: blinkou2@stumail.northeaststate.edu
 *        jnmcmeen@northeaststate.edu
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.vector;

import java.util.Vector;
/**
 *
 * Class Name: VectorDriver
 * Purpose: Utilizes vector class
 */
class VectorDriver {
    /**
     * Method Name: main
     * Method Description: Entry point for the application
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Vector<String> mammals= new Vector<>();

        // Using the add() method
        mammals.add("Dog");
        mammals.add("Horse");

        // Using index number
        mammals.add(2, "Cat");
        System.out.println("Vector: " + mammals);

        // Using addAll()
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(mammals);
        System.out.println("New Vector: " + animals);
    }
}