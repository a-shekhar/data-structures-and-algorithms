package arrays.search;

import java.util.stream.IntStream;

public class LinearSearch {
    
     public int search(int arr[], int x) {
        return IntStream.range(0, arr.length-1).filter(i -> arr[i] == x).findFirst().orElse(-1);
    }
}
