package com.leetcode.january.january17;

/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 *
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 *
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 */
public class AddTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = l1.val + l2.val;
        int f = 0;
        if(sum >= 10){
            sum = sum - 10;
            f = 1;
        }
        ListNode l3 = new ListNode(sum);
        addTwoNumbers(l1.next, l2.next, l3, f);
        return l3;
    }

    public void addTwoNumbers(ListNode l1, ListNode l2, ListNode l3, int f) {
        if(l1 == null && l2 == null){
            if(f == 1){
                l3.next = new ListNode(1);
            }
            return;
        }
        int sum = f;
        if(l1 != null){
            sum += l1.val;
        }
        if(l2 != null){
            sum += l2.val;
        }
        f = 0;
        if(sum >= 10){
            sum = sum - 10;
            f = 1;
        }
        l3.next = new ListNode(sum);
        addTwoNumbers(l1== null ? null : l1.next, l2== null ? null : l2.next, l3.next, f);
    }
}
