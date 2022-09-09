package com.datesandtime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormatDateAndTime {
    public static void p(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        LocalDate now = LocalDate.now(); p(now);
        DateTimFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        p(now.format(dtf));
    }

}