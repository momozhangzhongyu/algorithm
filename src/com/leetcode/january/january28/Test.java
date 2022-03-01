package com.leetcode.january.january28;

public class Test {

    public static void main(String[] args) {
        sum(1,4,100);
    }

    public static int sum(int a1, int a2, int n){
        int num = a2 - a1;
        int res = 1;
        for(int i = 1; i < n; i++){
            res += num;
        }
        return res;
    }
}
