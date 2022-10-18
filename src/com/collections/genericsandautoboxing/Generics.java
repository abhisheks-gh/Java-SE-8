package com.genericsandautoboxing;

import java.util.List;
import java.util.ArrayList;

/** To remove some limitations on collections, powerful new features were added to the syntax
    in Java 5 */

public class Generics {
    public static void main(String[] args) {
        /** Before Java 5 */
        List primes = new ArrayList();
        primes.add(Integer.valueOf(1));
        primes.add(Integer.valueOf(2));
        primes.add(Integer.valueOf(3));
        primes.add(Integer.valueOf(4));
        primes.add(Integer.valueOf(5));
        primes.add(Integer.valueOf(7));
        // In this case, the ArrayList is homogeneous.
        // Yet in order to get an int out of the List, the object must be first cast to an Integer
        // and then extracted from the wrapped object.
        int x = ( (Integer)primes.get(1) ).intValue();

        /** Generics allow us to specify the intended data type to be stored in a reference, in this
            case into the collection */
        /** After Java 5 */
        List<Integer> genericPrimes = new ArrayList<Integer>();
        genericPrimes.add(1);
        genericPrimes.add(2);
        genericPrimes.add(3);
        genericPrimes.add(5);
        genericPrimes.add(7);
        int y = genericPrimes.get(1).intValue();
        // int autoboxed = genericPrimes.get(1);   // Autoboxing
        // System.out.println(autoboxed);
    }
}