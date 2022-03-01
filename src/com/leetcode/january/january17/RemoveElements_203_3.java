package com.leetcode.january.january17;

public class RemoveElements_203_3 {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode cur = head;
        while (cur.next != null){
            if(cur.next.val == val){
                ListNode delNode = cur.next;
                cur.next = delNode.next;
                delNode.next = null;
            }else {
                cur = cur.next;
            }
        }
        if(head.val == val) return head.next;
        return head;
    }
}
