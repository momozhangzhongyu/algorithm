package com.leetcode.january.january17;

/**
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 *
 * 你应当 保留 两个分区中每个节点的初始相对位置。
 */
public class Partition_86 {
    public static ListNode partition(ListNode head, int x) {
        ListNode pre = null;
        ListNode suc = null;
        ListNode retNodePre = null;
        ListNode retNodeSuc = null;
        ListNode cur = head;
        while (cur != null){
            ListNode next = cur.next;
            if(cur.val < x){
                if(pre == null){
                    pre = cur;
                    cur.next = null;
                    retNodePre = pre;
                }else {
                    pre.next = cur;
                    cur.next = null;
                    pre = pre.next;
                }
            }else {
                if(suc == null){
                    suc = cur;
                    cur.next = null;
                    retNodeSuc = suc;
                }else {
                    suc.next = cur;
                    cur.next = null;
                    suc = suc.next;
                }
            }
            cur = next;
        }
        ListNodeUtils.printListNode(retNodePre);
        ListNodeUtils.printListNode(retNodeSuc);
        System.out.println();
        ListNode retNode = retNodePre;
        if(retNode == null) {
            retNode = retNodeSuc;
        }else {
            pre.next = retNodeSuc;
        }
        ListNodeUtils.printListNode(retNode);
        ListNodeUtils.printListNode(retNodePre);
        ListNodeUtils.printListNode(retNodeSuc);
        return retNode;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,5,2};
        ListNode head = ListNodeUtils.createLinkedList(arr);
        ListNodeUtils.printListNode(head);
        partition(head, 3);
    }
}
