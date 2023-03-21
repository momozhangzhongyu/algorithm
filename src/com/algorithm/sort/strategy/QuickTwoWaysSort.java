package com.algorithm.sort.strategy;

/**
 * 双路快速排序
 */
public class QuickTwoWaysSort implements StrategySort{

    /**
     * 排序
     * @param arr
     */
    @Override
    public void sort(int[] arr) {
        quickTwoWaysSort(arr, 0, arr.length-1);
    }

    /**
     * 双路排序-递归
     * @param arr
     * @param l
     * @param r
     */
    private void quickTwoWaysSort(int[] arr, int l, int r) {
        if(l >= r){
            return;
        }

        int p = partition(arr, l, r);
        quickTwoWaysSort(arr, l, p-1);
        quickTwoWaysSort(arr, p+1, r);

    }

    /**
     * 将该数组区域分成两个部分，使得arr[l+1...i) < v < arr(j...r]
     * 临界判断，当i > j 时，
     * @param arr
     * @param l
     * @param r
     * @return
     */
    private int partition(int[] arr, int l, int r) {
        int v = arr[l];
        int i = l+1, j=r;
        while (true){
            while (i <= r && arr[i] < v){
                i++;
            }
            while (j >= l+1 && arr[j] > v){
                j--;
            }
            if(i > j){
                break;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
        arr[l] = arr[j];
        arr[j] = v;
        return j;
    }
}
