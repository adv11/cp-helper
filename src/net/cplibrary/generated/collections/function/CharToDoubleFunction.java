package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface CharToDoubleFunction {
    double value(char key);

    default DoubleToDoubleFunction combine(DoubleToCharFunction f) {
        return val -> value(f.value(val));
    }

    default IntToDoubleFunction combine(IntToCharFunction f) {
        return val -> value(f.value(val));
    }

    default LongToDoubleFunction combine(LongToCharFunction f) {
        return val -> value(f.value(val));
    }

    default CharToDoubleFunction combine(CharToCharFunction f) {
        return val -> value(f.value(val));
    }
}
