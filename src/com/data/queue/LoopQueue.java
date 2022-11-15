package com.data.queue;

public class LoopQueue<E> implements Queue<E> {

    private E[] data;

    private int size;

    private int front,tail;

    public LoopQueue(int capacity){
        data = (E[]) new Object[capacity+1];
        size = 0;
        front = 0;
        tail = 0;
    }

    public LoopQueue(){
        this(10);
    }

    private void resize(int newCapacity){
        E[] newData = (E[]) new Object[newCapacity];
        for(int i = 0; i < size; i++){
            newData[i] = data[(front+i)%data.length];
        }
        data = newData;
        front = 0;
        tail = size - 1;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E e) {
        if(size == data.length-1){
            resize(size * 2);
        }
        data[(tail)%data.length] = e;
        tail++;
        size++;
    }

    @Override
    public E dequeue() {
        E e = data[front%data.length];
        data[front%data.length] = null;
        front++;
        size--;
        return e;
    }

    @Override
    public E getFront() {
        return data[front%data.length];
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("LoopQueue capacity: ");
        sb.append(data.length + " , size : ");
        sb.append(size + " , data front [ ");
        for(int i = front; i < tail; i++){
            sb.append(data[i%data.length]);
            if(i != tail-1){
                sb.append(", ");
            }
        }
        sb.append(" ] tail ") ;
        return sb.toString();
    }
}
