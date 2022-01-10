package com.leetcode.january10;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，
 * 使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
 *
 */
public class ContainsNearbyDuplicate_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            // 因为先添加后判断，所以判断是否为 k+1
            if (set.size() == k + 1){
                // 要删除第一个订单，怎么i-k是否为第一个订单，
                // 例如1：目前 set[0 ... k] 长度 k+1
                // 当前i = k , 要取 0 ,所以 i-k满足
                // 例如2：目前 set[1 ... k+1] 长度 k+1
                // 当前i = k+1 , 要取 1 ,所以 i-k满足
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

}
