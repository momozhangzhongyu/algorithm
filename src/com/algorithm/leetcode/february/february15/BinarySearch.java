package com.algorithm.leetcode.february.february15;

public class BinarySearch {

    public static void main(String[] args) {
        System.out.println(111);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(findIndex(arr, 9));
    }

    private static int findIndex(int[] arr, int target) {
        // arr[l...r] 找到i
//        int l=0, r=arr.length-1;
        // arr[l...r) 找到i
        int l=0, r=arr.length;
//        while (l <= r){
        while (l < r){
            int mid = (l+r)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
//                r = mid-1;
                r = mid;
            }else {
                l = mid+1;
            }
        }
        return -1;
    }

}
