package com.arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        // 2D-Array
        String[][] array = new String[3][2];
        array[0][0] = "Paul";
        array[0][1] = "612-555-1212";
        array[1][0] = "Scott";
        array[1][1] = "612-555-1214";
        array[2][0] = "Tom";
        array[2][1] = "612-555-1216";
        System.out.println("Length of 1st dimension: " + array.length);
        System.out.println("Length of 2nd dimension: " + array[0].length);

        // Printing the values
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}