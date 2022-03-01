package com.leetcode.january.january28;

import java.util.Arrays;
import java.util.Stack;

public class EvalRPN_150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < tokens.length; i++){
            if(Arrays.asList("+", "-", "*", "/").contains(tokens[i])){
                int num = stack.pop();
                int res = stack.pop();
                if("+".equals(tokens[i])){
                    stack.push(res + num);
                }else if("-".equals(tokens[i])){
                    stack.push(res - num);
                }else if("*".equals(tokens[i])){
                    stack.push(res * num);
                }else if("/".equals(tokens[i])){
                    stack.push(res / num);
                }
                continue;
            }
            stack.push(Integer.parseInt(tokens[i]));
        }
        return stack.pop();
    }
}
