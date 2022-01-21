package net.cplibrary.generated.collections.function;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public interface CharFilter {
    boolean accept(char value);

    default CharFilter or(CharFilter f) {
        return (val) -> CharFilter.this.accept(val) || f.accept(val);
    }

    default CharFilter and(CharFilter f) {
        return (val) -> CharFilter.this.accept(val) && f.accept(val);
    }

    default CharFilter xor(CharFilter f) {
        return (val) -> CharFilter.this.accept(val) ^ f.accept(val);
    }

    default CharFilter not() {
        return (val) -> !CharFilter.this.accept(val);
    }
}
