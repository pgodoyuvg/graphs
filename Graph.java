public class Graph<K, V> {
    public CustomList<Vertex<K, V>> vertices = new CustomList<>();

    public Graph(){}

    public Vertex<K, V> createRelation(K key1, K key2) {
        Vertex<K, V> vertex1 = createVertex(key1);
        Vertex<K, V> vertex2 = createVertex(key2);
        vertex1.addNeighbor(vertex2.getKey());
        return vertex1;
    }
    
    public Vertex<K, V> createVertex(K key) {
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

