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

    public void addLast(E e){
        add(size, e);
    }

    public E removeFirst(){
        E e = head.e;
        Node delNode = head;
        head = head.next;
        delNode.next = null;
        delNode = null;
        size--;
        return e;
    }

    public E remove(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("add failed, Illegal index.");
        }
        E e = null;
        if(index == 0){
            e = removeFirst();
        }else {
            Node pre = head;
            for(int i = 1; i < index; i++){
                pre = pre.next;
            }
            Node delNode = pre.next;
            pre.next = delNode.next;
            delNode.next = null;
            size--;
            e = delNode.e;
            delNode = null;
        }
        return e;
    }
    public E removeLast(){
        return remove(size - 1);
    }

    public int contain(E e){
        Node cur = head;
        if(cur.e.equals(e)){
            return 0;
        }
        for(int i=1; i < size; i++){
            cur = cur.next;
            if(cur.e.equals(e)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("LinkList size: "+ size);
        sb.append(" , content : ");
        Node now = head;
        for(int i=0; i<size;i++ ){
            sb.append(now.e);
            sb.append(" --> ");
            now = now.next;
        }
        sb.append("NULL");
        return sb.toString();
    }
}
