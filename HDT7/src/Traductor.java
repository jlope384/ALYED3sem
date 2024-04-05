/**
 * The Traductor class represents a translator that uses FileReader to read and process data.
 * It provides methods to retrieve three different binary trees.
 */
public class Traductor {
    private FileReader filereader;

    /**
     * Constructs a Traductor object and initializes the filereader.
     */
    public Traductor() {
        filereader = new FileReader();
    }

    /**
     * Retrieves the first binary tree.
     *
     * @return the first binary tree.
     */
    public BinaryTree getTree1() {
        return filereader.getTree1();
    }

    /**
     * Retrieves the second binary tree.
     *
     * @return the second binary tree.
     */
    public BinaryTree getTree2() {
        return filereader.getTree2();
    }

    /**
     * Retrieves the third binary tree.
     *
     * @return the third binary tree.
     */
    public BinaryTree getTree3() {
        return filereader.getTree3();
    }
}
