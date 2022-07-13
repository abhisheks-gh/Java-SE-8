package com.acmeordersystem;

 /*
 Note: Java already have predefined classes for this purpose.
 import java.util.Date;
 import java.util.Calendar;
  */

public class MyDate {
    int day, month, year;
    // No-args constructor so that the default constructor of the class can be used.
    public MyDate() {}
    // Constructor
    public MyDate(int m, int d, int y) {
        setDate(m, d, y);
    }
    // Created object of MyDate class
    MyDate myDate;

    // Displays date
    public String toString() {
        return month + "/" + day + "/" + year;
    }

    // Resets date
    public void setDate(int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }
}