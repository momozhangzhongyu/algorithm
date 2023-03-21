package com.algorithm.leetcode.february.february21;

import java.util.Arrays;

/**
 * 数组中只有0、1、2三个元素，请对此数组进行排序
 * 215练习
 */
public class PartitionThreeWaysSort_70 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,0,0,0,2,2,2,1,1,1,1,2,2,2,0,0,0,1,1,1,1};
        System.out.println(arr.length);
        sortColors2(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sortColors(int[] arr){
        int[] aux = new int[3];
        for(int i=0; i < arr.length; i++){
            if(i<=0 && i>=2)
                throw new RuntimeException("数组包含其他元素");
            aux[arr[i]]++;
        }
        System.out.println(Arrays.toString(aux));
        int index = 0;
        for(int i=0; i < aux.length; i++){//遍历循环 aux
            for(int j = 0; j < aux[i]; j++){
                arr[index] = i;
                index++;
            }
        }
    }

    /**
     * 三路排序
     * arr[0...zero] ==0
     * arr[zero+1...i-1] == 1
     * arr[two...arr.length-1] ==2
     * 得到初始值
     * zero = -1
     * i = 0;
     * two = arr.length;
     * 跳出循环条件
     * i>=two
     * @param arr
     */
    private static void sortColors2(int[] arr){
        int zero = -1;// arr[0...zero] == 0
        int two = arr.length;// arr[two...arr.length-1] == 2
//        for(1：初始化循环变量；2：结束条件；3：每次循环结束执行的步骤)
        for(int i = 0; i < two; ){
            if(arr[i] == 1)
                i++;
            else if(arr[i] == 2){
                two--;
                int temp = arr[two];
                arr[two] = arr[i];
                arr[i] = temp;
            }else if(arr[i] == 0){
                zero++;
                int temp = arr[zero];
                arr[zero] = arr[i];
                arr[i] = temp;
                i++;
            }else {
                throw new RuntimeException("不符合数组规范");
            }
        }
    }
}
