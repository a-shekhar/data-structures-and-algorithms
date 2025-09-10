package dp.houserobber;

import java.util.Arrays;

public class TopDown {

    private static int findMaxStolenMoney(int n, int[] memo, int[] arr){
        
        if (n < 0){
            return 0; // no house left
        } 
        if (n == 0) {
            return arr[0]; // only first house
        }



        if(memo[n] != -1){
            return memo[n];
        }

       int stealCurrentHouse = arr[n] + findMaxStolenMoney(n - 2, memo, arr);
       int skipCurrentHouse = findMaxStolenMoney(n - 1, memo, arr);
        memo[n] = Math.max(stealCurrentHouse, skipCurrentHouse);
        return memo[n];
    }

    public int findMaxSum(int arr[]) {
        int n = arr.length;
        if(n == 1){
            return arr[0];
        }
        if(n == 2){
            return Math.max(arr[0], arr[1]);
        }
        
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        
        memo[0] = arr[0];
        memo[1] = Math.max(arr[0], arr[1]);

        return findMaxStolenMoney(n - 1, memo, arr);
    }
}
