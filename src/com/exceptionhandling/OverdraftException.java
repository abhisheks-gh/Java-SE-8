package com.exceptionhandling;

/** Creating Exception */

// Consider a banking application where an OverdraftException is needed.
public class OverdraftException extends Exception {
    public OverdraftException(String message) {
        super(message);
    }

    double balance;
    public void withdraw(double amount) throws OverdraftException {
        if (balance - amount < 0) {
            throw new OverdraftException("Insufficient funds");
        }
    }
}