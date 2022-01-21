package net.cplibrary.collections.map;

import java.util.TreeMap;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public class TreeCounter<K> extends TreeMap<K, Long> {
    public TreeCounter() {
        super();
    }

    public void add(K key) {
        put(key, get(key) + 1);
    }

    public void add(K key, long delta) {
        put(key, get(key) + delta);
    }

    @Override
    public Long get(Object key) {
        if (containsKey(key)) {
            return super.get(key);
        }
        return 0L;
    }
}
