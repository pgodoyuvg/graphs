import java.util.ArrayList;
import java.util.List;

public class CustomList<T> {
    private List<T> items;

    public CustomList() {
        items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public void addConnection() {
        
    }
}