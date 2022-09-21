package com.test.exam6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 *
 *  示例 1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * 示例 2：
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 *
 * 示例 3：
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 *
 * 提示：
 * 只会存在一个有效答案
 * 进阶：你可以想出一个时间复杂度小于 O(n2) 的算法吗？
 *
 * 本题10分，逻辑正确，可以正常输出正确结果得6分，效率优化2分，命名及注释2分
 */
public class TwoSumSolution {
    public static void main(String[] args) {
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        int[] nums = new int[]{1, 7, 11, 15 ,8};
        System.out.println("输入：" + Arrays.toString(nums));
        int[] output = twoSumSolution.twoSum(nums, 9);
        System.out.println("输出：" + Arrays.toString(output));
    }


    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(Integer i : map.keySet()){
            Integer res = target - i.intValue();
            if(map.containsKey(res)){
                return new int[]{map.get(i), map.get(res)};
            }
        }
        return null;
    }
}
