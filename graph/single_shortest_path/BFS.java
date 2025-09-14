package graph.single_shortest_path;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

// BFS Algorithm.
public class BFS {
    public int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
        int[] result = new int[adj.size()];
        Arrays.fill(result, -1); // fill with maximum value
        
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(src);
        result[src] = 0;
        int popped;

        while(!queue.isEmpty()){
            popped = queue.poll();
            List<Integer> neighborList = adj.get(popped);
            for(int neighbor : neighborList){
                if(result[neighbor] == -1){ // seeing for very first time
                    result[neighbor] = result[popped] + 1; 
                }
            }
        }

        return result;
    }
}
