package com.collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsOperations {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Barry Allen");
        list.add("Wally West");
        list.add("Jay Garrick");
        Collections.sort(list);
        System.out.println(list);
        // Collections.binarySearch(listName, searchKey)
        System.out.println(Collections.binarySearch(list, "Bally West"));

        // Reversing a Collection
        Collections.reverse(list);
        System.out.println(list);

        // Shuffling a Collection
        Collections.shuffle(list);
        System.out.println(list);
    }
}