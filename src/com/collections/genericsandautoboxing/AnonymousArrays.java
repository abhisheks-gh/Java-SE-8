package com.genericsandautoboxing;

import java.util.Arrays;
import java.util.List;
import java.time.LocalTime;

public class AnonymousArrays {
    public static void main(String[] args) {
        /** Anonymous Arrays */
        List<LocalTime> timeList = Arrays.asList( new LocalTime[] {LocalTime.now(),
                                    LocalTime.of(17, 00)} );
    }
}