package com.data.linkedlist;

public class LinkListTest {

    public static void main(String[] args) {
        DHLinkList<Integer> list = new DHLinkList<>();
        for(int i = 0; i < 10; i++){
            list.addLast(i);
        }
        System.out.println(list);

        for(int i = 10; i < 20; i++){
            list.addFirst(i);
        }
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        list.add(2, 666);
        System.out.println(list);
        System.out.println(list.contain(666));
        System.out.println(list.removeElement(666));
        System.out.println(list);
        list.addFirst(888);
        System.out.println(list);
    }
}
