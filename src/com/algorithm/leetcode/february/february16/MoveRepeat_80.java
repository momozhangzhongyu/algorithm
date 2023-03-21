package com.algorithm.leetcode.february.february16;

import java.util.Arrays;

public class MoveRepeat_80 {

    public static void main(String[] args) {
        MoveRepeat_80 moveRepeat_80 = new MoveRepeat_80();
        int[] arr = {1,1,1,2,2,3};
        moveRepeat_80.removeDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        int k = 0;
    }
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length == 2) {
            return nums.length;
        }
        int k = 1;
        int newIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[newIndex]) {
                if (k > 2) {
                    k++;
                } else {
                    newIndex++;
                    nums[newIndex] = nums[i];
                    k++;
                }
            } else {
                k = 1;
                newIndex++;
                nums[newIndex] = nums[i];
            }
        }
        return newIndex+1;
    }
}
