package stack.stackOfPlates;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class DinnerPlates {

    private TreeMap<Integer, Stack<Integer>> map;
    private int capacity;

    public DinnerPlates(int capacity) {
        map = new TreeMap<>();
        map.put(0, new Stack<>());
        this.capacity = capacity;
    }

    public void push(int val) {
        for (Map.Entry<Integer, Stack<Integer>> entry : map.entrySet()) {
            Stack<Integer> st = entry.getValue();
            if (st.size() < capacity) {
                st.push(val);
                return;
            }
        }

        // if not able to push
        int key = map.isEmpty() ? 0 : map.lastKey() + 1;
        Stack<Integer> st = new Stack<>();
        st.push(val);
        map.put(key, st);
    }

    public int pop() {
        // Iterate in reverse order
        int popped = -1;
        for (Map.Entry<Integer, Stack<Integer>> entry : map.descendingMap().entrySet()) {
            Stack<Integer> st = entry.getValue();
            if (!st.empty()) {
                popped = st.pop();
                if (st.isEmpty() && entry.getKey().equals(map.lastKey())) {
                    trimRight();
                }
                return popped;
            }
        }

        return popped;
    }

    public int popAtStack(int index) {
        int popped = -1;
        if (map.containsKey(index)) {
            Stack<Integer> st = map.get(index);
            if (st == null || st.isEmpty()) {
                return -1;
            }

            popped = st.pop();

            if (st.isEmpty() && index == map.lastKey()) {
                trimRight();
            }
        }

        return popped;
    }

    private void trimRight() {
        while (!map.isEmpty()) {
            int lastKey = map.lastKey();
            if (map.get(lastKey).isEmpty()) {
                map.remove(lastKey);
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        DinnerPlates obj = new DinnerPlates(2);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.popAtStack(0);
        obj.push(20);
        obj.push(21);
        obj.popAtStack(0);
        obj.popAtStack(2);
        //obj.pop();
    }
}
