import java.util.ArrayList;
import java.util.List;

public class CustomList<T> {
    SinglyLinkedList<T> customList;

    public CustomList() {
        this.customList = new SinglyLinkedList<>();
    }

    public void add(T e) {
        customList.add(e);
    }

    public T get(int i) {
        return customList.get(i);
    }

    public int size() {
        return customList.size();
    }

    public T filter(java.util.function.Predicate<T> predicate) {
        return customList.stream().filter(predicate).findFirst().orElse(null);
    }

    public int indexOf(T e) {
        return customList.indexOf(e);
    }



    
}
