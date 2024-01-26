    import java.util.Vector;

    public class StackWithVector<T> implements IStack<T>{
        private Vector<T> stack;
        private int top;

        //Constuctor para inicializar el vector y mostrar que no hay elementos en la pila
        public StackWithVector() {
            stack = new Vector<T>();
            top = -1;
        }

        @Override
        public int size() {
            return top + 1;
        }

        @Override
        public boolean isEmpty() {
            return top==-1; //si top==-1 está vacio, si no, esta llena
        }

        @Override
        public void push(T value) {
            top++;
            stack.add(value);
        }

        @Override
        public T pop() {
            if (isEmpty()) {
                throw new IllegalStateException("La pila está vacía");
            }
            T item = stack.remove(top);
            top--;
            return item;
        }

        @Override
        public T peek() {
            if (isEmpty()) {
                throw new IllegalStateException("La pila está vacía");
            }
            return stack.get(top);
        }
        
    }
