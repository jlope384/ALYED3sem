import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The FileReader class is responsible for reading data from files and constructing binary trees based on the data.
 */
public class FileReader {
    private BinaryTree tree1;
    private BinaryTree tree2;
    private BinaryTree tree3;

    /**
     * Constructs a FileReader object and initializes the binary trees.
     */
    public FileReader() {
        tree1 = new BinaryTree();
        tree2 = new BinaryTree();
        tree3 = new BinaryTree();

        try {
            List<String> lines = Files.readAllLines(Paths.get("src\\diccionario.txt"));

            for (String line : lines) {
                List<String> columns = Arrays.stream(line.split(",")).collect(Collectors.toList());

                if (columns.size() >= 3) {
                    String key1 = columns.get(0).toLowerCase();
                    String key2 = columns.get(1).toLowerCase();
                    String key3 = columns.get(2).toLowerCase();

                    tree1.insert(key1, Arrays.asList(key2, key3));
                    tree2.insert(key2, Arrays.asList(key1, key3));
                    tree3.insert(key3, Arrays.asList(key1, key2));
                } else {
                    System.out.println("Error: " + line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the content of a file as a string.
     *
     * @return The content of the file.
     */
    public String getContent() {
        String content = "";

        try {
            content = new String(Files.readAllBytes(Paths.get("src\\texto.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }

    /**
     * Retrieves the first binary tree.
     *
     * @return The first binary tree.
     */
    public BinaryTree getTree1() {
        return tree1;
    }

    /**
     * Retrieves the second binary tree.
     *
     * @return The second binary tree.
     */
    public BinaryTree getTree2() {
        return tree2;
    }

    /**
     * Retrieves the third binary tree.
     *
     * @return The third binary tree.
     */
    public BinaryTree getTree3() {
        return tree3;
    }
}
