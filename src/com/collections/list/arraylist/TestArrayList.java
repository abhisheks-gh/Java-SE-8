package com.collections.arraylist;

import java.util.ArrayList;

/** An ArrayList implements, indirectly, the List and Collection interfaces.
    By the rules of polymorphism, A reference variable that is an interface
    type may hold a reference of any class that implements that type. */

public class TestArrayList {
    public static void main(String[] args) {
        // Sets the initial capacity to 4
        // ArrayList list = new ArrayList(4);

        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add("World");
        System.out.println(list);   // Output: [Hello, World]
        /** The comma-separated list with [] display is a result of the collection API
         overriding toString() */
        // Prints the size of ArrayList
        System.out.println("Current size: " + list.size());

        // list.remove("World");     // Removes using object
        list.remove(1);        // Removes using index
        System.out.println(list);

        // list.removeAll(list);
        // System.out.println(list);    // Output: []  i.e. empty list

        /** If we try to remove an object that is not the part of the list, then the
         program will complete its execution without any errors or exceptions
         *  The method takes a Collection as an argument. And its purpose is to remove all
         common elements between the list and the collection.
         So, when calling it on a collection, it will remove all elements from the passed
         argument that are also in the collection on which we call removeAll(). */
        // list.remove("Nigga");

        System.out.println( list.contains("Hello") );   // true
        System.out.println( list.contains("hello") );   // false

        /** The purpose of clear() is to remove every single element from the list. */
        list.clear();
        System.out.println(list);   // Output: []
    }
}