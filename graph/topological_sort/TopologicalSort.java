package graph.topological_sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Kahn’s Algorithm.
public class TopologicalSort {

    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> neighborsList = new ArrayList<>(V);
        int[] inbound = new int[V];

        for (int i = 0; i < V; i++) {
            neighborsList.add(new ArrayList<>()); // add an empty list at each index
        }

        for(int[] edge : edges){
            List<Integer> neighbors = neighborsList.get(edge[0]);
            neighbors.add(edge[1]);
            inbound[edge[1]]++;
        }
        
        //System.out.println(neighborsList);
        //System.out.println(Arrays.toString(inbound));

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0;  i < inbound.length; i++){
            if(inbound[i] == 0){
                queue.offer(i);
            }
        }


        //System.out.println(queue);
        ArrayList<Integer> result = new ArrayList<>();

        while(!queue.isEmpty()){
            Integer popped = queue.poll();
            result.add(popped);
            for(int neighbor : neighborsList.get(popped)){
                inbound[neighbor]--;
                if(inbound[neighbor] == 0){
                    queue.offer(neighbor);
                }
            }
        }
        
        //System.out.println(result);

        return result;
        
    }
}
