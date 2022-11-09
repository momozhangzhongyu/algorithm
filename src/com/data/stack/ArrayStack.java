package com.data.stack;

import com.data.arr.Array;

public class ArrayStack<E> implements Stack<E> {

    private Array<E> data;

    public ArrayStack(){
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
    public void push(E e) {
        data.addLast(e);
    }

    @Override
    public E pop() {
        return data.removeLast();
    }

    @Override
    public E peek() {
        return data.getLast();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("ArrayStack size:");
        sb.append(data.getSize() + " content[ ");
        for(int i = 0; i < data.getSize(); i++ ){
            sb.append(data.get(i));
            if(i != data.getSize()-1){
                sb.append(",");
            }
        }
        sb.append( " ] top ");
        return sb.toString();
    }
}
