public class Graph<K, V> {
    private CustomList<Vertex<K, V>> vertices;

    public Graph() {
        this.vertices = new CustomList<>();
    }

    public void addVertex(K key, V value) {
        Vertex<K, V> newVertex = new Vertex<>(key, value);
        vertices.add(newVertex);
    }

    public void addEdge(K key1, K key2) {
        Vertex<K, V> v1 = findVertex(key1);
        Vertex<K, V> v2 = findVertex(key2);

        if (v1 != null && v2 != null) {
            v1.addNeighbor(key2);
            v2.addNeighbor(key1);
        }
    }

    private Vertex<K, V> findVertex(K key) {
        for (Vertex<K, V> vertex : vertices) {
            if (vertex.getKey().equals(key)) {
                return vertex;
            }
        }
        return null;
    }

    public void printGraph() {
        for (Vertex<K, V> vertex : vertices) {
            System.out.print(vertex.getKey() + " -> ");
            CustomList<K> neighbors = vertex.getNeighbors();
            for (K neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph<String, Integer> graph = new Graph<>();

        graph.addVertex("a", 1);
        graph.addVertex("b", 2);
        graph.addVertex("c", 3);
        graph.addVertex("d", 4);

        graph.addEdge("a", "b");
        graph.addEdge("a", "c");
        graph.addEdge("b", "c");
        graph.addEdge("c", "d");

        graph.printGraph();
    }
}

