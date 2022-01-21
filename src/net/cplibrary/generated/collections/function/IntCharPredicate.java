package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface IntCharPredicate {
    boolean value(int first, char second);

    default IntFilter setSecond(char second) {
        return v -> value(v, second);
    }

    default CharFilter setFirst(int first) {
        return v -> value(first, v);
    }
}
