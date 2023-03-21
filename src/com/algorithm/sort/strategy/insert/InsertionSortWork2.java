package com.algorithm.sort.strategy.insert;

import com.algorithm.sort.strategy.StrategySort;

public class InsertionSortWork2 implements StrategySort {
    /**
     * 排序
     *
     * @param arr
     */
    @Override
    public void sort(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i - 1;
            for(; j >= 0 && temp < arr[j]; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
    }
}
