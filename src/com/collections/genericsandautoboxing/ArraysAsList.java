package com.genericsandautoboxing;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        /** The Arrays class has a helper method to turn a varargs collection into a List:  */
        //  Arrays.asList(T... elements)
        List<LocalDate> dates = Arrays.asList(LocalDate.of(2022, 1, 1),
                                    LocalDate.of(2022, 4, 1));

        /** Since a method that declares a vararg parameter may also accept an array argument,
            the following is also legal: */
        LocalDate[] datesArray = {LocalDate.of(2020, 2, 1),
                                    LocalDate.of(1980, 10, 3)};
        List<LocalDate> datesList = Arrays.asList(datesArray);

        /** It's illegal to use the inline array initialization syntax if it's not part of the same
            statement as the variable declaration. So the following would be illegal: */
        // List<LocalDate> dates = Arrays.asList( {LocalDate.of(2020, 2, 1), LocalDate.of(1980, 10, 3)} );
    }
}