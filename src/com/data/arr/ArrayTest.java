package com.data.arr;

public class ArrayTest {
    public static void main(String[] args) {
        Array<Integer> arr = new Array<Integer>(20);
        for(int i = 0; i < 10; i++){
            arr.addFirst(i);
        }
        System.out.println(arr);
        arr.add(0, 999);
        System.out.println(arr);
        arr.add(2, 666);
        System.out.println(arr);
        for(int i = 0; i < 10; i++){
            arr.addLast(i);
        }
        System.out.println(arr);

//        arr.remove(0);
//        System.out.println(arr);

        Integer res = arr.remove(21);
        System.out.println(res);
        System.out.println(arr);
        int index = arr.removeElement(666);
        System.out.println(index);
        System.out.println(arr);
    }
}
