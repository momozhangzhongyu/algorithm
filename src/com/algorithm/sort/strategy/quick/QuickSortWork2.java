package com.algorithm.sort.strategy.quick;

import com.algorithm.sort.strategy.StrategySort;

public class QuickSortWork2 implements StrategySort {


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
        // arr[l+1...i] < v
        // arr[j...r] > v
        int temp = arr[l];
        int i = l+1, j=r;
        while (true){
            while (i <= r && arr[i] < temp) i++;
            while (j >= l+1 && arr[j] > temp) j--;
            if(i > j) break;
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        arr[l] = arr[j];
        arr[j] = temp;
        return j;
    }
}
