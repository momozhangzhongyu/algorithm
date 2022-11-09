package com.data.queue;

import com.data.arr.Array;

public class ArrayQueue<E> implements Queue<E> {

    private Array<E> data;

    public ArrayQueue(){
        data = new Array<>();
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
        data.addLast(e);
    }

    @Override
    public E dequeue() {
        return data.removeFirst();
    }

    @Override
    public E getFront() {
        return data.getFirst();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("ArrayQueue size : ");
        sb.append(data.getSize() + " , content : front [ ");
        for(int i = 0; i < data.getSize(); i++){
            sb.append(data.get(i));
            if(i != data.getSize() - 1){
                sb.append(",");
            }
        }
        sb.append(" ] tail");
        return sb.toString();
    }
}
