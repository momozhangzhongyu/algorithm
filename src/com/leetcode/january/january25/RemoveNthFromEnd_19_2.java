package com.leetcode.january.january25;

public class RemoveNthFromEnd_19_2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummmyHead = new ListNode(0, head);
        ListNode a = dummmyHead;
        ListNode b = dummmyHead;
        for(int i = 0 ; i < n + 1; i++ ){
            b = b.next;
        }
        while (b != null){
            b = b.next;
            a = a.next;
        }
        a.next = a.next.next;
        return dummmyHead.next;
    }

}
