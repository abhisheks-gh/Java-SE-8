package com.collections.queue;

import java.util.PriorityQueue;

/** PriorityQueue is unbounded with regard to capacity.
 * As elements are added to the PriorityQueue, its capacity grows automatically. */

/** An unbounded priority queue based on a priority heap. The elements of the priority
    queue are ordered according to their natural ordering, or by a Comparator provided
    at queue construction time, depending on which constructor is used. A priority queue
    does not permit null elements. A priority queue relying on natural ordering also does
    not permit insertion of non-comparable objects (doing so may result in ClassCastException).
  */

public class TestPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();

        queue.offer("Clark Kent");  // could also call add()
        queue.offer("Bruce Banner");
        queue.offer("Hal Jordan");
        queue.offer("Peter Parker");
        queue.offer("Bruce Wayne");
        queue.offer("Barry Allen");

        // They will be removed in alphabetical order by first_name
        /** Natural ordering: Numbers first, then Capital Letters, then Lowercase letters
         * We can customize that using comparator objects */
        String superHero = (String) queue.poll();   // could also call remove()
        System.out.println(superHero);
        superHero = (String) queue.poll();
        System.out.println(superHero);
        superHero = (String) queue.poll();
        System.out.println(superHero);
        superHero = (String) queue.poll();
        System.out.println(superHero);
        superHero = (String) queue.poll();
        System.out.println(superHero);
        superHero = (String) queue.poll();
        System.out.println(superHero);
    }
}