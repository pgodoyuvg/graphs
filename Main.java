public class Main {
    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(false); 
        graph.addVertex("a");
        graph.addVertex("b");
        graph.addVertex("c");
        graph.addVertex("d");
        graph.addVertex("e");
        graph.addVertex("f");


        graph.addEdge("a", "b", true);
        graph.addEdge("a", "f", true);
        graph.addEdge("a", "e", true);
        graph.addEdge("b", "c", true);
        graph.addEdge("e", "c", true);
        graph.addEdge("e", "d", true);
        graph.addEdge("f", "e", true);

    }
}
