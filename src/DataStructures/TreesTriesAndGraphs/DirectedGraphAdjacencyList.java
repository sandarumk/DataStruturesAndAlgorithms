package DataStructures.TreesTriesAndGraphs;

import java.util.List;

/**
 * Adjacency List representation of a dorected graph
 * Created by dinu on 12/30/16.
 */
public class DirectedGraphAdjacencyList {

    private DirectedGraphNode[] graph;
    private int graphSize;

    public DirectedGraphAdjacencyList(int n){
        graphSize = n;
        graph = new DirectedGraphNode[graphSize];
    }

}

class DirectedGraphNode{
    int data;
    List<DirectedGraphNode> incoming;
    List<DirectedGraphNode> outgoing;
}