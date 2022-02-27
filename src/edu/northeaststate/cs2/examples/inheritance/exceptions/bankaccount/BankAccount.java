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

/**
 * Class Name: BankAccount
 * Purpose: Models a basic bank account
 */
public class BankAccount {
    private double balance; //remember in practice to never use float or double data type for money

    /**
     * Method Name: BankAccount
     * Method Description: Default constructor, sets balance to 0.0
     */
    public BankAccount() {
        this.balance = 0.0;
    }

    /**
     * Method Name: deposit
     * Method Description: Adds specified amount to balances
     * @param amount
     */
    public void deposit(double amount){
        this.balance += amount;
    }

    /**
     * Method Name: withdraw
     * Method Description: Subtracts specified amount from balance if there are sufficient funds, otherwise throws
     * an InsufficientFundsException
     * @param amount
     * @throws InsufficientFundsException
     */
    public void withdraw(double amount) throws InsufficientFundsException {
        if(Double.compare(this.balance, amount) < 0){
            throw new InsufficientFundsException();
        }else{
            this.balance -= amount;
        }
    }

    /**
     * Method Name: getBalance
     * Method Description: Returns the BankAccount balance attributes
     * @return
     */
    public double getBalance(){
        return this.balance;
    }
}
