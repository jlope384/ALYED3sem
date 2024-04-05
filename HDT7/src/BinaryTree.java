import java.util.List;

/**
 * Represents a binary tree data structure.
 */
public class BinaryTree {
    private Node root;

    /**
     * Constructs an empty binary tree.
     */
    public BinaryTree() {
        root = null;
    }

    /**
     * Inserts a new node with the given key and values into the binary tree.
     * If a node with the same key already exists, the values are updated.
     * 
     * @param key    the key of the node to be inserted
     * @param values the values associated with the key
     */
    public void insert(String key, List<String> values) {
        root = insertRecursive(root, key, values);
    }

    private Node insertRecursive(Node current, String key, List<String> values) {
        if (current == null) {
            return new Node(key, values);
        }

        if (key.compareTo(current.key) < 0) {
            current.left = insertRecursive(current.left, key, values);
        } else if (key.compareTo(current.key) > 0) {
            current.right = insertRecursive(current.right, key, values);
        }

        return current;
    }

    /**
     * Searches for a node with the given key in the binary tree.
     * 
     * @param key the key to search for
     * @return the values associated with the key, or null if the key is not found
     */
    public List<String> search(String key) {
        return searchRecursive(root, key);
    }

    private List<String> searchRecursive(Node current, String key) {
        if (current == null) {
            return null;
        }

        if (key.equals(current.key)) {
            return current.values;
        }

        return key.compareTo(current.key) < 0
            ? searchRecursive(current.left, key)
            : searchRecursive(current.right, key);
    }

    private class Node {
        String key;
        List<String> values;
        Node left;
        Node right;

        Node(String key, List<String> values) {
            this.key = key;
            this.values = values;
            left = null;
            right = null;
        }
    }
}
