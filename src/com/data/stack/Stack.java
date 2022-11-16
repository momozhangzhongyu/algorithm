package com.data.stack;

public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);

    /**
     * 取出第一个
     * @return
     */
    E pop();

    /**
     * 看一眼第一个
     * @return
     */
    E peek();

}
