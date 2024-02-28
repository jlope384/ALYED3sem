package HDT4;

import java.util.ArrayList;

// Clase abstracta para el ADT de Pila
public abstract class AbstractStack<T> implements IStackADT<T>{
        protected ArrayList<T> elementos;

    public AbstractStack() {
        this.elementos = new ArrayList<>();
    }

    // Implementar los métodos de la interfaz
    @Override
    public boolean isEmpty() {
        return this.elementos.isEmpty();
    }

    @Override
    public int size() {
        return this.elementos.size();
    }

    @Override
    public void push(T element) {
        this.elementos.add(element);
    }

    @Override
    public T pop() {
        return this.elementos.remove(this.elementos.size() - 1);
    }

    @Override
    public T peek() {
        return this.elementos.get(this.elementos.size() - 1);
    }

    @Override
    public String toString() {
        return "AbstractStack{" + "elementos=" + elementos + '}';
    }
}
