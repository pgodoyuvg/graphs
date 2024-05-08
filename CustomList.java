public class CustomList<T> {
    private Node<T> first;
    private int size;

    public CustomList() {
        this.first = null;
        this.size = 0;
    }

    public void add(T value) {

        if (first == null) {
            first = new Node<>(value);
            this.size++;

            return;
        }

        Node<T> current = first;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(new Node<>(value));
        this.size++;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index >= size ) {
            throw new IndexOutOfBoundsException();
        }

        Node<T> current = first;
        for (int i = 0; i <= index; i++) {
            current = current.getNext();
        }

        return current.getValue();
    }
}
