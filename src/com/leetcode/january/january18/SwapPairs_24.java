package com.leetcode.january.january18;


/**
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 */
public class SwapPairs_24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummmyHead = new ListNode(0, head);
        ListNode p = dummmyHead;
        while (p.next != null && p.next.next != null){
            ListNode node1 = p.next;
            ListNode node2 = node1.next;

            node1.next = node2.next;
            node2.next = node1;
            p.next = node2;
            p = node1;
        }
        return dummmyHead.next;
    }

}
