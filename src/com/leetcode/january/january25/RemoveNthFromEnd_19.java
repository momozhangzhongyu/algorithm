package com.leetcode.january.january25;

public class RemoveNthFromEnd_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i = 0;
        ListNode dummmyHead = new ListNode(0, head);
        ListNode cur = dummmyHead;
        while (cur != null){
            i++;
            cur = cur.next;
        }
        i = i - 1;//链表元素个数
        i = i - n;//删除节点的上一个节点索引
        ListNode pre = dummmyHead;//赋值占了一次遍历次数
        for(int j = 0; j < i; j++){//遍历次数减一
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return dummmyHead.next;
    }

}
