package linkedlist.nthfromlastnode;

import linkedlist.ListNode;

public class Solution {
    int getKthFromLast(ListNode head, int k) {
        
        ListNode fast = head; 
        ListNode slow = head;
        
        for(int i = 0; i < k; i++){
            if(fast == null){
                return -1;
            }
            fast = fast.next;
        }
        
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        
        return slow.val;
    }
}
