package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface IntDoublePredicate {
    boolean value(int first, double second);

    default IntFilter setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleFilter setFirst(int first) {
        return v -> value(first, v);
    }
}
