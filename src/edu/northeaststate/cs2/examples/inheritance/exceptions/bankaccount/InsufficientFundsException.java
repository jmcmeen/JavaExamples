/**
 * -------------------------------------------------
 * File Name: InsufficientFundsException.java
 * Project Name: CS2 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1020
 * -------------------------------------------------
 */
package edu.northeaststate.cs2.examples.inheritance.exceptions.bankaccount;

/**
 * Class Name: InsufficientFundsException
 * Purpose: Custom extended Exception class to be thrown when insufficient funds are available for withdraw
 */
public class InsufficientFundsException extends Exception{
    /**
     * Method Name: InsufficientFundsException
     * Method Description: Default constructor, calls super class constructor and passes in an Exception message
     */
    public InsufficientFundsException() {
        super("Insufficient funds for transaction requested!");
    }
}
