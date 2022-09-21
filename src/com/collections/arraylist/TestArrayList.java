package com.collections.arraylist;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add("World");
        System.out.println(list);   // Output: [Hello, World]
        /** The comma-separated list with [] display is a result of the collection API
            overriding toString() */
    }
}