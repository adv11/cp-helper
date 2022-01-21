package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface LongToLongFunction {
    long value(long key);

    default DoubleToLongFunction combine(DoubleToLongFunction f) {
        return val -> value(f.value(val));
    }

    default IntToLongFunction combine(IntToLongFunction f) {
        return val -> value(f.value(val));
    }

    default LongToLongFunction combine(LongToLongFunction f) {
        return val -> value(f.value(val));
    }

    default CharToLongFunction combine(CharToLongFunction f) {
        return val -> value(f.value(val));
    }
}
