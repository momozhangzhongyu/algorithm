package com.test.exam4;

import java.util.Arrays;

/**
 * 给定一个数组 prices ，它的第i 个元素prices[i] 表示一支给定股票第 i 天的价格。
 *
 * 你只能选择 某一天 买入这只股票，并选择在未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 *
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 *
 * 示例 1：
 * 输入：[7,1,5,3,6,4]
 * 输出：5
 * 解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。
 *
 * 示例 2：
 * 输入：prices = [7,6,4,3,1]
 * 输出：0
 * 解释：在这种情况下, 没有交易完成, 所以最大利润为 0。
 *
 * 本题10分，逻辑正确，可以正常输出正确结果得6分，效率优化2分，命名及注释2分
 *
 */
public class MaxProfitSolution {
    public static void main(String[] args) {
        MaxProfitSolution maxProfitSolution = new MaxProfitSolution();
//        int[] input = new int[]{7,3,1,5,3,6,4,10};
        int[] input = new int[]{7,1,5,3,6,4};
//        int[] input = new int[]{7,6,4,3,1};
        System.out.println("输入：" + Arrays.toString(input));
        int output = maxProfitSolution.maxProfit(input);
        System.out.println("输出：" + output);
    }

    /**
     * 222
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i=0; i < prices.length; i++){
            for(int j=i+1; j < prices.length; j++){
                if(prices[j] - prices[i] > max){
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }
}
