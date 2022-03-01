package com.leetcode.january.january07;

import java.util.*;

/**
 * 给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。
 * 字母异位词 是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母通常恰好只用一次。
 *
 * 示例 1:
 * 输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
public class GroupAnagrams_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String temp = new String(chars);
            if(map.containsKey(temp)){
                List<String> paramList = map.get(temp);
                paramList.add(strs[i]);
            }else {
                map.put(strs[i], new ArrayList(Arrays.asList(strs[i])));
            }
        }
        for(String key : map.keySet()){
            list.add(map.get(key));
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagrams_49 groupAnagrams_49 = new GroupAnagrams_49();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        String a = "tea";
        String b = "tan";
        System.out.println();
    }
}
