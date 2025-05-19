package com.redashwood.ds.list;

public class SinglyLinkedList<E extends Comparable<E>> implements LinkedList<E> {

    private int size;
    private Node<E> head;
    private Node<E> tail;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addFirst(E data) {

    }

    @Override
    public void addLast(E data) {

    }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }

    private class Node<E extends Comparable<E>> {

        private final E data;

        private final Node<E> next;

        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }
}
