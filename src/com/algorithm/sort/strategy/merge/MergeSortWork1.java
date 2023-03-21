package com.algorithm.sort.strategy.merge;

import com.algorithm.sort.strategy.StrategySort;

/**
 * 归并排序work 1
 */
public class MergeSortWork1 implements StrategySort {

    /**
     * 排序
     *
     * @param arr
     */
    @Override
    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length-1);
    }

    /**
     * 递归的归并排序
     * 对arr[l...r] 区间元素进行归并排序
     * @param arr
     * @param l
     * @param r
     */
    private void mergeSort(int[] arr, int l, int r) {
        if(l >= r) return;

        int mid = (l+r)/2;//有int超过范围的风险
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        if(arr[mid] > arr[mid+1])
            merge(arr, l, mid, r);
    }


    private void merge(int[] arr, int l, int mid, int r) {
        int[] aux = new int[r-l+1];
        for(int i=l; i<=r; i++){
            aux[i-l] = arr[i];
        }
        int i=l, j=mid+1;

        for(int k=l; k<=r; k++){
            if(i>mid){
                arr[k]=aux[j-l];
                j++;
            }else if(j>r){
                arr[k]=aux[i-l];
                i++;
            }else if(aux[i-l] > aux[j-l]){
                arr[k] = aux[j-l];
                j++;
            }else {
                arr[k]=aux[i-l];
                i++;
            }
        }

    }
}
