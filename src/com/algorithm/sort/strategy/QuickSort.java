package com.algorithm.sort.strategy;

public class QuickSort implements StrategySort {
    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    private void quickSort(int[] arr, int l, int r) {
        if(l >= r){
            return;
        }
        int p = partition(arr, l, r);
        quickSort(arr, l, p-1);
        quickSort(arr, p+1, r);

    }

    private int partition(int[] arr, int l, int r) {
        int v = arr[l];
        int j = l;
        //arr[l+1...j] < v < arr[j+1..r]
        for(int i = l+1; i <= r; i++){
            if(arr[i] < v){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println(j);
        arr[l] = arr[j];
        arr[j] = v;
        return j;
    }
}
