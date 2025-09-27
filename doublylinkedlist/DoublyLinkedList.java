package doublylinkedlist;

import java.util.ArrayList;

class Node {

    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        next = prev = null;
    }
}

public class DoublyLinkedList {

    Node insertAtPos(Node head, int index, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            return newNode;
        }

        // if(head.next == null){
        //     head.next = newNode;
        //     return head;
        // }
        Node curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        newNode.next = curr.next;
        newNode.prev = curr;
        curr.next = newNode;
        return head;
    }

    public static ArrayList<Integer> displayList(Node head) {
        ArrayList<Integer> result = new ArrayList<>();
        Node curr = head;
        while (curr != null) {
            result.add(curr.data);
            curr = curr.next;
        }

        return result;
    }

     public Node delPos(Node head, int index) {
        if(head.next == null){
            return null;
        }
        Node curr = head;
        Node prev = head;

        for(int i = 1; i < index; i++){
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;
        curr.next.prev = prev;
        return head;
    }

}
