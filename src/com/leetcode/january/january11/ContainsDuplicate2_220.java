package com.leetcode.january.january11;

import java.util.TreeSet;

/**
 * 给你一个整数数组 nums 和两个整数 k 和 t 。请你判断是否存在 两个不同下标 i 和 j，使得 abs(nums[i] - nums[j]) <= t ，同时又满足 abs(i - j) <= k 。
 *
 * 如果存在则返回 true，不存在返回 false。
 * 输入：nums = [1,2,3,1], k = 3, t = 0
 * 输出：true
 */
public class ContainsDuplicate2_220 {

    /**
     * 主要是要理解个数学问题，绝对值(nums[i] - X) <= t
     * 由它得出：nums[i]-t <= x <= nums[i]+t;
     * 然后代码代入，如果存在 x ,也就是 set.celling(nums[i]-t) 存在。那么 x=set.celling(nums[i]-t);
     * 再代入x <= nums[i]+t这个条件即可。
     *
     * @param nums
     * @param k
     * @param t
     * @return
     */
     public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
         TreeSet<Long> set = new TreeSet<>();
         for(int i = 0; i < nums.length; i++){
             if (set.ceiling((long)nums[i] - (long)t) != null
                     && set.ceiling((long)nums[i] - (long)t) <= (long)nums[i] + (long)t){
                 return true;
             }

             set.add((long) nums[i]);
             // 因为先添加后判断，所以判断是否为 k+1
             if (set.size() == k+1 ){
                 // 要删除第一个订单，怎么i-k是否为第一个订单，
                 // 例如1：目前 set[0 ... k] 长度 k+1
                 // 当前i = k , 要取 0 ,所以 i-k满足
                 // 例如2：目前 set[1 ... k+1] 长度 k+1
                 // 当前i = k+1 , 要取 1 ,所以 i-k满足
                 set.remove((long)nums[i - k]);
             }
         }
         return false;
    }

}
