package com.algorithm.leetcode.march.march22;

import java.util.Arrays;

/**
 * 对撞指针125
 *
 *
 */
public class TwoSum_167 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
//        int[] res = twoSum(arr, 9);
//        int[] res = twoSum2(arr, 9);
        int[] res = twoSum3(arr, 9);
        System.out.println(Arrays.toString(res));
    }

    /**
     * 暴力解法
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum3(int[] numbers, int target){
        int[] res = new int[2];
        for(int i = 0; i < numbers.length-1; i++){
            int tar = target-numbers[i];
            for(int j = i+1; j< numbers.length; j++){
                if(tar == numbers[j]){
                    res[0] = i+1;
                    res[1] = j+1;
                    break;
                }
            }
        }
        return res;
    }

    /**
     * 二分查找法
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] numbers, int target){
        int[] res = new int[2];
        for(int i = 0; i < numbers.length; i++){
            int tar = target-numbers[i];
            int resIndex = part(numbers, i+1, numbers.length-1, tar);
            if(resIndex != -1){
                res[0] = i+1;
                res[1] = resIndex+1;
                break;
            }
        }
        return res;
    }

    /**
     * 二分查找，arr[l...r]
     * @param arr
     * @param l
     * @param r
     * @param tar
     * @return
     */
    private static int part(int[] arr, int l, int r, int tar) {
        if(l>r){
            return -1;
        }
        int mid = (l+r)/2;
        if(arr[mid] > tar){
            return part(arr, l, mid-1, tar);
        }else if (arr[mid] < tar){
            return part(arr, mid+1, r, tar);
        }else if(arr[mid] == tar){
            return mid;
        }
        return -1;
    }

    /**
     * 对撞指针 O(n)
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        while(i<j){
            int tar = numbers[i]+numbers[j];
            if(tar==target){
                break;
            }else if(tar<target){
                i++;
            }else{
                j--;
            }
        }
        int[] res = new int[2];
        res[0] = i+1;
        res[1] = j+1;
        return res;
    }
}
