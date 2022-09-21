package com.test.exam2;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。（不要使用int数组转字符串的方案）
 *
 * 示例 1：
 * 输入：x = 123
 * 输出：321
 *
 * 示例 2：
 * 输入：x = -123
 * 输出：-321
 *
 * 示例 3：
 * 输入：x = 120
 * 输出：21
 *
 * 示例 4：
 * 输入：x = 0
 * 输出：0
 *
 *  本题10分，逻辑正确，可以正常输出正确结果得6分，效率优化2分，命名及注释2分
 */
public class ReverseSolution {
    public static void main(String[] args) {
        ReverseSolution reverseSolution = new ReverseSolution();
        int input = 0;
        System.out.println("输入：" + input);
        int output = reverseSolution.reverse(input);
        System.out.println("输出：" + output);
    }

    public int reverse(int x) {
//        if(x == 0)
//            return 0;
        int res = 0;
        while (x != 0){
            res = x%10 + res *10;
            x = x/10;
        }
        return res;
    }
}
