package net.cplibrary.misc;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface PowerOperation<V> extends Operation<V> {
    V power(V base, int exponent);
}
