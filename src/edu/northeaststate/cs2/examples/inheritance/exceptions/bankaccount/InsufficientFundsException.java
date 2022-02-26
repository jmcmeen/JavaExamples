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

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException() {
        super("Insufficient funds for transaction requested");
    }
}
