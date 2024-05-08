public class Main2 {
    public static void main(String[] args) {
        // Crear una instancia de Graph
        Graph<String, Integer> graph = new Graph<>();

        // Agregar vértices al grafo
        graph.addVertex("g1", 1);
        graph.addVertex("g2", 2);
        graph.addVertex("g3", 3);
        graph.addVertex("g4", 4);
        graph.addVertex("g5", 5);
        graph.addVertex("g6", 6);

        // Agregar aristas al grafo
        graph.addEdge("g1", "g2");
        graph.addEdge("g1", "g6");
        graph.addEdge("g1", "g5");
        graph.addEdge("g2", "g3");
        graph.addEdge("g5", "g3");
        graph.addEdge("g5", "g4");
        graph.addEdge("g6", "g5");

        // Imprimir el grafo
        System.out.println("Relaciones de los grafos");
        graph.printGraph();
    }
}