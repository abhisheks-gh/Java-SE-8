package com.collections.comparableandcomparator;

/** To get Collections or Arrays to sort user defined types, the types must implement
 the Comparable interface.
 *  To implement the Comparable interface, the class must implement the compareTo() method.
 */

public interface Comparable {
    public int compareTo(Object o);
}
