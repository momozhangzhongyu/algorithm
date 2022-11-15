package com.data.linkedlist;

public class LinkList<E> {

    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e, null);
        }

        public Node(){
            this(null, null);
        }

        @Override
        public String toString(){
            return e.toString();
        }
    }

    private Node head;
    private int size;

    public LinkList(){
        this.head = null;
        this.size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }


    public void addFirst(E e){
        head = new Node(e, head);
        size++;
    }

    public void add(int index, E e){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("add failed, Illegal index.");
        }
        if(index == 0){
            addFirst(e);
        }else {
            Node pre = head;
            for(int i = 1; i < index; i++){
                pre = pre.next;
            }
            pre.next = new Node(e, pre.next);
            size++;
        }

    }
}
