package edu.northeaststate.cs2.examples.exceptions;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(Double.compare(balance, amount) < 0){
            throw new InsufficientFundsException("Insufficient Funds");
        }else{
            this.balance -= amount;
        }
    }

    public double getBalance(){
        return this.balance;
    }
}
