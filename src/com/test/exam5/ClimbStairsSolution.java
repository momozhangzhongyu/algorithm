package com.test.exam5;

/**
 * 假设你正在爬楼梯。需要 n阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 示例 1：
 * 输入：n = 2
 * 输出：2
 * 解释：有两种方法可以爬到楼顶。
 * 1. 1 阶 + 1 阶
 * 2. 2 阶
 *
 * 示例 2：
 * 输入：n = 3
 * 输出：3
 * 解释：有三种方法可以爬到楼顶。
 * 1. 1 阶 + 1 阶 + 1 阶
 * 2. 1 阶 + 2 阶
 * 3. 2 阶 + 1 阶
 *
 * 提示：
 * 1 <= n <= 45
 *
 * 本题10分，逻辑正确，可以正常输出正确结果得6分，效率优化2分，命名及注释2分
 */
public class ClimbStairsSolution {
    public static void main(String[] args) {
        ClimbStairsSolution climbStairsSolution = new ClimbStairsSolution();
        int input = 3;
        System.out.println("输入："+ input);
        String a ;
        int output = climbStairsSolution.climbStairs(input);
        System.out.println("输出：" + output);
    }

    /**
     * 222
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        return 0;
    }
}
