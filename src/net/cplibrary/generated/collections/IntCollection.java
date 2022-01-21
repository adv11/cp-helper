package net.cplibrary.generated.collections;

import net.cplibrary.generated.collections.iterator.IntIterator;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface IntCollection extends IntStream {
    //abstract
    int size();

    //base
    default boolean isEmpty() {
        return size() == 0;
    }

    default void add(int value) {
        throw new UnsupportedOperationException();
    }

    default boolean remove(int value) {
        for (IntIterator it = intIterator(); it.isValid(); it.advance()) {
            if (value == it.value()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    default int[] toArray() {
        int size = size();
        int[] array = new int[size];
        int i = 0;
        for (IntIterator it = intIterator(); it.isValid(); it.advance()) {
            array[i++] = it.value();
        }
        return array;
    }

    default IntCollection addAll(IntStream values) {
        for (IntIterator it = values.intIterator(); it.isValid(); it.advance()) {
            add(it.value());
        }
        return this;
    }

    default IntCollection removeAll(IntStream values) {
        for (IntIterator it = values.intIterator(); it.isValid(); it.advance()) {
            remove(it.value());
        }
        return this;
    }

    default IntCollection retainAll(IntCollection values) {
        for (IntIterator it = intIterator(); it.isValid(); it.advance()) {
            if (!values.contains(it.value())) {
                it.remove();
            }
        }
        return this;
    }

    default IntCollection compute() {
        return this;
    }
}
