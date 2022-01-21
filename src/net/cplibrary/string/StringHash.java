package net.cplibrary.string;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface StringHash {
    long hash(int from, int to);

    long hash(int from);

    int length();
}
