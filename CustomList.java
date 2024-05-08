public class CustomList<K> {
    private static class Node<K> {
        K data;
        Node<K> next;

        Node(K data) {
            this.data = data;
        }
    }

    private Node<K> head;
    private int size;

    public CustomList() {
        head = null;
        size = 0;
    }

    public void add(K element) {
        Node<K> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        } else {
            Node<K> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public K get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Índice fuera de los límites de la lista.");
        }
    
        Node<K> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }    
}
