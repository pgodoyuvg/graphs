import java.util.function.Predicate;

public class Graph<K, V> {
    CustomList<Vertex<K, V>> vertices = new CustomList<>();

    public void addVertex(K key, V value) {
        if (vertices.find(vertex -> vertex.getKey().equals(key)) != null) { 
    return;
        }
     vertices.add(new Vertex<>(key, value));
    }

    public void addEdge(K key1, K key2) {
        Vertex<K, V> v1 = vertices.find(vertex -> vertex.getKey().equals(key1));
        Vertex<K, V> v2 = vertices.find(vertex -> vertex.getKey().equals(key2));

        if (v1 != null && v2 != null) {
            v1.addNeighbor(key2);
            v2.addNeighbor(key1);
        }
    }
}
