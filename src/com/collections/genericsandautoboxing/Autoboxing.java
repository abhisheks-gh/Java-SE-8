package com.genericsandautoboxing;

import java.util.List;
import java.util.ArrayList;

/** Autoboxing is the automatic conversion the compiler makes between Java primitives
    and their corresponding object wrapper classes. */

public class Autoboxing {
    public static void main(String[] args) {
        // Integer y = new Integer(5);
        Integer x = 5;  // Autoboxing (No need of unboxing / unwrapping)
        System.out.println(x);
        /** Indeed, this compiles and will print 5 at runtime!
         *  The underlying bytecode that is generated in the .class file is the same.
         *  Autoboxing just provides a syntactical sugar coating. */
        List<Integer> primes = new ArrayList<Integer>();
        primes.add(1);
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        int z = primes.get(1);
        System.out.println(z);
    }
}