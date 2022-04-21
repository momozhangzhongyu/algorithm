package com.leetcode.april.april20;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class InorderTraversal_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<Command> stack = new Stack<>();
        stack.push(new Command("go", root));
        while (!stack.isEmpty()){
            Command co = stack.peek();
            stack.pop();
            if(co.s == "print"){
                list.add(co.node.val);
            }else {
                TreeNode node = co.node;
                if(node.right != null){
                    stack.push(new Command("go", node.right));
                }
                stack.push(new Command("print", node));
                if(node.left != null){
                    stack.push(new Command("go", node.left));
                }
            }
        }
        return list;
    }
}
