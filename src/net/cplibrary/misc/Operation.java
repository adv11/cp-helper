package net.cplibrary.misc;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface Operation<V> extends Factory<V> {
    V operation(V first, V second);
}
