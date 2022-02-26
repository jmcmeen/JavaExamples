/**
 * -------------------------------------------------
 * File Name: BankExample.java
 * Project Name: CS2 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1020
 * -------------------------------------------------
 */

package edu.northeaststate.cs2.examples.inheritance.exceptions.bankaccount;

public class BankExample {
    public static void main(String[] args) {
        System.out.println("Dollar Bank Online");
        BankAccount account = new BankAccount();

        System.out.println("Depositing 500");
        account.deposit(500);
        System.out.println("New balance: " + account.getBalance());

        for (int i = 0; i < 6; i++) {
            System.out.println("Withdrawing 100");

            try {
                account.withdraw(100);
            } catch (InsufficientFundsException e ) {
                System.out.println(e.getMessage());

            }
            System.out.println("New balance: " + account.getBalance());
        }

        System.out.println("Another transaction?");
    }
}
