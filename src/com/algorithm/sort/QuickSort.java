package com.algorithm.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        System.out.println(111);

        int[] arr = {11,3,2,15,21,22,23,99,42,29};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //    Parition


    public static void quickSort(int[] arr){
        __quickSort(arr, 0, arr.length-1);
    }


    private static void __quickSort(int[] arr, int l, int r) {
        if(l >= r)
            return;
        int p = partition(arr, l, r);
        __quickSort(arr, l, p-1);
        __quickSort(arr, p+1, r);
    }

    private static int partition(int[] arr, int l, int r) {
        int temp = arr[l];
        int j = l;
        for(int i = l+1; i <= r; i++){
            if(arr[i] < temp){
                j++;
                if(i!=j){
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        arr[l] = arr[j];
        arr[j] = temp;
        return j;
    }
}
