package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface LongCharToLongFunction {
    long value(long first, char second);

    default LongToLongFunction setSecond(char second) {
        return v -> value(v, second);
    }

    default CharToLongFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
