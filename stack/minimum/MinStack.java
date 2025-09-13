package stack.enhancedParenthesisChecker;

import java.util.Stack;

class MinStack {

     Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();    
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || (!minStack.isEmpty() && minStack.peek() >= val)){
            minStack.push(val);
        }
    }
    
    public void pop() {
       if(!stack.isEmpty()){
            if(stack.peek().equals(minStack.peek())){
                stack.pop();
                minStack.pop();
            }else{
                stack.pop();
            }
       }
    }
    
    public int top() {
        return stack.isEmpty() ? -1 : stack.peek();   
    }
    
    public int getMin() {
        System.out.println(minStack);
        return minStack.isEmpty() ? -1: minStack.peek();
    }
}
