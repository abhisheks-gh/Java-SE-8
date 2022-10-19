package com.collections.comparableandcomparator;

public class MyDate implements Comparable {
    private int day, month, year;
    public MyDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    /** compareTo() takes generic object as parameter */
    // Sorts MyDate objects in ascending order (oldest to youngest)
    // returns -ve value means -> should come before
    // returns 0 means -> equivalent value
    // returns +ve value means -> should come after
    public int compareTo(Object o) {
        MyDate d = (MyDate) o;
        if (year != d.year) {
            return year - d.year;
        }
        if (month != d.month) {
            return month - d.month;
        }
        if (day != d.day) {
            return day - d.day;
        }
        return 0;
    }
}