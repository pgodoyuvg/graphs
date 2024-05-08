public class Graph<K, V> {
    private CustomList<Vertex<K, V>> vertices = new CustomList<>();

    public void addVertex(K key1, K key2) {
        Vertex<K,V> v1 = vertices.filter(vertex -> vertex.getKey().equals(key1));
        Vertex<K, V> v2 = vertices.filter(vertex -> vertex.getKey().equals(key2));

        if (v1 != null && v2 != null) {
            v1.addNeighbor(key2);
            v2.addNeighbor(key1);
        }
    }
}