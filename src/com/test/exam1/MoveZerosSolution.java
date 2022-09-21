package com.test.exam1;

import java.util.Arrays;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的原有顺序。
 *
 * 请注意，必须在不复制数组的情况下原地对数组进行操作。
 *
 *
 * 示例 1:
 * 输入: nums = [1, 2, 0, 5, 2, 7, 8, 0, 2]
 * 输出: [1,2,5,2,7,8,2,0,0]
 *
 *  示例 2:
 * 输入: nums = [0]
 * 输出: [0]
 *
 * 本题10分，逻辑正确，可以正常输出正确结果得6分，效率优化2分，命名及注释2分
 */
public class MoveZerosSolution {
    public static void main(String[] args) {
        MoveZerosSolution moveZerosSolution = new MoveZerosSolution();
        int[] nums = new int[]{1, 2, 0, 5, 2, 7, 8, 0, 2};
        System.out.println("输入：" + Arrays.toString(nums));
        moveZerosSolution.moveZeros(nums);
        System.out.println("输出：" + Arrays.toString(nums));
    }

    /**
     * 首先，如果出现零，一个零需要后面的往前移一位，两个零需要往前移两位。
     * 2、之后覆盖参数
     * 3、确定最后的下标，最后补零
     * @param nums
     */
    public void moveZeros(int[] nums) {
        int k = 0;//记录零的个数
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                k++;
            }
            if(nums[i] != 0 && k > 0){
                nums[i - k] = nums[i];
            }
        }
        // 9   9-2  7   7..8
        System.out.println(k);
        for(int j = nums.length -k; j < nums.length; j++){
            System.out.println(j);
            nums[j] = 0;
        }
    }
}

