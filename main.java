public class main {
    public static void main(String[] args) {
        // Crear un grafo
        Graph<String, String> grafo = new Graph<>();
        
        // Añadir vértices
        grafo.addVertex("Gabriel Quan", "Compu");
        grafo.addVertex("Anthony Lou", "Compu");
        grafo.addVertex("Francisco Martinez", "Compu");
        grafo.addVertex("Oliver Viau", "Compu");
        grafo.addVertex("Fabian Morales", "Compu");
        
        // Añadir aristas
        grafo.addEdge("Gabriel Quan", "Anthony Lou");
        grafo.addEdge("Gabriel Quan", "Francisco Martinez");
        grafo.addEdge("Anthony Lou", "Oliver Viau");
        grafo.addEdge("Francisco Martinez", "Fabian Morales");
        
        // Mostrar vértices y vecinos
        for (int i = 0; i < grafo.vertices.size(); i++) {
            Vertex<String, String> vertex = grafo.vertices.get(i);
            System.out.println("Vértice: " + vertex.getKey() + " - " + vertex.getValue());
            System.out.println("Vecinos:");
            vertex.getNeighbors();
            System.out.println();
        }
    }
}

