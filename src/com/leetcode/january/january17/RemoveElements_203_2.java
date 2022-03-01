package com.leetcode.january.january17;

public class RemoveElements_203_2 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0, head);
        ListNode cur = dummyHead;
        while (cur.next != null){
            if(cur.next.val == val){
                ListNode delNode = cur.next;
                cur.next = delNode.next;
                delNode.next = null;
            }else {
                cur = cur.next;
            }
        }
        ListNode retNode = dummyHead.next;
        return retNode;
    }
}
