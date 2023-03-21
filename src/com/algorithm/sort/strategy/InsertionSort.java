package com.algorithm.sort.strategy;

/**
 * 普通插入排序
 */
public class InsertionSort implements StrategySort {
    @Override
    public void sort(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            int sortValue = arr[i];
            int j = i-1;
            for(; j >= 0 && arr[j] > sortValue; j--){
                arr[j+1] = arr[j];
            }
            System.out.println(j);
            arr[j+1] = sortValue;
        }
    }
}
