import java.util.NoSuchElementException;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SinglyLinkedList<T> {
    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }


    public void addFirst(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
        size++;
    }


    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }


    public T removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }


    public T removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        T data;
        if (head.next == null) {
            data = head.data;
            head = null;
        } else {
            Node<T> current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            data = current.next.data;
            current.next = null;
        }
        size--;
        return data;
    }


    public T getFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return head.data;
    }


    public T getLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    public T get(int i) {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        Node<T> current = head;
        for (int j = 0; j < i; j++) {
            if (current == null) {
                throw new NoSuchElementException("no element on index");
            }
            current = current.next;
        }
        return current.data;
    }

    public int indexOf(T value) {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        Node<T> current = head;
        int count = 0;
        while (current != value) {
            current = current.next;
            count ++;
            if (current == null) {
                throw new NoSuchElementException("Element not in list");
            }
        }
        return count;
    }

    
    public int size() {
        return size;
    }


    public boolean isEmpty() {
        return size == 0;
    }
    

    // Métodos de IStack<T>

    public void push(T item) {
        add(item);
    }


    public T pop() {
        return removeLast();
    }


    public T peek() {
        return getLast();
    }


    public boolean empty() {
        return isEmpty();
    }


    public Stream<T> stream() {
        return Stream.iterate(head, n -> n.next)
                     .limit(size)
                     .map(n -> n.data);
    }
}
