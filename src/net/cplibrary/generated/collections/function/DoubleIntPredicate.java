package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface DoubleIntPredicate {
    boolean value(double first, int second);

    default DoubleFilter setSecond(int second) {
        return v -> value(v, second);
    }

    default IntFilter setFirst(double first) {
        return v -> value(first, v);
    }
}
