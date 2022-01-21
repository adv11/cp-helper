package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface LongDoubleToIntFunction {
    int value(long first, double second);

    default LongToIntFunction setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleToIntFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
