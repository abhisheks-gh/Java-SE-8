package com.acmeordersystem.utils;

 /*
 Note: Java already have predefined classes for this purpose.
 import java.util.Date;
 import java.util.Calendar;
  */

public class MyDate {
    private int day;
    private int month;
    private static int year;
    private boolean leapYear = true;

    // getters
    public int getDay() { return day; }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean isLeapYear() {
        return leapYear;
    }

    // setters
    public void setDay(int day) {
        if (valid(day, this.month, MyDate.year)) {
            this.day = day;
        }
    }

    public void setMonth(int month) {
        if (valid(this.day, month, MyDate.year)) {
            this.month = month;
        }
    }

    public void setYear(int year) {
        if (valid(this.day, this.month, year)) {
            MyDate.year = year;
        }
    }

    public void setLeapYear(boolean leapYear) {
        this.leapYear = leapYear;
    }

    /** No-args constructor so that the default constructor of the class can be used. */
    public MyDate() {}

    // Constructor
    public MyDate(int m, int d, int y) {
        setDate(m, d, y);
    }

    // Created object of MyDate class
    MyDate myDate;


    /** Checks whether a date is valid or not. */
    private boolean valid(int day, int month, int year) {
        boolean isValid = true;
        if (day > 31 || day < 1 || month > 12 || month < 1) {
            isValid = false;
        } else {
            switch (month) {
                case 4: case 6: case 9: case 11:
                    isValid = (day <= 30); break;
                case 2:
                    isValid  = (day <= 28 || (day == 29 && year % 4 == 0));
            }
        }
        return isValid;
    }

    /** Displays date */
    public String toString() {
        return month + "/" + day + "/" + year;
    }

    /** Resets date */
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

        MyDate leapYear = new MyDate();

        for (year = 1752; year <= 2020; year++) {
            // Leap years
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println("The year " + year + " is a leap year");

            } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                System.out.println("The year " + year + " is a leap year");
            } else {
                boolean leapYearResult = !(leapYear.isLeapYear());      // ** Need to be updated **
            }
        }
    }

}
