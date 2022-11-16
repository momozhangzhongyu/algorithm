package com.data.queue;

public class LinkQueue<E> implements Queue<E> {

    private class Node{
        public Node next;
        public E e;

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

    private Node head,tail;
    private int size;

    public LinkQueue(){
        head = null;
        tail = null;
        size = 0;
    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    /**
     * 添加至队列末尾
     * @param e
     */
    @Override
    public void enqueue(E e) {
        if(size == 0){
            head=tail=new Node(e, null);
            size++;
            return;
        }
        tail.next = new Node(e, null);
        tail = tail.next;
        size++;
    }

    /**
     * 删除最前面的节点
     * @return
     */
    @Override
    public E dequeue() {
        if(size == 0)
            throw new IllegalArgumentException("LinkQueue is empty!");
        Node delNode = head;
        if(size == 1)
            head = tail = null;
        else
            head = head.next;
        size--;
        return delNode.e;
    }

    @Override
    public E getFront() {
        if (size == 0)
            return null;
        return head.e;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("LinkQueue size : " + size);
        sb.append(" , content : front [ ");
        Node cur = head;
        for(int i = 0; i < size; i++){
            sb.append(cur.e + "--> ");
            cur = cur.next;
        }
        sb.append(" NULL ] tail");
        return sb.toString();
    }
}
