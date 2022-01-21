package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface DoubleDoublePredicate {
    boolean value(double first, double second);

    default DoubleFilter setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleFilter setFirst(double first) {
        return v -> value(first, v);
    }
}
