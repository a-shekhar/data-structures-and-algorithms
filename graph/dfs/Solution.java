package graph.dfs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>();
        if (adj.isEmpty()) {
            return result;
        }
        
        Set<Integer> visited = new HashSet();
        visited.add(0);

        dfsHelper(0, result, visited, adj);

        return result;
    }

    private List<Integer> dfsHelper(Integer vertex, ArrayList<Integer> result, Set<Integer> visited, ArrayList<ArrayList<Integer>> adj){
     
        result.add(vertex);
        
        for(Integer neighbor : adj.get(vertex)){
            if(!visited.contains(neighbor)){
                visited.add(neighbor);
                dfsHelper(neighbor, result, visited, adj);
            }
        }

        return result;
    }
}
