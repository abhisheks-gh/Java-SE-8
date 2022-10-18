package com.collections.wrapperclass;

import java.util.List;
import java.util.ArrayList;

public class ValueOf {
    public static void main(String[] args) {
        /** To create a wrapper instance, pass the associated primitive into the
            constructor for the wrapper. */
        List list = new ArrayList();
        int j = 7;
        list.add(Integer.valueOf(j));
        System.out.println(list);
        /** To get the primitive back out of the wrapper object, call the <type>value() method. */
        Integer wrapInt = Integer.valueOf(7);
        int k = wrapInt.intValue();
        Character wrapChar = Character.valueOf('a');
        char c = wrapChar.charValue();
    }
}