package linkedlist.removedups;

import linkedlist.ListNode;

public class RemoveDupsWithoutBuffer {
    
     public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode curr = head;
        ListNode temp;
        
        while(curr != null){
            temp = curr;
            while(temp != null && temp.next != null){
                if(temp.next.val == curr.val){
                    temp.next = temp.next.next;
                }else{
                    temp = temp.next;
                }
            }
            curr = curr.next;
        }
        
        return head;
    }
}
