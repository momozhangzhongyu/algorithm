package com.data.arr;

public class Array<E> {
    private E[] data;
    private int size;

    public Array(int capacity){
        data = (E[]) new Object[capacity];
    }

    public Array(){
        this(10);
    }
    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addFirst(E value){
        add(0, value);
    }

    public void addLast(E value){
        add(size, value);
    }

    public void add(int index, E value){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("index > 0 && index <= size, other index illegal!");
        }
        if(size == data.length){
            resize(data.length * 2);
        }
        for(int i = size; i > index; i--){
            data[i] = data[i - 1];
        }
        data[index] = value;
        size++;
    }

    private void resize(int newCapacity){
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0 ; i < size; i++){
            newData[i] = data[i];
        }
        data = newData;
    }

    public E remove(int index){
        if(index > size-1 || index < 0){
            throw new IllegalArgumentException("index > 0 && index <= size, other index illegal!");
        }
        E res = data[index];
        for(int i = index; i < size - 1; i++){
            data[i] = data[i + 1];
        }
        size--;
        return res;
    }

    public E removeLast(){
        return remove(size - 1);
    }
    public E removeFirst(){
        return remove(0);
    }

    public void set(int index, E value){
        if(index > size-1 || index < 0){
            throw new IllegalArgumentException("index > 0 && index <= size, other index illegal!");
        }
        data[index] = value;
    }

    public E get(int index){
        if(index > size-1 || index < 0){
            throw new IllegalArgumentException("index > 0 && index <= size, other index illegal!");
        }
        return data[index];
    }

    public E getLast(){
        return get(size-1);
    }

    public E getFirst() {
        return get(0);
    }
    public boolean contains(E value){
        for(int i = 0; i < size; i++){
            if(data[i].equals(value)){
                return true;
            }
        }
        return false;
    }

    public int find(E value){
        for(int i = 0; i < size; i++){
            if(data[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

    public int removeElement(E e){
        int index = find(e);
        if(index != -1){
            remove(index);
        }
        return index;
    }


    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Array capacity: ");
        sb.append(data.length + ", size: ");
        sb.append(size + ", content : ");
        for(int i = 0; i < size; i++){
            sb.append(data[i]);
            if(i != size - 1){
                sb.append(" -> ");
            }
        }
        return sb.toString();
    }

}
