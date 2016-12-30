package Algorithms.GraphAlgorithms;


import com.sun.corba.se.impl.orbutil.graph.Graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 *
 * Created by dinu on 12/31/16.
 */
public class BreadthFirstSearch {

    public boolean BFSAdjacencyList(GraphNode src, GraphNode dest){
        if(src == null){
            return false;
        }else{
            Queue<GraphNode> visitQueue = new LinkedList<>();
            visitQueue.add(src);
            src.visited = true;
            if(src == dest){
                return true;
            }
            while((!visitQueue.isEmpty())){
                GraphNode node = visitQueue.poll();
                node.visited =true;
                for (GraphNode iterator: node.neighbors){
                    if(iterator == dest){
                        return true;
                    }
                    if(iterator.visited){
                        continue;
                    }
                    visitQueue.add(iterator);
                }
            }
        }
        return false;
    }
}

class GraphNode{
    List<GraphNode> neighbors;
    int data;
    boolean visited;
}
