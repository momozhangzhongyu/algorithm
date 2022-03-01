package com.leetcode.january.january12;

public class ReverseList_92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode leftNode = null;
        ListNode rightNode = null;
        ListNode pre = null;
        ListNode cur = head;
        int i = 1;
        while (cur != null){
            ListNode next = cur.next;
            if(i == left-1){
                pre = cur;
            }else if(i >= left && i <= right){
                if(i==left){
                    leftNode = cur;
                }
                cur.next = rightNode;
                rightNode = cur;
                if(i==right){
                    leftNode.next = next;
                    if(pre == null) return rightNode;
                    pre.next = rightNode;
                    break;
                }
            }
            cur = next;
            i++;
        }
        return head;
    }

}
