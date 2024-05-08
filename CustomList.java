import java.util.Arrays;
import java.util.Iterator;

public class CustomList<T> implements Iterable<T> {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public CustomList() {
        this.elements = new Object[INITIAL_CAPACITY];
        this.size = 0;
    }

    public void add(T element) {
        ensureCapacity();
        elements[size++] = element;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (T) elements[index];
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size && elements[currentIndex] != null;
            }

            @Override
            public T next() {
                return (T) elements[currentIndex++];
            }
        };
    }

    public int indexOf(Integer start) {
        for (int i = 0; i < elements.length; i++) {
            if (Integer.valueOf((Integer) elements[i]).equals(start)) {
                return i;
            }
        }
        return -1;
    }
}

