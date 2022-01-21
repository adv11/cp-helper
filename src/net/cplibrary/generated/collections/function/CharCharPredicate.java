package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface CharCharPredicate {
    boolean value(char first, char second);

    default CharFilter setSecond(char second) {
        return v -> value(v, second);
    }

    default CharFilter setFirst(char first) {
        return v -> value(first, v);
    }
}
