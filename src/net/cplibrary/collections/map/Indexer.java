package net.cplibrary.collections.map;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public class Indexer<K> extends EHashMap<K, Integer> {
    private int index = 0;

    @Override
    public Integer get(Object key) {
        if (!containsKey(key)) {
            put((K) key, index++);
        }
        return super.get(key);
    }
}
