package com.algorithm.sort.strategy;

/**
 * 合并排序
 */
public class MergeSort implements StrategySort{
    @Override
    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length-1);
    }

    private void mergeSort(int[] arr, int l, int r) {
        if(l >= r){
            return;
        }
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        if(arr[mid] > arr[mid+1]){
            merge(arr, l, mid, r);
        }
    }

    private void merge(int[] arr, int l, int mid, int r) {
        int[] aux = new int[r-l+1];
        for(int i = l; i <= r; i++){
            aux[i-l] = arr[i];
        }
        int i = l,  j = mid + 1;
        for(int k = l; k <= r; k++){
            System.out.println(i-l);
            System.out.println(j-l);
            if(i > mid){
                arr[k] = aux[j-l];
                j++;
            }else if(j > r){
                arr[k] = aux[i-l];
                i++;
            }else if(aux[i-l] > aux[j-l]){
                arr[k] = aux[j-l];
                j++;
            }else{
                arr[k] = aux[i-l];
                i++;
            }
        }
    }
}
