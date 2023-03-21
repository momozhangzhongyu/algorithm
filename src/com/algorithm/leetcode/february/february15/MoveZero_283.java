package com.algorithm.leetcode.february.february15;

import java.util.Arrays;

/**
 * 移零至数组末尾，其他元素相对位置保持不变
 */
public class MoveZero_283 {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0,4,0,5,0,0,7,8,9};
        moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZero(int[] nums) {
        int[] aux = new int[nums.length];
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                aux[k] = nums[i];
                k++;
            }
        }
        for(int i=0; i<nums.length; i++){
            nums[i] = aux[i];
        }
    }


}
