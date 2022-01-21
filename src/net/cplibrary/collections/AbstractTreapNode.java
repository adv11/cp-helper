package net.cplibrary.collections;

import java.util.Random;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public abstract class AbstractTreapNode<T extends AbstractTreapNode> {
    private final static Random RANDOM = new Random(239);

    public final int key;
    protected final long priority = RANDOM.nextLong();
    protected T left;
    protected T right;
    private int size;

    public AbstractTreapNode(int key) {
        this.key = key;
    }

    public static int size(AbstractTreapNode node) {
        return node == null ? 0 : node.size;
    }

    public static <T extends AbstractTreapNode<T>> T merge(T left, T right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        if (left.priority < right.priority) {
            right.left = merge(left, right.left);
            right.update();
            return right;
        } else {
            left.right = merge(left.right, right);
            left.update();
            return left;
        }
    }

    public static <T extends AbstractTreapNode<T>> Pair<T, T> split(T node, int key) {
        Object[] result = new Object[2];
        split(node, key, result);
        return Pair.makePair((T) result[0], (T) result[1]);
    }

    private static <T extends AbstractTreapNode> void split(T node, int key, Object[] result) {
        if (node == null) {
            return;
        }
        if (node.key >= key) {
            split(node.left, key, result);
            node.left = (T) result[1];
            result[1] = node;
        } else {
            split(node.right, key, result);
            node.right = (T) result[0];
            result[0] = node;
        }
    }

    protected void update() {
        size = 1 + size(left) + size(right);
    }
}
