package com.leetcode.january.january24;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        BigDecimal amount = new BigDecimal("3");//起始资金 3万
        for(int i = 30; i < 61; i++){
            BigDecimal lirun = amount.multiply(new BigDecimal("0.1"));//年化10%
            amount = amount.add(lirun);
            System.out.println("年龄：【"+i+"】，财富总值为：【"+amount.toString()+"】万元");
            if(i != 60)
                amount = amount.add(new BigDecimal("1"));//每年增加1万投入
        }
        System.out.println(111);
    }
}
