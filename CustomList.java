import java.util.ArrayList;
import java.util.function.Predicate;

public class CustomList<K> {
    private ArrayList<K> list;

    public CustomList() {
        list = new ArrayList<>();
    }

    public void add(K element) {
        list.add(element);
    }

    public K filter(Predicate<K> predicate) {
        for (K element : list) {
            if (predicate.test(element)) {
                return element;
            }
        }
        return null; 
    }

    public int size() {
        return list.size();
    }

    public K get(int index) {
        return list.get(index);
    }
}
