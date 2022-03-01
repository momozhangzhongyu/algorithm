package com.leetcode.january.january17;

/**
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现 的数字。
 */
public class DeleteDuplicates_82_2 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummmyHead = new ListNode(0, head);
        ListNode cur = dummmyHead;
        while (cur.next != null){
            System.out.println(cur.next.val);
            if(cur.next.next != null && cur.next.val == cur.next.next.val){
                ListNode delNode = cur.next;
                int x = delNode.next.val;
                delNode = delNode.next;
                while (delNode.next != null && delNode.next.val == x){
                    delNode = delNode.next;
                }
                cur.next = delNode.next;
            }else {
                cur = cur.next;
            }
        }
        return dummmyHead.next;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,4,5};
        ListNode head = ListNodeUtils.createLinkedList(arr);
        ListNodeUtils.printListNode(head);
        head = deleteDuplicates(head);
        ListNodeUtils.printListNode(head);

    }
}
