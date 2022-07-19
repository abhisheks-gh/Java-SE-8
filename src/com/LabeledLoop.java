// Use of labels in loop

/**
 * A label is a valid variable name that denotes the name of the loop to where the control of execution should jump.
 * To label a loop, place the label before the loop with a colon at the end. Therefore, a loop with the label is called
   a labeled loop.
 * In layman terms, we can say that label is nothing but to provide a name to a loop. It is a good habit to label a
   loop when using a nested loop. We can also use labels with continue and break statements.
 */

package com;

public class LabeledLoop {

    public static void main(String[] args) {
        outer_label:
        while (true) {
            int z = 0;
            inner_loop:
            while (true) {
                if (z >= 10) {
                    break outer_label;
                } else {
                    System.out.println(z++);
                    break inner_loop;
                }
            }
        }
    }

}