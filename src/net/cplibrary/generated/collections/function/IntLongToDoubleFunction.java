package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface IntLongToDoubleFunction {
    double value(int first, long second);

    default IntToDoubleFunction setSecond(long second) {
        return v -> value(v, second);
    }

    default LongToDoubleFunction setFirst(int first) {
        return v -> value(first, v);
    }
}
