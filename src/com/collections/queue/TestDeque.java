package com.collections.queue;

import java.util.ArrayDeque;

public class TestDeque {
    public static void main(String[] args) {
        ArrayDeque deque = new ArrayDeque();
        deque.offerFirst("center");     // could also call addFirst()
        deque.offerFirst("Bruce Banner");
        deque.offerLast("Barry Allen");
        deque.offerFirst("Bruce Wayne");
        deque.offerLast("Clark Kent");
        deque.offerFirst("Peter Parker");
        deque.offerLast("Hal Jordan");
        System.out.println(deque);
        System.out.println(deque.pollLast());   // could also be removeFirst()
        System.out.println(deque.pollFirst());
        System.out.println(deque);
    }
}