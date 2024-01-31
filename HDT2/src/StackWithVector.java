    import java.util.Vector;

    /**
     * Implementación de una pila utilizando un Vector.
     * Esta clase implementa la interfaz IStack<T> y proporciona
     * métodos para realizar operaciones básicas en una pila.
     * @param <T> el tipo de elementos almacenados en la pila.
     */
    public class StackWithVector<T> implements IStack<T>{
        private Vector<T> stack;

        /**
         * Constructor para inicializar la pila vacía.
         */
        public StackWithVector() {
            stack = new Vector<T>();
        }

        /**
         * Devuelve el número de elementos en la pila.
         * @return el tamaño de la pila.
         */
        @Override
        public int size() {
            return stack.size();
        }

        /**
         * Verifica si la pila está vacía.
         * @return true si la pila está vacía, false de lo contrario.
         */
        @Override
        public boolean isEmpty() {
            return stack.isEmpty();
        }

        /**
         * Agrega un elemento a la parte superior de la pila.
         * @param value el elemento a agregar.
         */
        @Override
        public void push(T value) {
            stack.add(value);
        }

        /**
         * Elimina y devuelve el elemento en la parte superior de la pila.
         * @return el elemento eliminado de la pila.
         * @throws IllegalStateException si la pila está vacía.
         */
        @Override
        public T pop() {
            T tempValue = null;
            if (!isEmpty()) {
                tempValue= stack.remove(stack.size() - 1);
            }
            else{
                throw new IllegalStateException("La pila está vacía");
            }

            return tempValue;
        }

        /**
         * Devuelve el elemento en la parte superior de la pila sin eliminarlo.
         * @return el elemento en la parte superior de la pila.
         * @throws IllegalStateException si la pila está vacía.
         */
        @Override
        public T peek() {
            T tempValue = null;
            if (!isEmpty()) {
                tempValue= stack.get(stack.size() - 1);
            }
            else{
                throw new IllegalStateException("La pila está vacía");
            }

            return tempValue;
        }
        
    }
