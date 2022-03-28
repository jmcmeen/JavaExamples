/**
 * -------------------------------------------------
 * File Name: AssociationDriver.java
 * Project Name: CS2 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1020
 * -------------------------------------------------
 */

package edu.northeaststate.cs2.examples.relationships;

import java.util.Random;

/**
 * Demonstrates a Association between AssociationDriver and Random
 */
public class AssociationDriver {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt());
    }
}
