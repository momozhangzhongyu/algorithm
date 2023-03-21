package com.algorithm.sort.strategy.insert;

import com.algorithm.sort.strategy.StrategySort;

public class InsertionSortWork1 implements StrategySort {

    /**
     * 排序
     *
     * @param arr
     */
    @Override
    public void sort(int[] arr) {
        for(int i=1; i < arr.length; i++){
            int v = arr[i];
            int j = i-1;
            for(;j >= 0&&arr[j] > v; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = v;
        }
    }

}
