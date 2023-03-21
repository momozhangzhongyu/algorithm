package com.algorithm.sort.strategy;

/**
 * 归并排序
 */
public class MergeSort3 implements StrategySort{
    /**
     * 排序
     *
     * @param arr
     */
    @Override
    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length-1);
    }

    /**
     * 归并排序
     * @param arr
     * @param l
     * @param r
     */
    private void mergeSort(int[] arr, int l, int r) {
        //如果拆分到最后一个节点则合并
        if(l >= r) return;

        // TODO: 2023/2/9 找到中间节点，将数组递归一直拆下去，不断的拆为两块
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        // TODO: 2023/2/9 等数组拆不动了的时候，再进行两两排序并合并
        // TODO: 2023/2/9 如果 mid < mid +1 则意味着，不需要再进行排序合并了
        if(arr[mid] > arr[mid+1])
            merge(arr, l, mid, r);
    }

    /**
     * 合并数组
     * @param arr
     * @param l
     * @param mid
     * @param r
     */
    private void merge(int[] arr, int l, int mid, int r) {
        // TODO: 2023/2/9 这样我们就得到了一个临时数组，
        //  然后我只需要将aux中的值比较之后，直接放入arr[l...r]里就行了。
        //  那么问题来了，有啥思路呢， arr[l...mid], arr[mid+1...r]
        //  首先，我们需要遍历 aux;
        int i=l,j=mid+1;
        while (true){
            // TODO: 2023/2/9 当arr[i] < arr[j] 时，i++;
            while (arr[i] < arr[j]) i++;
            // TODO: 2023/2/9 当arr[i] > arr[j]时，交换i\j的值。 
            
        }
        
    }
}
