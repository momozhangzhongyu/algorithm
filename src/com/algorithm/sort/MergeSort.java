package com.algorithm.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        System.out.println(111);
        int[] arr = {11,3,2,15,21,22,23,99,42,29};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr){
        _mergeSort(arr, 0, arr.length-1);
    }

    /**
     * 对arr[l...r]中进行排序
     * @param arr
     * @param l
     * @param r
     */
    private static void _mergeSort(int[] arr, int l, int r) {
        if(l >= r)
            return;

        int mid = (l + r)/2;
        _mergeSort(arr, l, mid);
        _mergeSort(arr, mid+1, r);
        if(arr[mid] > arr[mid+1]){
            _merge(arr, l, mid, r);
        }
    }

    private static void _merge(int[] arr, int l, int mid, int r) {
        int[] aux = new int[r-l+1];
        for(int i = l; i <= r; i++){
            aux[i-l] = arr[i];
        }
        int i = l, j = mid+1;
        for(int k = l; k <= r; k++){
            if(i > mid){
                arr[k] = aux[j-l];
                j++;
            }else if(j > r){
                arr[k] = aux[i-l];
                i++;
            }else if(aux[i-l] < aux[j-l]){
                arr[k] = aux[i-l];
                i++;
            }else {
                arr[k] = aux[j-l];
                j++;
            }
        }
    }
}
