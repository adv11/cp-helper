package net.cplibrary.generated.collections.pair;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public class KIntPair<K> implements Comparable<KIntPair<K>> {
    public final K first;
    public final int second;

    private KIntPair(K first, int second) {
        this.first = first;
        this.second = second;
    }

    public static <K> KIntPair<K> makePair(K first, int second) {
        return new KIntPair<K>(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CharIntPair pair = (CharIntPair) o;

        return first.equals(pair.first) && second == pair.second;
    }

    @Override
    public int hashCode() {
        int result = first.hashCode();
        result = 31 * result + Integer.hashCode(second);
        return result;
    }

    public IntVPair<K> swap() {
        return IntVPair.makePair(second, first);
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + ")";
    }

    @SuppressWarnings({"unchecked"})
    public int compareTo(KIntPair<K> o) {
        int value = ((Comparable<K>) first).compareTo(o.first);
        if (value != 0) {
            return value;
        }
        return Integer.compare(second, o.second);
    }
}
