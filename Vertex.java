public class Vertex<K, V> {
    private K key;
    private V value;
    private CustomList<K> neighbors = new CustomList<>();

    public Vertex(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void addNeighbor(K neighbor) {
        neighbors.add(neighbor);
    }

    public void getNeighbors() {
        for (int i = 0; i < neighbors.size(); i++) {
            System.out.println(neighbors.get(i));
        }
    }

    @Override
    public String toString() {
        return key + " -> " + value;
    }
}
