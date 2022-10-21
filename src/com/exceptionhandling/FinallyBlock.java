package com.exceptionhandling;

/** The try block doesn't allow to execute the code after the offending line.
 *  In some cases, there is code that we want to execute, no matter what the
    circumstances.
 *  Say, for example, that our application had a connection to a database or
    a file.
 *  Even after an exception is caught, we want the connection released. */

public class FinallyBlock {
    public static void main(String[] args) {
        try {
            String str = "A char string";
            System.out.println("Before problem");
            char ch = str.charAt(20);
            System.out.println("After problem");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Hey - your string's not that big!");
        } finally {
            System.out.println("Say Good night Grace!");
        }
    }
}