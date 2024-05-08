// [a] - [b] - [c]
// |   \
// [f] - [e] - [d]


//[a]->[b, f, e]->[c]

public class Main {
    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix();
        graph.addVertex("a");
        graph.addVertex("b");
        graph.addVertex("c");
        graph.addVertex("d");
        graph.addVertex("e");
        graph.addVertex("f");

        graph.addEdge("a", "b");
        graph.addEdge("a", "f");
        graph.addEdge("a", "e");
        graph.addEdge("b", "c");
        graph.addEdge("e", "c");
        graph.addEdge("e", "d");
        graph.addEdge("f", "e");

        // System.out.println(graph.topologicalSort());

    }
}
