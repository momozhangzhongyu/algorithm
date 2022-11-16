package com.data.linkedlist;

public class DHLinkList<E> {

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

    private Node dummyHead;
    private int size;

    public DHLinkList(){
        this.dummyHead = new Node();
        this.size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(int index, E e){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("index illegal!");
        }
        Node pre = dummyHead;
        for(int i=0; i < index; i++){
            pre = pre.next;
        }
        pre.next = new Node(e, pre.next);
        size++;
    }

    public void addFirst(E e){
        add(0, e);
    }

    public void addLast(E e){
        add(size, e);
    }

    public E remove(int index){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("index illegal!");
        }
        Node pre = dummyHead;
        for(int i=0; i < index; i++){
            pre = pre.next;
        }
        Node delNode = pre.next;
        pre.next = delNode.next;
        delNode.next = null;
        size--;
        return delNode.e;
    }

    public E removeFirst(){
        return remove(0);
    }

    public E removeLast(){
        return remove(size - 1);
    }

    public int removeElement(E e){
        Node pre = dummyHead;
        for(int i=0; i<size-1; i++){
            if(pre.next.e.equals(e)){
                Node delNode = pre.next;
                pre.next = delNode.next;
                size--;
                delNode.next = null;
                return i;
            }
            pre = pre.next;
        }
        return -1;
    }

    public int contain(E e){
        Node cur = dummyHead;
        for(int i=0; i<size; i++){
            cur = cur.next;
            if(cur.e.equals(e)){
                return i;
            }
        }
        return -1;
    }

    public E getFirst(){
        return get(0);
    }

    public E getLast(){
        return get(size-1);
    }

    public E get(int index){
        if(index < 0 || index > size-1){
            throw new IllegalArgumentException("index illegal!");
        }
        if(size == 0)
            return null;
        Node cur = dummyHead;
        for(int i=0; i<=index; i++){
            cur = cur.next;
        }
        return cur.e;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("DHLinkList size: " + size);
        sb.append(" content : ");
        Node cur = dummyHead;
        for(int i=0; i < size; i++){
            cur = cur.next;
            sb.append(cur.e + "--> ");
        }
        sb.append("NULL");
        return sb.toString();
    }






















}
