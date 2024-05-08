public class CustomList<K> {
    private Node<K> head;
    private int size = 0;

    private static class Node<K> {
        K item;
        Node<K> next;

        Node(K element, Node<K> next) {
            this.item = element;
            this.next = next;
        }
    }

    public void add(K element) {
        if (head == null) {
            head = new Node<>(element, null);
        } else {
            Node<K> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(element, null);
        }
        size++;
    }

    public K get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        Node<K> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.item;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    public K find(Predicate<K> predicate) {
        Node<K> current = head;
        while (current != null) {
            if (predicate.test(current.item)) {
                return current.item;
            }
            current = current.next;
        }
        return null;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node<K> current = head;
        while (current != null) {
            sb.append(current.item);
            if (current.next != null) {
                sb.append(", ");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();
    }
}