package com.algorithm.sort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println(111);
        int[] arr = {11,3,2,15,21,22,23,99,42,29};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int j = i;
            int temp = arr[j];
            for(; j > 0 && temp < arr[j-1]; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = temp;
        }
    }
}
