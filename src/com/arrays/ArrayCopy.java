package com.arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] temp = arr;
        arr = new int[4];
        System.arraycopy(temp, 0, arr, 0, temp.length);
        temp = null;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
