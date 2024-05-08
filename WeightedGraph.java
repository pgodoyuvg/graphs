public class WeightedGraph extends GraphMatrix {
    private int[][] weights;

    public WeightedGraph(boolean directed) {
        super(directed);
        this.weights = new int[2500][2500];
        this.weighted = true;
    }

    public void addEdge(Integer start, Integer end, int weight) {
        int startIndex = vertices.indexOf(start);
        int endIndex = vertices.indexOf(end);

        if (startIndex != -1 && endIndex != -1) {
            weights[startIndex][endIndex] = weight;
            if (!directed) {
                weights[endIndex][startIndex] = weight;
            }
        } else {
            System.out.println("Error: Al menos uno de los vértices no existe en el grafo.");
        }
    }

    public void printWeightedGraph() {
        for (int i = 0; i < vertices.size(); i++) {
            for (int j = 0; j < vertices.size(); j++) {
                if (weights[i][j] != 0) {
                    System.out.println(vertices.get(i) + " --(" + weights[i][j] + ")--> " + vertices.get(j));
                }
            }
        }
    }
}


