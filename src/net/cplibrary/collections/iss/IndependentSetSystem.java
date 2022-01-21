package net.cplibrary.collections.iss;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface IndependentSetSystem {
    boolean join(int first, int second);

    int get(int index);

    int getSetCount();

    void setListener(Listener listener);

    interface Listener {
        void joined(int joinedRoot, int root);
    }
}
