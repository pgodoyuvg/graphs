import java.util.Iterator;

public class CustomList<T> implements Iterable<T> {
    private Node<T> head;
    private int size;

    public CustomList() {
        head = null;
        size = 0;
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        size++;
    }

    public Node<T> getHead() {
        return head;
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomListIterator();
    }

    private class CustomListIterator implements Iterator<T> {
        private Node<T> current;

        public CustomListIterator() {
            this.current = head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T value = current.getValue();
            current = current.getNext();
            return value;
        }
    }
}