public class Graph<K, V> {
    private CustomList<Vertex<K, V>> vertices = new CustomList<>();

    public Graph(){}

    public void addVertex(K key1, K key2) {
        Vertex<K, V> vertex1 = findOrCreateVertex(key1);
        Vertex<K, V> vertex2 = findOrCreateVertex(key2);
    
        // Agregar la conexión entre los vértices
        vertex1.addConnection(vertex2);
        vertex2.addConnection(vertex1);
    }
    
    private Vertex<K, V> findOrCreateVertex(K key) {
        for (Vertex<K, V> vertex : vertices) {
            if (vertex.getKey().equals(key)) {
                return vertex;
            }
        }
    
        Vertex<K, V> newVertex = new Vertex<>(key, null); // Porque no estamos pasando valores de vértice
        vertices.add(newVertex);
        return newVertex;
    }
}
