package net.cplibrary.generated.collections.pair;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public class DoubleDoublePair implements Comparable<DoubleDoublePair> {
    public final double first;
    public final double second;

    public DoubleDoublePair(double first, double second) {
        this.first = first;
        this.second = second;
    }

    public static DoubleDoublePair makePair(double first, double second) {
        return new DoubleDoublePair(first, second);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DoubleDoublePair pair = (DoubleDoublePair) o;

        return first == pair.first && second == pair.second;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(first);
        result = 31 * result + Double.hashCode(second);
        return result;
    }

    public DoubleDoublePair swap() {
        return DoubleDoublePair.makePair(second, first);
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + ")";
    }

    @SuppressWarnings({"unchecked"})
    public int compareTo(DoubleDoublePair o) {
        int value = Double.compare(first, o.first);
        if (value != 0) {
            return value;
        }
        return Double.compare(second, o.second);
    }
}
