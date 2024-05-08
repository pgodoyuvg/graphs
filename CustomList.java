import java.util.LinkedList;
import java.util.List;

public class CustomList<T> {
    List<T> customList;

    public CustomList() {
        this.customList = new LinkedList<>();
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


    
}
