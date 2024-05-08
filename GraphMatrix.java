public class GraphMatrix {
    protected CustomList<Integer> vertices;
    private boolean[][] edges;
    protected boolean directed;
    protected boolean weighted;

    public GraphMatrix(boolean directed) {
        this.vertices = new CustomList<>();
        this.edges = new boolean[2500][2500]; // Tamaño
        this.directed = directed;
        this.weighted = false;
    }

    public void addVertex(Integer node) {
        vertices.add(node);
    }

    public void addEdge(Integer start, Integer end) {
        int startIndex = vertices.indexOf(start);
        int endIndex = vertices.indexOf(end);

        if (startIndex != -1 && endIndex != -1) {
            edges[startIndex][endIndex] = true;
            if (!directed) {
                edges[endIndex][startIndex] = true;
            }
        } else {
            System.out.println("Error: Al menos uno de los vértices no existe en el grafo.");
        }
    }

    public void printGraph() {
        for (int i = 0; i < vertices.size(); i++) {
            for (int j = 0; j < vertices.size(); j++) {
                if (edges[i][j]) {
                    System.out.println(vertices.get(i) + " -> " + vertices.get(j));
                }
            }
        }
    }
}


