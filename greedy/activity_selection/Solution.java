package greedy.activity_selection;

import java.util.Arrays;

public class Solution {
    public int activitySelection(int[] start, int[] finish) {
        int n = start.length;
        int[][] intervals = new int[n][2];
        for(int i=0; i<start.length; i++){
            intervals[i][0] = start[i];
            intervals[i][1] = finish[i];
        }
        
        // sort the array based on finish time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        // select first activity
        int count = 1;
        int lastActivityTime = intervals[0][1];

        for(int i = 1; i <n; i++){
            if(intervals[i][0] >= lastActivityTime){
                count++;
                lastActivityTime = intervals[i][1];
            }
        }
        
        return count;
    }
}
