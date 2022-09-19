package com.arrays;

import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        // Binary Search only works on sorted arrays
        char[] array = {'d', 'a', 'c', 'b'};
        Arrays.sort(array);
        int cIndex = Arrays.binarySearch(array, 'e');
        // Index of char 'c' in array
        System.out.println(cIndex);

        // What if the search value is not found?
        // Expected index of 'e' = 4
        // eIndex = (4 + 1) * -1    // eIndex = -5
        int eIndex = Arrays.binarySearch(array, 'e');

        /** Fills every element with the letter 'z' */
        Arrays.fill(array, 'z');
        System.out.println(array);
    }
}