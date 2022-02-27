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

/**
 * Class Name: ContainerFullException
 * Purpose: Custom extended Exception class to be thrown when a container is full
 */
public class ContainerFullException extends Exception {
    /**
     * Method Name: ContainerFullException
     * Method Description: Default constructor, calls super class constructor and passes in an Exception message
     */
    public ContainerFullException() {
        super("This container is full!");
    }
}
