package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface LongIntToCharFunction {
    char value(long first, int second);

    default LongToCharFunction setSecond(int second) {
        return v -> value(v, second);
    }

    default IntToCharFunction setFirst(long first) {
        return v -> value(first, v);
    }
}
