
public class Solution {

    QueueNode front, rear;

    // Function to push an element into the queue.
    void push(int a) {
        QueueNode newNode = new QueueNode(a);
        if (front == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Function to pop front element from the queue
    int pop() {
        if (front == null) {
            front = null;
            rear = null;
            return -1;
        }

        int popped = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return popped;
    }
}

class QueueNode {

    int data;
    QueueNode next;

    QueueNode(int a) {
        data = a;
        next = null;
    }
}
