package divideandconquer.noOfOccurances;

public class Solution {
    int findFirstOccurance(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while(left <= right){
            mid = left + (right - left)/2;
            if(arr[mid] == target && (mid == 0 || arr[mid-1] < target)){
                return mid;
            } else if(arr[mid] < target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        
        return -1;
    }

    int findLastOccurance(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int mid;
        while(left <= right){
            mid = left + (right - left)/2;
            if(arr[mid] == target && (mid == arr.length - 1 || arr[mid + 1] > target)){
                return mid;
            } else if(arr[mid] <= target){
                left = mid + 1;
            } else{
                right = mid - 1;
            }
        }
        
        return -1;
    }

    int countFreq(int[] arr, int target) {
        int first = findFirstOccurance(arr, target);
        if(first == -1) return 0;
        int last = findLastOccurance(arr, target);
        return last - first + 1;
    }
}
