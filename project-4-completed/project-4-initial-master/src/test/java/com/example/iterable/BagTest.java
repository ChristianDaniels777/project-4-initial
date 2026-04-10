package com.example.iterable;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

    @Test
    void newBagStartsEmpty() {
        Bag<String> bag = new Bag<>();

        assertTrue(bag.isEmpty());
        assertEquals(0, bag.size());
    }

    @Test
    void addIncreasesSizeAndMakesBagNonEmpty() {
        Bag<Integer> bag = new Bag<>();

        bag.add(10);

        assertFalse(bag.isEmpty());
        assertEquals(1, bag.size());
        assertTrue(bag.contains(10));
    }

    @Test
    void removeExistingItemReturnsTrueAndUpdatesState() {
        Bag<String> bag = new Bag<>();
        bag.add("apple");
        bag.add("banana");

        boolean removed = bag.remove("apple");

        assertTrue(removed);
        assertEquals(1, bag.size());
        assertFalse(bag.contains("apple"));
        assertTrue(bag.contains("banana"));
    }

    @Test
    void removeNonexistentItemReturnsFalse() {
        Bag<String> bag = new Bag<>();
        bag.add("apple");

        assertFalse(bag.remove("pear"));
        assertEquals(1, bag.size());
    }

    @Test
    void containsReturnsFalseForEmptyBag() {
        Bag<String> bag = new Bag<>();

        assertFalse(bag.contains("anything"));
    }

    @Test
    void bagSupportsDuplicateValues() {
        Bag<Integer> bag = new Bag<>();
        bag.add(5);
        bag.add(5);
        bag.add(5);

        assertEquals(3, bag.size());
        assertTrue(bag.contains(5));

        assertTrue(bag.remove(5));
        assertEquals(2, bag.size());
        assertTrue(bag.contains(5));
    }

    @Test
    void bagAllowsNullValues() {
        Bag<String> bag = new Bag<>();
        bag.add(null);

        assertTrue(bag.contains(null));
        assertEquals(1, bag.size());
        assertTrue(bag.remove(null));
        assertTrue(bag.isEmpty());
    }

    @Test
    void iteratorTraversesAllElementsInInsertionOrder() {
        Bag<String> bag = new Bag<>();
        bag.add("A");
        bag.add("B");
        bag.add("C");

        List<String> iterated = new ArrayList<>();
        for (String item : bag) {
            iterated.add(item);
        }

        assertEquals(List.of("A", "B", "C"), iterated);
    }

    @Test
    void iteratorHasNextAndNextWorkCorrectly() {
        Bag<Integer> bag = new Bag<>();
        bag.add(1);
        bag.add(2);

        Iterator<Integer> iterator = bag.iterator();

        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    void iteratorOnEmptyBagHasNoNext() {
        Bag<String> bag = new Bag<>();

        assertFalse(bag.iterator().hasNext());
    }

    @Test
    void genericTypeWorksWithCustomObjects() {
        Bag<Person> bag = new Bag<>();
        Person person = new Person("Linus");

        bag.add(person);

        assertTrue(bag.contains(person));
        assertEquals(1, bag.size());
    }

    @Test
    void forEachVisitsEveryElement() {
        Bag<Integer> bag = new Bag<>();
        bag.add(1);
        bag.add(2);
        bag.add(3);

        AtomicInteger total = new AtomicInteger();
        bag.forEach(total::addAndGet);

        assertEquals(6, total.get());
    }

    @Test
    void spliteratorTraversesAllElements() {
        Bag<String> bag = new Bag<>();
        bag.add("x");
        bag.add("y");
        bag.add("z");

        Spliterator<String> spliterator = bag.spliterator();
        List<String> values = new ArrayList<>();
        spliterator.forEachRemaining(values::add);

        assertEquals(List.of("x", "y", "z"), values);
    }

    private static class Person {
        private final String name;

        private Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
