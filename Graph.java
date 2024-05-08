public class Graph<K, V> {
    private CustomList<Vertex<K, V>> vertices = new CustomList<>();

    public Graph(){}

    public void addVertex(K key1, K key2) {
        Vertex<K, V> vertex1 = findOrCreateVertex(key1);
        Vertex<K, V> vertex2 = findOrCreateVertex(key2);
    }
    
    private Vertex<K, V> findOrCreateVertex(K key) {
        Node<Vertex<K, V>> current = vertices.getHead();
        while (current != null) {
            if (current.getValue().getKey().equals(key)) {
                return current.getValue();
            }
            current = current.getNext();
        }
    
        Vertex<K, V> newVertex = new Vertex<>(key, null); // Porque no estamos pasando valores de vértice
        vertices.add(newVertex);
        return newVertex;
    }
}

