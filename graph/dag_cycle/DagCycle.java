package graph.dag_cycle;

import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

// Kahn Algorithm.
public class DagCycle {
    public boolean isCyclic(int V, int[][] edges) {
        int[] indegrees = new int[V];
        ArrayList<ArrayList<Integer>> neighbors = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        
        for(int i = 0;  i < V; i++){
            neighbors.add(new ArrayList<>());
        }
        
        for(int[] edge : edges){
            ArrayList<Integer> neigh = neighbors.get(edge[0]);
            neigh.add(edge[1]); 
            indegrees[edge[1]]++;
        }
        
        for(int i = 0; i < V; i++){
            if(indegrees[i] == 0){
                queue.offer(i);
            }
        }

        
        while(!queue.isEmpty()){
            Integer polled = queue.poll();
            count++;
            for(int neigh : neighbors.get(polled)){
                indegrees[neigh]--;
                if(indegrees[neigh] == 0){
                    queue.offer(neigh);
                }
            } 
        }
        return count == V ? true : false;
    }
}
