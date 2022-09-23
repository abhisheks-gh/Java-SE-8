package com.collections.queue;

import java.util.concurrent.ArrayBlockingQueue;

/** An ArrayBlockingQueue implements a first-in-first-out (FIFO) Queue.
 * ArrayBlockingQueues hold a fixed number of elements. */

public class TestArrayBlockingQueue {
    public static void main(String[] args) {
        ArrayBlockingQueue queue = new ArrayBlockingQueue(5);

        // Using offer() instead of add() because offer() don't throw exception
        // So, if we try to add elements when queue is at capacity, it is simply not added
        // rather than throwing an exception
        queue.offer("Bruce Banner");    // could also use add()
        queue.offer("Barry Allen");
        queue.offer("Bruce Wayne");
        queue.offer("Clark Kent");
        queue.offer("Peter Parker");
        queue.offer("Hal Jordan");  // not added, queue at capacity

        System.out.println(queue);

        /** poll() : Retrieves and removes the head of this queue, or returns null if this queue is empty. */
        String superHero = (String) queue.poll();   // could also call remove()
        System.out.println(superHero);
        /** peek(): Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty. */
        String nextHero = (String) queue.peek();    // could also call element()
        System.out.println(nextHero);
    }
}