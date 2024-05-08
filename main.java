public class Main {
    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(false); 
        WeightedGraph weightedGraph = new WeightedGraph(true); 

        // Agregar vértices al grafo
        Integer[] vertices = {1, 2, 3, 4, 5};
        for (Integer vertex : vertices) {
            graph.addVertex(vertex);
        }

        // Agregar aristas al grafo
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        WeightedGraph.addEdge(1, 2, 10);
        WeightedGraph.addEdge(2, 3, 15);
        WeightedGraph.addEdge(3, 4, 20);
        WeightedGraph.addEdge(4, 5, 25);

        // Imprimir el grafo
        System.out.println("Graph:");
        graph.printGraph();
        System.out.println("\nWeighted Graph:");
        WeightedGraph.printWeightedGraph();
    }
}