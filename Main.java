public class Main {
    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(false);
        Integer[] vertices = {186, 219, 537, 99, 625, 667, 412, 488, 383, 90,
                              345, 66, 490, 89, 22, 180, 262, 150, 183, 40, 253,
                              164, 165, 142};

        for (Integer vertex : vertices) {
            graph.addVertex(vertex);
        }

        graph.addEdge(186, 219);
        graph.addEdge(219, 537);
        graph.addEdge(219, 667);
        graph.addEdge(537, 99);
        graph.addEdge(99, 625);
        graph.addEdge(625, 383);
        graph.addEdge(383, 90);
        graph.addEdge(90, 345);
        graph.addEdge(345, 66);
        graph.addEdge(66, 490);
        graph.addEdge(490, 89);
        graph.addEdge(89, 22);
        graph.addEdge(22, 180);
        graph.addEdge(180, 262);
        graph.addEdge(262, 150);
        graph.addEdge(150, 183);
        graph.addEdge(183, 40);
        graph.addEdge(40, 253);
        graph.addEdge(253, 164);
        graph.addEdge(164, 165);
        graph.addEdge(165, 142);

        // Imprimir 
        System.out.println("Graph:");
        graph.printGraph();

        WeightedGraph weightedGraph = new WeightedGraph(true); 
        for (Integer vertex : vertices) {
            weightedGraph.addVertex(vertex);
        }

        weightedGraph.addEdge(186, 219, 5);
        weightedGraph.addEdge(219, 537, 10);
        weightedGraph.addEdge(219, 667, 8);

        System.out.println("\nWeighted Graph:");
        weightedGraph.printWeightedGraph();
    }
}

