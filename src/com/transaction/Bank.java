package com.transaction;

/** Contains attributes and methods use to perform general operations in a bank. */
public class Bank {

    public static void main(String[] args) {
        Account myAcct = new Account();
        double proposedLoan = 250.00;
        String customerName = "Jason Shapiro";
        discountLoan(proposedLoan);
        System.out.println(proposedLoan);
        debitFee(myAcct);
        System.out.println(myAcct.balance);
        salutation(customerName);
        System.out.println(customerName);
    }

    /** Computes the amount that is already reduced by the interest and other charges.
        and deducts it from the total loan amount. */
    // Pass by value: Primitives
    public static void discountLoan(double x) {
        x = x * 0.95;   // 237.50
    }

    /** Deducts some amount on every debit from current account balance. */
    /** @pragma acct: Copies the reference of myAcct into acct
     *  As a result, myAcct and acct will be pointing to the same object in heap memory. */
    // Pass by value: Objects
    public static void debitFee(Account acct) {
        acct.balance = acct.balance - 2.50; // 97.50
    }

    /** Address the person who's being referred. */
    public static void salutation(String aName) {
        aName = "Dear " + aName; // Dear Jason Shapiro
    }

}