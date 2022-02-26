/**
 * -------------------------------------------------
 * File Name: ContainerFullException.java
 * Project Name: CS2 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.inheritance.exceptions.backpack;

public class ContainerFullException extends Exception {
    public ContainerFullException() {
        super("This container is full.");
    }
}
