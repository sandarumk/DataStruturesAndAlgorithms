package Algorithms.GraphAlgorithms;

/**
 * Created by dinu on 12/31/16.
 */
public class DepthFirstSearch {

    public boolean DFSAdjacencyList(GraphNode src, GraphNode dest){
        if(src == null){
            return false;
        }
        if(src == dest){
            return true;
        }
        src.visited = true;
        for(GraphNode node: src.neighbors){
            if(!node.visited){
                DFSAdjacencyList(node,dest);
            }

        }
        return false;
    }


}
