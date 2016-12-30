package TreesTriesAndGraphs;

import java.util.List;

/**
 * This graph is undirected
 * The representation is  adjacency list
 * Created by dinu on 12/30/16.
 */
public class UndirectedGraphAdjacencyList {
    private GraphNode[] graph;
    private int nodesNo;

    public UndirectedGraphAdjacencyList(int nodeCount){
        nodesNo = nodeCount;
        graph = new GraphNode[nodesNo];
    }

}

class GraphNode{
    List<GraphNode> neighbors;
    int data;
}
