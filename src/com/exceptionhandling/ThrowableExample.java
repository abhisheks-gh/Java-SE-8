package com.exceptionhandling;

/** A throwable in Java is an event that disrupts the normal flow of a program.
 *  For example, suppose we have a method that needs to connect to a database but what if
    the database is down?

 *  When a problem occurs within a method, the method creates an object and hands it off to
    the runtime system.
 *  That object is called a Throwable object.
 *  Throwable is a class defined in java.lang
 *  The act of sending a Throwable object to runtime system is called "throwing".

 *  There are two general categories or, more precisely, two subclasses of Throwable
    objects:    errors and exceptions.
    *   An Error represents a serious problem that an application should not try to recover from.
        For example, when JVM runs out of memory, it throws OutOfMemoryError.
    *   Exceptions are problems that an application might want to capture, react to, or in some
        cases actually try to recover from. */

public class ThrowableExample extends Throwable {
    // Throwable throwable = new Throwable();
}