package com.leetcode.january.january12;

/**
 * 给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。
 * 请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
 */
public class ReverseBetween_92 {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode pre = null;//前置
        ListNode suc = null;//后继
        ListNode leftNode = null;//左节点
        ListNode rightNode = null;//右节点
        ListNode cur = head;
        int i = 1;
        while (cur != null){
            System.out.println("cur=" + cur.val);
            ListNode next = cur.next;
            if(i < left){
                pre = cur;
            }else if(i >=left && i <= right){
                if(i==left){
                    leftNode = cur;
                }
                ListNode temp = cur;
                temp.next = rightNode;
                rightNode = temp;
                if(i==right){
                    leftNode.next = next;
                    if(pre == null){
                        return rightNode;
                    }else {
                        pre.next = rightNode;
                    }
                    break;
                }
            }
            cur = next;
            i++;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode();
        node1.val = 3;
        ListNode node2 = new ListNode();
        node2.val = 5;
        node1.next = node2;
        ListNode node3 = reverseBetween(node1, 1, 2);
        while (node3!= null){
            System.out.println(node3.val);
            node3 = node3.next;
        }

    }
}
