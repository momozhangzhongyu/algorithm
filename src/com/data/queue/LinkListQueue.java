package com.data.queue;

import com.data.linkedlist.DHLinkList;

public class LinkListQueue<E> implements Queue<E> {

    private DHLinkList<E> data;

    public LinkListQueue(){
        data = new DHLinkList<>();
    }

    @Override
    public int getSize() {
        return data.getSize();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        data.addFirst(e);
    }

    @Override
    public E dequeue() {
        return data.removeLast();
    }

    @Override
    public E getFront() {
        return data.getLast();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("LinkListQueue size: " + data.getSize());
        sb.append(" , content : front [ ");
        for(int i=0; i< data.getSize(); i++){
            sb.append(data.get(i) + "--> ");
        }
        sb.append(" NULL ] tail");
        return sb.toString();
    }
}
