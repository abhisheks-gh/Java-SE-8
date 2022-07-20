package com.acmeordersystem.utils;

 /*
 Note: Java already have predefined classes for this purpose.
 import java.util.Date;
 import java.util.Calendar;
  */

public class MyDate {
    public int day;
    public int month;
    public static int year;
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

    /** Checks which years are leap years */
    public static void leapYears() {
        /**
        Some simple calculators use a basic
        loop. Other more accurate calculators use a loop and modulus operator,
        shown in the formula below.
         Every year that is divisible by four is a leap year.
         Of those years, if it can be divided by 100, it is NOT a leap year,
           unless the year is divisible by 400. Then it is a leap year.
         */

        for (year = 1752; year <= 2020; year++) {
            // Leap years
            if (year % 4 == 0 && year % 100 != 0)
                System.out.println("The year " + year + " is a leap year");
            else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                System.out.println("The year " + year + " is a leap year");
            }
        }
    }

}
