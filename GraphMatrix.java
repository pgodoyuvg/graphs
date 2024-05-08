import java.util.ArrayList;

public class GraphMatrix {
    private Graph<String, String> vertices = new Graph<>();

    // graph['a'] -> [b, f, e]

    /*
     * 186
     * 219
     * 537
     * 99
     * 625
     * 667
     * 412
     * 488
     * 383
     * 90
     * 345
     * 66
     * 490
     * 89
     * 22
     * 180
     * 262
     * 150
     * 183
     * 40
     * 253
     * 164
     * 165
     * 142
     * -------
     * 6,257
     * total posible: 1,000,000
     * 0.6257%
     */
    private boolean directed = false;
    private boolean weighted = false;

    public GraphMatrix(boolean directed) {
        
        this.directed = directed;
    }

    public void addVertex(String node) {
        vertices.addVertex(node, node);
        
    }

    /*
     * 6x6 matriz de adyacencia
     *    a  b  c  d  e  f  g
     * a [F][T][F][F][T][T][F]
     * b [T][F][T][F][F][F][F]
     * c [F][T][F][F][F][F][F]
     * d [F][F][F][F][T][F][F]
     * e [T][F][F][T][F][T][F]
     * f [T][F][F][F][T][F][F]
     * g [F][F][F][F][F][F][F]
     * 
     * [a,b,c,d,e,f,g]
     * a -> 0
     * b -> 1
     * 
     * 
     * [F][T][F][F][T][T][F]
     * [T][F][T][F][F][F][F]
     * [F][T][F][F][F][F][F]
     * [F][F][F][F][T][F][F]
     * [T][F][F][T][F][T][F]
     * [T][F][F][F][T][F][F]
     * [F][F][F][F][F][F][F]
     * 
     * 
     * [-1][1][-1][-1][3][2][-1]
     * [1][F][5][F][F][F][F]
     * [F][5][F][F][F][F][F]
     * [F][F][F][F][1][F][F]
     * [3][F][F][1][F][8][F]
     * [2][F][F][F][8][F][F]
     * [F][F][F][F][F][F][F]
     */

    public void addEdge(String start, String end) {
        vertices.addEdge(start, end);
    }
}