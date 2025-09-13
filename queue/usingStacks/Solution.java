
import java.util.Stack;

public class Solution {

    Stack<Integer> input = new Stack();
    Stack<Integer> output = new Stack();
    
    public void push(int val) {
        input.push(val);    
    }

    public int pop() {
        shiftStacks();
        return output.isEmpty() ? -1 :output.pop();
    }

    public int peek() {
        shiftStacks();
        return output.isEmpty() ? - 1: output.peek();
    }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    // shift stacks only when needed
    private void shiftStacks(){
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.pop());
            }
        }
    }
}
