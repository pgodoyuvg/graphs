public class Main {
    public static void main(String[] args) {
        Graph<String, Integer> graph = new Graph<>();

        graph.addVertex("Uno", 1);
        graph.addVertex("Dos", 2);
        graph.addVertex("Tres", 3);
        graph.addVertex("Cuatro", 4);
        
        graph.addEdge("Uno", "Dos");
        graph.addEdge("Uno", "Tres");
        graph.addEdge("Uno", "Cuatro");
        graph.addEdge("Dos", "Cuatro");

        graph.printGraph();
    }
}
