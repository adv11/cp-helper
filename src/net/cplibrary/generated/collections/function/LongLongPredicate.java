package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface LongLongPredicate {
    boolean value(long first, long second);

    default LongFilter setSecond(long second) {
        return v -> value(v, second);
    }

    default LongFilter setFirst(long first) {
        return v -> value(first, v);
    }
}
