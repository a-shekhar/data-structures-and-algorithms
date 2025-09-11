package stack.enhancedParenthesisChecker;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution {
    public static boolean isBalanced(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        
        for(Character ch : s.toCharArray()){
            if(map.containsKey(ch)){
                if(stack.isEmpty()){
                    return false;
                }
                if(!stack.peek().equals(map.get(ch))){
                    return false;
                }
                stack.pop();
            } else {
                if(ch == '(' || ch == '{' || ch == '['){
                    stack.push(ch);
                }
            }

            //System.out.println(stack);
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = """
                Aditya raj ())
                """;
        System.out.println(isBalanced(s));
    }
}
