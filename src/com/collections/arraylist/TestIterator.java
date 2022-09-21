package com.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestIterator {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        /** Iterator:
         * Iterator only have 3 methods:
         * public boolean hasNext()
         * public Object next()
         * public void remove()

         * For back and forth movement, we use a different object called ListOperator
         */
        list.add("Hello");     // English
        list.add("नमस्ते");      // Hindi
        list.add("こんにちは"); // Japanese
        list.add("你好");      // Chinese

        // list.iterator() returns an iterator object (list here is name of the list)
        Iterator iter = list.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("----------------------");
        /** A ListIterator is only available for list (not all Collections) */
        ListIterator li = list.listIterator();
        System.out.println("Now using ListIterator");
        System.out.println("----------------------");

        while(li.hasNext()) {
            System.out.println(li.next());
        }

        System.out.println("----------------------");

        while (li.hasPrevious()) {
            System.out.println(li.previous());
        }
    }
}
