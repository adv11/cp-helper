package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface CharDoublePredicate {
    boolean value(char first, double second);

    default CharFilter setSecond(double second) {
        return v -> value(v, second);
    }

    default DoubleFilter setFirst(char first) {
        return v -> value(first, v);
    }
}
