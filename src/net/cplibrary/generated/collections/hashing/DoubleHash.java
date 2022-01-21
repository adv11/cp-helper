package net.cplibrary.generated.collections.hashing;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public class DoubleHash {
    private DoubleHash() {
    }

    public static int hash(double c) {
        long bits = Double.doubleToLongBits(c);
        return LongHash.hash(bits);
    }
}
