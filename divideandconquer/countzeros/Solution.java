public class Solution {
    int countZeroes(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while(left<= right){
            mid = left + (right - left)/2;
            if(arr[mid] == 0 && (mid == 0 || arr[mid-1] == 1)){
                return arr.length - mid;
            }else if(arr[mid] == 1){
                left = mid + 1;
            } else{
                right = mid - 1;
            }   
        }
        
        return 0;
    }
}
