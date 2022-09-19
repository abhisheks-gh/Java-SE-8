package com.arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] temp = arr;
        arr = new int[4];

        /** The arraycopy() method of Java System class returns or copies a subsequence
            components of a specified source array, begins at a specified position
            (referred as"srcPos") of source array(referred as "src") to the specified position
            (referred as "destPos") of destination array (referred as "dest"). The "length"
            argument is for number of components to be copied. */
        System.arraycopy(temp, 0, arr, 0, temp.length);
        
        temp = null;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
