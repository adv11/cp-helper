package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface DoubleToLongFunction {
    long value(double key);

    default DoubleToLongFunction combine(DoubleToDoubleFunction f) {
        return val -> value(f.value(val));
    }

    default IntToLongFunction combine(IntToDoubleFunction f) {
        return val -> value(f.value(val));
    }

    default LongToLongFunction combine(LongToDoubleFunction f) {
        return val -> value(f.value(val));
    }

    default CharToLongFunction combine(CharToDoubleFunction f) {
        return val -> value(f.value(val));
    }
}
