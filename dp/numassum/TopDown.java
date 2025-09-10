package dp.numassum;

import java.util.Arrays;

public class TopDown {

    private static int computeWays(int n, int[] memo){

        if(memo[n] != -1){
            return memo[n];
        }

        int res1 = computeWays(n - 1, memo);
        int res2 = computeWays(n - 3, memo);   
        int res3 = computeWays(n - 4, memo);
        memo[n] = res1 + res2 + res3;
        return memo[n];
    }

    public static int countWays(int n){
        if(n < 0){
            return 0;
        }

        if(n <= 2) {
            return 1;
        }

        if(n == 3){
            return 2;
        }

        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        memo[0] = 1;
        memo[1] = 1;
        memo[2] = 1;
        memo[3] = 2;
        return computeWays(n, memo);
    }

    public static void main(String[] args) {
        System.out.println(countWays(5)); // Output: 4
    }
}
