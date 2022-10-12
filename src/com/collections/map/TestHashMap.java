package com.collections.map;

import java.util.Map;
import java.util.HashMap;
import java.time.LocalDate;
import java.util.Set;
import java.util.Collection;

public class TestHashMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        LocalDate now = LocalDate.now();
        LocalDate newYear = LocalDate.of(2023, 1, 1);
        LocalDate taxDay = LocalDate.of(2022, 11, 1);
        map.put("today", now);                  // key value pairs are used to add
        map.put("newYear", newYear);
        map.put("taxDay", taxDay);
        System.out.println(map.get("taxDay"));  // get a value by key
        map.remove("newYear");
        System.out.println(map);
        // map.clear();    // removes all key-value pairs from the map
        System.out.println(map.containsKey("abc"));
        System.out.println(map.containsValue(now));

        Set s = map.keySet();           // returns a set containing the key objects in the map
        System.out.println(s);
        Collection c = map.values();    // returns a collection of value objects in the map
        System.out.println(c);
    }
}