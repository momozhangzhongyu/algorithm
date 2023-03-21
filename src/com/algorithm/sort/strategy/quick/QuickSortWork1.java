package com.algorithm.sort.strategy.quick;

import com.algorithm.sort.strategy.StrategySort;

/**
 * 快速排序
 */
public class QuickSortWork1 implements StrategySort {
    private static int arrs = 1000;
    static {
        arrs = 2000;
    }
    /**
     * 排序
     *
     * @param arr
     */
    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    private void quickSort(int[] arr, int l, int r) {
        if(l >= r) return;

        int p = partition(arr, l, r);
        quickSort(arr, l, p-1);
        quickSort(arr, p+1, r);
    }

    private int partition(int[] arr, int l, int r) {
        int v = arr[l];
        // TODO: 2023/2/10 arr[l+1...j] < v < arr[k...r]
        int j=l+1;
        int k=r;
        while (true){
            while (j<=r&&arr[j] < v) j++;
            while (k>=l+1&&arr[k] > v) k--;
            if(j > k) break;
            int temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
        }
        arr[l] = arr[k];
        arr[k] = v;
        return k;
    }
}
