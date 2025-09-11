package stack.stackUsingLinkedList;

public class Solution {

    StackNode top;

    // Function to push an integer into the stack.
    void push(int a) {
        StackNode newNode = new StackNode(a);
        if(top == null){
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        
    }

    // Function to remove an item from top of the stack.
    int pop() {
        if(top == null){
            return -1;
        }
        if(top.next == null){
            return top.data;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }
}

class StackNode {

    int data;
    StackNode next;

    StackNode(int a) {
        data = a;
        next = null;
    }
}
