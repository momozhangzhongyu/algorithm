package com.leetcode.january.january17;

/**
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现 的数字。
 */
public class DeleteDuplicates_82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummmyHead = new ListNode(0, head);
        ListNode cur = dummmyHead;
        while (cur.next != null){
            if(cur.next.next != null && cur.next.val == cur.next.next.val){
                cur.next = removeElements(cur.next, cur.next.val);
            }else {
                cur = cur.next;
            }
        }
        return head;
    }


    private ListNode removeElements(ListNode head, int val) {
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
