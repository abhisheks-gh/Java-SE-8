/** The varargs allows the method to accept zero or multiple arguments.
    Before varargs either we use overloaded method or take an array as the method parameter,
    but it was not considered good because it leads to the maintenance problem. If we don't
    know how many argument we will have to pass in the method, varargs is the better approach. */

/** Limitations to varargs:
 * The use of varargs and the ellipsis (...) can occur only once in a parameter list
 * The varargs type and its ellipsis (...) must always be placed at the end of the parameter list
 * For example, if other arguments are required are of the method, make those arguments the first
   arguments in any parameter list

        public void myMethod(int roll, String name, int...marks) { // body }
 */

package com.arrays;

public class Varargs {
    // Using arrays
    public static void myMethodTakesLotsOfInts(int[] manyInts) {
        for (int i : manyInts) {
            // do work here
        }
    }

    // Using Varargs
    public static void myMethodTakesLotsOfIntsUsingVarargs(int... myInt) {

    }

    public static void main(String[] args) {
        // Using Arrays
        int[] myArgs = {2, 4, 6, 8};
        myMethodTakesLotsOfInts(myArgs);

        // Using Varargs
        myMethodTakesLotsOfIntsUsingVarargs(2, 4, 6, 8);
        myMethodTakesLotsOfIntsUsingVarargs(3, 5, 7);
    }

    /** It is not common practice, but we can also use varargs in our main method -
            public static void main(String... args) {
                // body
            }
      */
}