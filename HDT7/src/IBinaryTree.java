public interface IBinaryTree<T> {
    
    // Inserta un elemento en el árbol
    void insert(T value);
    
    // Elimina un elemento del árbol
    void delete(T value);
    
    // Busca un elemento en el árbol
    boolean search(T value);
    
    // Recorre el árbol en orden (izquierda, raíz, derecha)
    void inOrderTraversal();
    
    // Recorre el árbol en preorden (raíz, izquierda, derecha)
    void preOrderTraversal();
    
    // Recorre el árbol en postorden (izquierda, derecha, raíz)
    void postOrderTraversal();
    
    // Obtiene el tamaño del árbol (cantidad de nodos)
    int size();
    
    // Verifica si el árbol está vacío
    boolean isEmpty();
}   
