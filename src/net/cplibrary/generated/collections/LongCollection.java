package net.cplibrary.generated.collections;

import net.cplibrary.generated.collections.iterator.LongIterator;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface LongCollection extends LongStream {
    //abstract
    int size();

    //base
    default boolean isEmpty() {
        return size() == 0;
    }

    default void add(long value) {
        throw new UnsupportedOperationException();
    }

    default boolean remove(long value) {
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            if (value == it.value()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    default long[] toArray() {
        int size = size();
        long[] array = new long[size];
        int i = 0;
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            array[i++] = it.value();
        }
        return array;
    }

    default LongCollection addAll(LongStream values) {
        for (LongIterator it = values.longIterator(); it.isValid(); it.advance()) {
            add(it.value());
        }
        return this;
    }

    default LongCollection removeAll(LongStream values) {
        for (LongIterator it = values.longIterator(); it.isValid(); it.advance()) {
            remove(it.value());
        }
        return this;
    }

    default LongCollection retainAll(LongCollection values) {
        for (LongIterator it = longIterator(); it.isValid(); it.advance()) {
            if (!values.contains(it.value())) {
                it.remove();
            }
        }
        return this;
    }

    default LongCollection compute() {
        return this;
    }
}
