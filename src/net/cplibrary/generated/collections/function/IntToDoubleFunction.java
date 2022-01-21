package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface IntToDoubleFunction {
    double value(int key);

    default DoubleToDoubleFunction combine(DoubleToIntFunction f) {
        return val -> value(f.value(val));
    }

    default IntToDoubleFunction combine(IntToIntFunction f) {
        return val -> value(f.value(val));
    }

    default LongToDoubleFunction combine(LongToIntFunction f) {
        return val -> value(f.value(val));
    }

    default CharToDoubleFunction combine(CharToIntFunction f) {
        return val -> value(f.value(val));
    }
}
