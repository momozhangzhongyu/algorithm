package com.leetcode.january.january19;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 */
public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        char[] commonStr = strs[0].toCharArray();
        for(int i = 1; i < strs.length; i++){
            char[] chars = strs[i].toCharArray();
            int m = 0, n = 0;
            while (commonStr[m] == commonStr[n] && m < commonStr.length && n < chars.length){
                m++;
                n++;
            }
            if(m == 0) return "";
            commonStr = strs[0].substring(0, m - 1).toCharArray();
        }
        if(commonStr != null ) return "";
        return "";
    }
}
