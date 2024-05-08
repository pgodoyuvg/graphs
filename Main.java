public class Main {
    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(false); // Crear un grafo no dirigido
        graph.addVertex("a");
        graph.addVertex("b");
        graph.addVertex("c");
        graph.addVertex("d");
        graph.addVertex("e");
        graph.addVertex("f");

        // Añadir aristas
        graph.addEdge("a", "b", true);
        graph.addEdge("a", "f", true);
        graph.addEdge("a", "e", true);
        graph.addEdge("b", "c", true);
        graph.addEdge("e", "c", true);
        graph.addEdge("e", "d", true);
        graph.addEdge("f", "e", true);

        // Opcional: Una función para mostrar la representación del grafo
        printGraph(graph);
    }

    // Método para imprimir el grafo
    private static void printGraph(GraphMatrix graph) {
        System.out.println("Graph representation:");
        // Implementar según sea necesario
    }
}
