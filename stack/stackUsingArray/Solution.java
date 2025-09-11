package stack.stackUsingArray;

public class Solution {

    int[] stack = new int[10000];
    int top = -1;
    
    public void push(int x) {
        top++;
        stack[top] = x;
    }

    public int pop() {
       if(top >= 0){
        int popped = stack[top];
        top--;
        return popped;
       }
       return -1;
    }
}

