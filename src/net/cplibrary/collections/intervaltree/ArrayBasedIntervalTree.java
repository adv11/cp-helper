package net.cplibrary.collections.intervaltree;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public abstract class ArrayBasedIntervalTree extends LongIntervalTree {
    private final long[] array;

    protected ArrayBasedIntervalTree(long[] array) {
        super(array.length, false);
        this.array = array;
        init();
    }

    @Override
    protected long initValue(int index) {
        return array[index];
    }
}
