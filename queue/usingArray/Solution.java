
import java.util.Arrays;

public class Solution {
    int front, rear;
    int arr[] = new int[100005];

    Solution() {
        front = 0;
        rear = 0;
        Arrays.fill(arr, -1);
    }

    // Function to push an element x in a queue.
    void push(int x) {
        arr[rear] = x;
        rear++;
    }

    // Function to pop an element from queue and return that element.
    int pop() {
       
       if(front == rear){
           return -1;
       }
       
       int popped = -1;
       
       if(front >= 0){
        popped = arr[front];
        front++;
       }

       return popped;
    }
}
