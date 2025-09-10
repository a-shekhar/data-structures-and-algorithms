public class Solution {
    public static int countWays(int n) {
        if(n < 0){
            return 0;
        }
        
        if(n <= 2) {
            return 1;
        }

        // if(n == 3) {
        //     return 2;
        // }

        int res1 = countWays(n - 1);
        int res2 = countWays(n - 3);
        int res3 = countWays(n - 4);
        return res1 + res2 + res3;
    }

    public static void main(String[] args) {
        System.out.println(countWays(4)); // Output: 2
    }
}
