package com.leetcode.january.january13;


/**
 * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 *
 */
public class RotateRight_61 {

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        ListNode cur = head;
        int i = 1;
        //循环结果 cur.next == null  也就是说 cur是最后一个元素
        while (cur.next != null){
            cur = cur.next;
            i++;
        }
        if(k > i){
            k = k%i;
        }
        if(k == 0 || k == i) return head;
        cur.next = head;
        ListNode end = head;
        k = i - k;
        while (k != 0){
            ListNode next = end.next;
            k--;
            if(k == 0){
                end.next = null;
                return next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 25;
        System.out.println(25%5);
    }
}
