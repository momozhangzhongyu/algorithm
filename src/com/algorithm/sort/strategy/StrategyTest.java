package com.algorithm.sort.strategy;

import com.algorithm.sort.strategy.quick.QuickSortWork2;

import java.util.Arrays;

public class StrategyTest {
    public static void main(String[] args) {
        StrategySort sort = new QuickSortWork2();
//        StrategySort sort = new InsertionSortWork2();
//        StrategySort sort = new MergeSortWork2();
//        StrategySort sort = new QuickSortWork1();
//        StrategySort sort = new InsertionSortWork1();
//        StrategySort sort = new MergeSortWork1();
//        StrategySort sort = new MergeSort2();
//        StrategySort sort = new QuickTwoWaysSort();
//        StrategySort sort = new QuickSort();
//        StrategySort sort = new MergeSort();
//        StrategySort sort = new InsertionSort();
//        StrategySort sort = new SelectionSort();
        int[] arr = {11,3,2,15,21,22,23,99,42,29};
        System.out.println(111);
        sort.sort(arr);
        System.out.println(222);
        System.out.println(Arrays.toString(arr));
    }
}
