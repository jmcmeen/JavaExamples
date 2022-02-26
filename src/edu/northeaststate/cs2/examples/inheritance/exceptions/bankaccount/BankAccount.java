/**
 * -------------------------------------------------
 * File Name: BankAccount.java
 * Project Name: CS2 Examples
 * Created By: John McMeen
 * Email: jnmcmeen@northeaststate.edu
 * Course & Section: CISP 1020
 * -------------------------------------------------
 */

package edu.northeaststate.cs2.examples.inheritance.exceptions.bankaccount;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0.0;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(Double.compare(this.balance, amount) < 0){
            throw new InsufficientFundsException();
        }else{
            this.balance -= amount;
        }
    }

    public double getBalance(){
        return this.balance;
    }
}
