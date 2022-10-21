package com.exceptionhandling;

/** A throwable object is given as an argument to each catch block.
 *  That object may contain useful information to both the application and the developer.
 *  Each throwable has a set of methods that allow us to access that information within the catch block */

/** Some commonly used throwable methods are:
 * getCause(): Returns the cause of this throwable or null if the cause is nonexistent or unknown.
 * getMessage(): Returns the detailed message string of this throwable.
 * getStackTrace(): Provides programmatic access to the stack trace information printed by the
                    print stack trace.
 * printStackTrace(): Prints the throwable and its backtrace to the standard error stream. */


/** In the catch block, these methods can be used to log issues and possibly diagnose the problem in order
    to take other appropriate actions. */
public class ExceptionObject {
    public static void main(String[] args) {
        try {
            String str = "A char string";
            System.out.println("Before problem");
            char ch = str.charAt(20);
            System.out.println("After problem");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Problem in main: " + e.getMessage());
            e.printStackTrace();
        }
    }
}