package com.data.stack;

import com.data.linkedlist.DHLinkList;

public class LinkStack<E> implements Stack<E> {

    private DHLinkList<E> data;

    public LinkStack(){
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
    public void push(E e) {
        data.addFirst(e);
    }

    /**
     * 取出第一个
     *
     * @return
     */
    @Override
    public E pop() {
        return data.removeFirst();
    }

    /**
     * 看一眼第一个
     *
     * @return
     */
    @Override
    public E peek() {
        return data.getFirst();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("LinkStack size: " + data.getSize());
        sb.append(" , content : ");
        for(int i = 0; i < data.getSize(); i++)
            sb.append(data.get(i) + " --> ");
        sb.append("NULL");
        return sb.toString();
    }
}
