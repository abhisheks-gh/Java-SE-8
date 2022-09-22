package com.collections.arraylist;

import java.util.ArrayList;

/** The List interface is a subtype (or sub-interface) of the collection interface
 * They maintain the order of the elements they contain.
 * They allow duplicate entries of any given objects.
 * They can be manually sorted.

 * Following are the most common List implementations:
    * ArrayList
    * LinkedList

 * Because Lists are ordered, they also have an index, just like an array.
   The index can be used to get, set and remove elements in the List.
 */
public class List {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Bruce Banner");
        list.add("Barry Allen");
        list.add("Bruce Wayne");
        list.add("Clark Kent");
        System.out.println(list);

        list.set(0, "Roamed");
        list.set(1, "Gotham City");
        list.set(2, "Metropolis");
        System.out.println(list);

        // We can only set things, where something already exists.
        // In other words, we can only replace things.
        // list.set(4, "xyz");  // This will give "Out of Bound" exception

        list.remove(2); // OR list.remove("Metropolis");
        System.out.println(list);
    }
}