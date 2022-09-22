package com.collections.set;

import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet salesRegion = new HashSet();
        // Add all valid sales region
        salesRegion.add("Minnesota");
        salesRegion.add("Wisconsin");
        salesRegion.add("Iowa");
        salesRegion.add("Minnesota");   // has no effect (Duplicate element)

        String state = "Iowa";
        if (salesRegion.contains(state)) {
            System.out.println("State found");
        }

        // Set don't use / have indices or any kind of order.
        // So, elements can be returned in any order
        System.out.print("List of all sales region: ");
        System.out.println(salesRegion);
    }
}