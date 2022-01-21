package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface IntToIntFunction {
    int value(int key);

    default DoubleToIntFunction combine(DoubleToIntFunction f) {
        return val -> value(f.value(val));
    }

    default IntToIntFunction combine(IntToIntFunction f) {
        return val -> value(f.value(val));
    }

    default LongToIntFunction combine(LongToIntFunction f) {
        return val -> value(f.value(val));
    }

    default CharToIntFunction combine(CharToIntFunction f) {
        return val -> value(f.value(val));
    }
}
