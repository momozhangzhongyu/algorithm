package com.data.arr;

public class Array<E> {
    private int size;
    private E[] data;

    public Array(int capacity){
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public Array(){
        this(10);
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void addFirst(E e){
        add(0, e);
    }

    public void addLast(E e){
        add(size, e);
    }

    public E removeFirst(){
        return remove(0);
    }

    public E get(int index){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Add error! index > 0 && index < " + size);
        }
        return data[index];
    }

    public E remove(int index){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Add error! index > 0 && index < " + size);
        }
        E e = data[index];
        for(int i = index; i < size-1; i++){
            data[i] = data[i+1];
        }
        size--;
        if(size == data.length/4 && data.length/2 > 0){
            resize(data.length/2);
        }
        return e;
    }

    public void update(int index, E e){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Add error! index > 0 && index < " + size);
        }
        data[index]=e;
    }

    public E findValue(int index){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Add error! index > 0 && index < " + size);
        }
        return data[index];
    }

    public int findIndex(E e){
        if(size == 0){
            throw new IllegalArgumentException("Array is empty");
        }
        for(int i = 0; i < size; i++){
            if(data[i] == e){
                return i;
            }
        }
        return -1;
    }

    public void add(int index, E e){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Add error! index > 0 && index < " + size);
        }
        for(int i = size; i > index; i--){
            data[i] = data[i-1];
        }
        if(size == data.length){
            resize(size*2);
        }
        data[index] = e;
        size++;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("Array size= "+ size + " , capacity=  "+ data.length + "  , content ：[ ");
        for(int i = 0; i < size; i++){
            sb.append(data[i]);
            if(i != size - 1){
                sb.append(",");
            }
        }
        sb.append(" ]");
        return sb.toString();
    }



    private void resize(int newCapacity){
        E[] newData = (E[]) new Object[newCapacity];
        for(int i = 0; i < size; i++){
            newData[i] = data[i];
        }
        data = newData;
    }
}
