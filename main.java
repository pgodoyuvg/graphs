public class Main {
    public static void main(String[] args) {
        // Crear nodos
        Vertex<String, String> leonardo = new Vertex<>("Leonardo Mejía", "Estudiante de Ing. en Computación");
        Vertex<String, String> mariaJose = new Vertex<>("Maria José Girón", "Estudiante de Ing. en Computación");
        Vertex<String, String> joseJuan = new Vertex<>("José Juan", "Estudiante de Nutrición");

        leonardo.addNeighbor(mariaJose.getKey());
        leonardo.addNeighbor(joseJuan.getKey());
        mariaJose.addNeighbor(leonardo.getKey());
        mariaJose.addNeighbor(joseJuan.getKey());
    

        System.out.println("Amigos de Leonardo Mejía:");
        leonardo.getNeighbors();
        System.out.println("\nAmigos de Maria José Girón:");
        mariaJose.getNeighbors();
        System.out.println("\nAmigos de José Juan:");
        joseJuan.getNeighbors();
    }
}
