package com.leetcode.january.january17;

/**
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 *
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 *
 */
public class OddEvenList_328 {
    public ListNode oddEvenList(ListNode head) {
        ListNode pre = null;
        ListNode suc = null;
        ListNode retNodePre = null;
        ListNode retNodeSuc = null;
        ListNode cur = head;
        int i = 1;
        while (cur != null){
            ListNode next = cur.next;
            if(i%2 != 0){
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
            i++;
            cur = next;
        }
        ListNode retNode = retNodePre;
        if(retNode == null) {
            retNode = retNodeSuc;
        }else {
            pre.next = retNodeSuc;
        }
        return retNode;
    }
}
