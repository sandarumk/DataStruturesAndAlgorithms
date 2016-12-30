package TreesTriesAndGraphs;

/**
 * Adjacency matrix representation of a grapgh
 * If directed the matrix will be symmetric
 * If an edge exists between two nodes we put a one else keep the zero
 * Every node should have an index in teh array
 * Created by dinu on 12/30/16.
 */
public class GraphAdjacencyMatrix {
    private int numOfNodes ;
    private int[][] graph;

    public GraphAdjacencyMatrix(int nodesNo){
        numOfNodes = nodesNo;
        graph = new int[numOfNodes][numOfNodes];
    }
}

