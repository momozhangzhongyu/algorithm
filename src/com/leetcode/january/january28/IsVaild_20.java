package com.leetcode.january.january28;

import java.util.Stack;

/**
 *
 */
public class IsVaild_20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '{' || c == '[' || c == '('){
                stack.push(c);
            }else {
                char m = stack.pop();
                if(c == '}' && m != '{') return false;
                else if(c == ']' && m != '[') return false;
                else if(c == ')' && m != '(') return false;
            }
        }
        return stack.isEmpty();
    }
}
