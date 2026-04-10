package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * A generic bag implementation backed by an ArrayList.
 *
 * @param <E> the element type stored in the bag
 */
public class Bag<E> implements Container<E> {
    private final ArrayList<E> items;

    /**
     * Creates an empty bag.
     */
    public Bag() {
        this.items = new ArrayList<>();
    }

    /**
     * Adds an item to the bag.
     *
     * @param item the item to add
     */
    @Override
    public void add(E item) {
        items.add(item);
    }

    /**
     * Removes the first occurrence of the given item from the bag.
     *
     * @param item the item to remove
     * @return true if an item was removed; false otherwise
     */
    @Override
    public boolean remove(E item) {
        return items.remove(item);
    }

    /**
     * Checks whether the bag contains the given item.
     *
     * @param item the item to look for
     * @return true if the bag contains the item; false otherwise
     */
    @Override
    public boolean contains(E item) {
        return items.contains(item);
    }

    /**
     * Returns the number of items in the bag.
     *
     * @return the bag size
     */
    @Override
    public int size() {
        return items.size();
    }

    /**
     * Checks whether the bag has no items.
     *
     * @return true if the bag is empty; false otherwise
     */
    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    /**
     * Returns an iterator over the items in the bag.
     *
     * @return an iterator for the bag contents
     */
    @Override
    public Iterator<E> iterator() {
        return items.iterator();
    }

    /**
     * Performs the given action for each element of the bag.
     * Extra credit implementation.
     *
     * @param action the action to perform for each element
     */
    @Override
    public void forEach(Consumer<? super E> action) {
        items.forEach(action);
    }

    /**
     * Returns a spliterator over the bag contents.
     * Extra credit implementation.
     *
     * @return a spliterator for the bag contents
     */
    @Override
    public Spliterator<E> spliterator() {
        return items.spliterator();
    }
}
