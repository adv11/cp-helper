package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface LongIntPredicate {
    boolean value(long first, int second);

    default LongFilter setSecond(int second) {
        return v -> value(v, second);
    }

    default IntFilter setFirst(long first) {
        return v -> value(first, v);
    }
}
