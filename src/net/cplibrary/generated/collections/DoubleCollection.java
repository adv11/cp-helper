package net.cplibrary.generated.collections;

import net.cplibrary.generated.collections.iterator.DoubleIterator;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface DoubleCollection extends DoubleStream {
    //abstract
    int size();

    //base
    default boolean isEmpty() {
        return size() == 0;
    }

    default void add(double value) {
        throw new UnsupportedOperationException();
    }

    default boolean remove(double value) {
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            if (value == it.value()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    default double[] toArray() {
        int size = size();
        double[] array = new double[size];
        int i = 0;
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            array[i++] = it.value();
        }
        return array;
    }

    default DoubleCollection addAll(DoubleStream values) {
        for (DoubleIterator it = values.doubleIterator(); it.isValid(); it.advance()) {
            add(it.value());
        }
        return this;
    }

    default DoubleCollection removeAll(DoubleStream values) {
        for (DoubleIterator it = values.doubleIterator(); it.isValid(); it.advance()) {
            remove(it.value());
        }
        return this;
    }

    default DoubleCollection retainAll(DoubleCollection values) {
        for (DoubleIterator it = doubleIterator(); it.isValid(); it.advance()) {
            if (!values.contains(it.value())) {
                it.remove();
            }
        }
        return this;
    }

    default DoubleCollection compute() {
        return this;
    }
}
