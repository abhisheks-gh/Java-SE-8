package com.collections.comparableandcomparator;

import java.util.Comparator;

/** Comparator can be used to compare any two objects.
 *  The comparator is useful when comparing elements of a heterogeneous
    collection and third-party classes we don't have the source to. */

public class MyDateComparator implements Comparator {
    private int day, month, year;
    public MyDateComparator(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int compare(Object o1, Object o2) {
        MyDateComparator d1 = (MyDateComparator) o1;
        MyDateComparator d2 = (MyDateComparator) o2;

        // Sorts MyDate objects in ascending order (oldest to youngest)
        // returns -ve value means -> should come before
        // returns 0 means -> equivalent value
        // returns +ve value means -> should come after

        // If it's not the same year, it is checked that which year comes first
        if (d1.year != d2.year) {
            return d1.year - d2.year;
        }
        // If it's not the same month, it is checked that which month comes first
        if (d1.month != d2.month) {
            return d1.month - d2.month;
        }
        // If it's not the same day, it is checked that which day comes first
        if (d1.day != d2.day) {
            return d1.day - d2.day;
        }
        return 0;
    }
}