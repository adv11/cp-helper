package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface DoubleLongPredicate {
    boolean value(double first, long second);

    default DoubleFilter setSecond(long second) {
        return v -> value(v, second);
    }

    default LongFilter setFirst(double first) {
        return v -> value(first, v);
    }
}
