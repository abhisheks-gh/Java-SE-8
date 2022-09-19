package com.arrays;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        char[] array = {'d', 'a', 'c', 'b'};

        // Arrays.sort() is a static method, so we don't need an instance to call it
        Arrays.sort(array);
        // array after sorting
        System.out.println(array);
    }
}