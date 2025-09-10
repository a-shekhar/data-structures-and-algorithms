package linkedlist.deleteMiddleNode;

import linkedlist.ListNode;

public class Solution {
    
    ListNode deleteMiddle(ListNode head, int k) {
        
        ListNode fast = head; 
        ListNode slow = new ListNode(-1);
        slow.next = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
        return slow;
    }
}
