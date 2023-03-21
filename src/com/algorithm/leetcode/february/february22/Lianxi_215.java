package com.algorithm.leetcode.february.february22;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Lianxi_215 {
    public static void main(String[] args) {
//        int[] arr = {1,22,3,5,4,66,21,12,111,34,58,67,35};
        int[] arr = {3,2,1,5,6,4};
        int k = 2;
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->a-b);
        k = arr.length -k + 1;
        for(int i = 0; i < arr.length; i++){
            if(q.size() < k || q.peek() < arr[i]) q.add(arr[i]);
            if(q.size() > k) q.poll();
        }
        System.out.println(q.peek());
        int value = findKthLargest(arr, arr.length-k, 0, arr.length-1);
        System.out.println(value);
        System.out.println(Arrays.toString(arr));
    }

    private static int findKthLargest(int[] arr, int k, int l, int r){
        if(l > r) return -1;
        int p = partition(arr, l, r);
        if(p > k){
            return findKthLargest(arr, k, l, p-1);
        }else if(p < k){
            return findKthLargest(arr, k, p+1, r);
        }
        return arr[p];

    }

    private static int partition(int[] arr, int l, int r){
        int value = arr[l];
        int i = l+1;
        int j = r;
        while (true){
            while (i<=j && arr[i] < value) i++;
            while (j>=i && arr[j] > value) j--;
            if(i > j){
                break;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        arr[l] = arr[j];
        arr[j] = value;
        return j;
    }
}
