package net.cplibrary.string;

/**
 * @author Ashutosh Patel (ashutoshpatelnoida@gmail.com)
 * Linkedin : ( https://www.linkedin.com/in/ashutosh-patel-7954651ab/ )
 */
public class Trie {
    public final Node root = new Node();

    public void add(CharSequence word) {
        Node current = root;
        int length = word.length();
        for (int i = 0; i < length; i++) {
            char letter = word.charAt(i);
            if (current.links[letter] == null) {
                current.links[letter] = new Node();
            }
            current = current.links[letter];
        }
        current.leaf = true;
    }

    public Visitor getVisitor() {
        return new Visitor();
    }

    public static class Node {
        public final Node[] links = new Node[128];
        public boolean leaf = false;
    }

    public class Visitor {
        private Node node = root;

        private Visitor() {
        }

        public boolean accept(char letter) {
            if (node == null) {
                return false;
            }
            node = node.links[letter];
            if (node == null) {
                return false;
            }
            if (node.leaf) {
                node = root;
            }
            return true;
        }

        public boolean isAtRoot() {
            return node == root;
        }
    }

    public boolean contains(CharSequence key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            char letter = key.charAt(i);
            if (curr.links[letter] == null) return false;
            curr = curr.links[letter];
        }
        return curr.leaf;
    }

    public Node remove(CharSequence key) {
        return delete(root, key, 0);
    }

    private Node delete(Node root, CharSequence key, int depth) {
        if (root == null) return null;
        if (depth == key.length()) {
            if (root.leaf) root.leaf = false;
            if (isEmpty(root)) root = null;
            return root;
        }
        char letter = key.charAt(depth);
        root.links[letter] = delete(root.links[letter], key, depth + 1);
        if (isEmpty(root) && !root.leaf) root = null;
        return root;
    }

    private boolean isEmpty(Node root) {
        for (int i = 0; i < 128; i++) {
            if (root.links[i] != null) return false;
        }
        return true;
    }
}
