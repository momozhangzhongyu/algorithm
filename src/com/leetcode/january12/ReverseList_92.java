package com.leetcode.january12;

public class ReverseList_92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode leftNode = null;
        ListNode pre = null;
        ListNode cur = head;
        ListNode curUp = head;
        ListNode curDown = head;
        int i = 0;
        while (cur != null){
            ListNode next = cur.next;
            if(i < left){
                curUp = cur;
            }else if(i >= left && i <= right){
                if(i==left) leftNode = cur;
                curDown = cur;
                curDown.next = pre;
                pre = curDown;
            }else if(i == right + 1){
                curUp.next = pre;
                leftNode.next = cur;
            }
            cur = next;
            i++;
        }
        if(i == right + 1){
            curUp.next = pre;
            leftNode.next = cur;
        }
        return head;
    }

}
