package com.redashwood.ds.list;

import java.io.Serializable;

public interface LinkedList<E extends Comparable<E>> extends Serializable {

    boolean isEmpty();

    int size();

    void addFirst(E data);

    void addLast(E data);

    E getFirst();

    E getLast();

    E removeFirst();

    E removeLast();

}
