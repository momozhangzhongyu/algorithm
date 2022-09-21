package com.test.exam3;

import java.util.Arrays;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串""。
 *
 * 示例 1：
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 *
 * 示例 2：
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 *
 * 说明：仅涉及英文
 *
 * 本题10分，逻辑正确，可以正常输出正确结果得6分，效率优化2分，命名及注释2分
 */
public class LongestCommonPrefixSolution {
    public static void main(String[] args) {
        LongestCommonPrefixSolution longestCommonPrefixSolution = new LongestCommonPrefixSolution();
        String[] strs = new String[]{"flower", "flow", "flight"};
//        String[] strs = new String[]{"dog","racecar","car"};
        System.out.println("输入：" + Arrays.toString(strs));
        String output = longestCommonPrefixSolution.longestCommonPrefix(strs);
        System.out.println("输出：" + output);
    }

    /**
     * 1、假设第一个为前缀
     * 2、依次根据之后数据，找到最新的前缀,这个怎么找呢？？
     * 3、如果无，直接返回为空
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        if(strs == null) return "";
        if(strs.length == 1){
            return strs[0];
        }
        String res = strs[0];
        label: for(int i=1; i < strs.length; i++){
            if(!strs[i].startsWith(res)){
                if(res.length() == 1){
                    return "";
                }
                for(int k=res.length()-2; k>=0; k--){
                    res = res.substring(0,k);
                    if(strs[i].startsWith(res)){
                        continue label;
                    }
                }
            }
        }
        return res;
    }
}
