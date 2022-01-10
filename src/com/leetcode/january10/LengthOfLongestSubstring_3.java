package com.leetcode.january10;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class LengthOfLongestSubstring_3 {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        int left = 0;
        int right = 0;//维护 s[ l ... r ] 是不重复的
        Map<Character, Integer> map = new HashMap<>();
        for(right = 0; right < s.length(); right++){
            if(map.containsKey(s.charAt(right)) && map.get(s.charAt(right)) >= left){
                left = map.get(s.charAt(right)) + 1;
                System.out.println("left=" + left);
            }
            max = Math.max(max, right - left + 1);
            System.out.println("max=" + max);
            map.put(s.charAt(right), right);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abba"));
    }
}
