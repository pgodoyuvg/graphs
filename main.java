/*
 * José Gerardo Ruiz García - 23719
 * Humberto Alexander de la Cruz Chanchavac - 23735
 * Gerardo André Fernández Cruz - 23763
 * Daniel Oswaldo Juárez Herrera - 23709
 * Andrés Alberto Mazariegos Escobar - 21749
 */
public class Main {
    public static void main(String[] args) {
        Graph<String, String> graph = new Graph<>();
        
        // Se crean los vertices del grafo.
        graph.createVertex("1");
        graph.createVertex("2");
        graph.createVertex("3");

        /* Ejemplo:
            El metodo createRelation recibe como primer parámetro el vertice a crearle su relación, 
            en este ejemplo al vertice con llave 1 se le crean dos relaciones con el vértice 2 y 3, al ejecutar el programa
            se verán las relaciones con el vertice creado.
        */
        Vertex vertex;
        vertex = graph.createRelation("1", "2");
        vertex = graph.createRelation("1", "3");
    
        CustomList<String> neighbors = vertex.getNeighbors();

        System.out.println("Relaciones:");
        for (String string : neighbors) {
            System.out.println(vertex.getKey() + " -> " + string);
        }
    }
}
