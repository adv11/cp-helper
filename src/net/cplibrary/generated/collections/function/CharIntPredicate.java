package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface CharIntPredicate {
    boolean value(char first, int second);

    default CharFilter setSecond(int second) {
        return v -> value(v, second);
    }

    default IntFilter setFirst(char first) {
        return v -> value(first, v);
    }
}
