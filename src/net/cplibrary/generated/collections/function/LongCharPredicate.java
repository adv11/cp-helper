package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface LongCharPredicate {
    boolean value(long first, char second);

    default LongFilter setSecond(char second) {
        return v -> value(v, second);
    }

    default CharFilter setFirst(long first) {
        return v -> value(first, v);
    }
}
