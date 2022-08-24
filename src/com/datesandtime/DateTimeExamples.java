package com.datesandtime;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeExamples {

    public static void p(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        // LocalDate objects are immutable just like Strings
        // So they can't be changed
        LocalDate now = LocalDate.now();
        p(now);
        LocalDate hireDate = LocalDate.of(2008, Month.APRIL, 21);
        p(hireDate);
        LocalDate aWeekFromNow = now.plusWeeks(1); p(aWeekFromNow);
        LocalDate aWeekAgo = now.minusWeeks(1); p(aWeekAgo);

        // But we can change the reference
        now = now.minusWeeks(1); p(now);

        System.out.println( hireDate.isBefore(now) );
    }
}
