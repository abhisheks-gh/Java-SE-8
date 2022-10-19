package com.genericsandautoboxing;

public class DiamondOperator {
    public static void main(String[] args) {
        // Before Java 7
        /** Generics allows us to be more type safe when coding homogeneous collections.
         * Consider the following code: */
        // ArrayList<String> myList = new ArrayList<String>();
        /** Both in typing the reference (myList) and in creating the actual ArrayList
            instance, the type (String) must be specified through generics.
         *  This is a bit redundant. If we are making a reference to an ArrayList of Strings,
            it should be easy enough to assume the actual instance type is an ArrayList of Strings */

        // After Java 7
        /** In Java 7, a new operator, called the diamond operator was added to reduce typing when
            declaring generic types. */
        // New ArrayList declaration
        // ArrayList<String> myList = new ArrayList<>();

        /** The diamond operator can be particularly helpful/useful when declaring data structures
            within data structures. */
        // List<Map<Integer, String>> listOfMaps = new ArrayList<>();
    }
}