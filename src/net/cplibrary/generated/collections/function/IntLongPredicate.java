package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface IntLongPredicate {
    boolean value(int first, long second);

    default IntFilter setSecond(long second) {
        return v -> value(v, second);
    }

    default LongFilter setFirst(int first) {
        return v -> value(first, v);
    }
}
