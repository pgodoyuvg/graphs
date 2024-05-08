public class Vertex<K, V> {
    private K key;
    private V value;
    private CustomList<K> neighbors;

    public Vertex(K key, V value) {
        this.key = key;
        this.value = value;
        this.neighbors = new CustomList<>();
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

    public CustomList<K> getNeighbors() {
        return neighbors;
    }

    @Override
    public String toString() {
        return key + " -> " + value;
    }
}

