package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface CharLongPredicate {
    boolean value(char first, long second);

    default CharFilter setSecond(long second) {
        return v -> value(v, second);
    }

    default LongFilter setFirst(char first) {
        return v -> value(first, v);
    }
}
