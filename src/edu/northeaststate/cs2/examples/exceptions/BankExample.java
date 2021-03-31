//https://www.tutorialspoint.com/java/java_exceptions.htm

package edu.northeaststate.cs2.examples.exceptions;

public class BankExample {
    public static void main(String[] args) {
        System.out.println("Banking App Online");
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
    }
}
