package net.cplibrary.collections.set;

import java.util.NavigableSet;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface PersistentSet<K> extends NavigableSet<K> {
    void markState(Object marker);

    PersistentSet<K> getState(Object marker);
}
