package com.collections.map;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

/** A Red-Black tree based NavigableMap implementation. The map is sorted according to the natural ordering of its keys,
    or by a Comparator provided at map creation time, depending on which constructor is used.
 *  This implementation provides guaranteed log(n) time cost for the containsKey, get, put and remove operations. */
public class TestTreeMap {
    public static void main(String[] args) {
        Map map = new TreeMap();
        LocalDate now = LocalDate.now();
        LocalDate newYear = LocalDate.of(2023, 1, 1);
        LocalDate taxDay = LocalDate.of(2022, 11, 1);
        LocalDate xyz = LocalDate.of(2024, 12, 30);
        map.put("today", now);                  // key value pairs are used to add
        map.put("newYear", newYear);
        map.put("taxDay", taxDay);
        map.put("Abc", xyz);
        System.out.println(map);
    }
}