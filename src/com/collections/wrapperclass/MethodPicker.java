package com.collections.wrapperclass;

/** Overloading methods: Order of precedence */

/** An array and varargs of the same type are treated as if they are same parameter.
    In other words, having the following two methods appear together in the same class
    is illegal and would not compile:

    public void pickMe(int[] arr) { }
    public void pickMe(int... arr) { }
 */
public class MethodPicker {
    // Method A
    public void pickMe(int x) {
        System.out.println("int");
    }

    // Method B
    public void pickMe(long x) {
        System.out.println("long");
    }

    // Method C
    public void pickMe(Integer x) {
        System.out.println("Integer");
    }

    // Method D
    public void pickMe(int... x) {
        System.out.println("int...");
    }

    // Method E
    public void pickMe(long... x) {
        System.out.println("long...");
    }

    public static void main(String[] args) {
        MethodPicker mp = new MethodPicker();
        int x = 5;
        mp.pickMe(x);
        Long y = Long.valueOf(5);
        mp.pickMe(y);
    }
}