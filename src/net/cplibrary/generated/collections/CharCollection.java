package net.cplibrary.generated.collections;

import net.cplibrary.generated.collections.iterator.CharIterator;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface CharCollection extends CharStream {
    //abstract
    int size();

    //base
    default boolean isEmpty() {
        return size() == 0;
    }

    default void add(char value) {
        throw new UnsupportedOperationException();
    }

    default boolean remove(char value) {
        for (CharIterator it = charIterator(); it.isValid(); it.advance()) {
            if (value == it.value()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    default char[] toArray() {
        int size = size();
        char[] array = new char[size];
        int i = 0;
        for (CharIterator it = charIterator(); it.isValid(); it.advance()) {
            array[i++] = it.value();
        }
        return array;
    }

    default CharCollection addAll(CharStream values) {
        for (CharIterator it = values.charIterator(); it.isValid(); it.advance()) {
            add(it.value());
        }
        return this;
    }

    default CharCollection removeAll(CharStream values) {
        for (CharIterator it = values.charIterator(); it.isValid(); it.advance()) {
            remove(it.value());
        }
        return this;
    }

    default CharCollection retainAll(CharCollection values) {
        for (CharIterator it = charIterator(); it.isValid(); it.advance()) {
            if (!values.contains(it.value())) {
                it.remove();
            }
        }
        return this;
    }

    default CharCollection compute() {
        return this;
    }
}
