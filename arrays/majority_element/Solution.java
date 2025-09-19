package arrays.majority_element;

public class Solution {

    int majorityElement(int arr[]) {
        int candidate = arr[0];
        int count = 0;
        for(int num : arr){
            if(candidate == num){
                count++;
            }else{
                count--;
            }

            if(count == 0){
                candidate = num;
            }
        }

        return candidate;
    }
}
