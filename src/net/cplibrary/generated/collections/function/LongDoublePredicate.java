package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface LongDoublePredicate {
    boolean value(long first, double second);

    default LongFilter setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleFilter setFirst(long first) {
        return v -> value(first, v);
    }
}
