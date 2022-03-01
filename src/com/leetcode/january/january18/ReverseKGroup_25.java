package com.leetcode.january.january18;


/**
 * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
 * k 是一个正整数，它的值小于或等于链表的长度。
 * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 *
 * 进阶：
 * 你可以设计一个只使用常数额外空间的算法来解决此问题吗？
 * 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
 */
public class ReverseKGroup_25 {
    public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummmyHead = new ListNode(0, head);
        ListNode p = dummmyHead;
        while (p.next != null){
            ListNode now = p.next;//上一个节点
            ListNode pre = null;
            ListNode tail = null;
            ListNode next = null;
            int i = 1;
            while (i <= k && now != null){
                ListNode cur = now;
                ListNode next1 = cur.next;
                if(i == 1){
                    tail = cur;
                }
                cur.next = pre;
                pre = cur;
                now = next1;
                if(i == k){
                    next = next1;
                    tail.next = next;
                    p.next = pre;
                    p = tail;
                }
                i++;
            }
            System.out.println(i);
            System.out.println(k);
            if((i-1)%k == 0){
                ListNodeUtils.printListNode(dummmyHead.next);
            }else {
                break;
            }
        }
        return dummmyHead.next;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ListNode head = ListNodeUtils.createLinkedList(arr);
        ListNodeUtils.printListNode(head);
        head = reverseKGroup(head, 2);
        ListNodeUtils.printListNode(head);

    }
}
