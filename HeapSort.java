public class HeapSort {
    /*
            堆排序：
            时间复杂度： 建堆： O(n)   log(n) +log(n - 1) + log(n - 2) + ... + 1   ---> n * log(n)
            稳定性： 不稳定  ---> 向下调整可能会破坏相对位置
            空间复杂度：  常数空间  ---> O(1)
  */

    public static void shiftDownBig(int[] arr, int parent, int sz){
        int child = 2 * parent + 1;
        while(child < sz){
            //两个孩子节点中选择一个最小的
            if(child + 1 < sz && arr[child + 1] > arr[child])
                ++child;
            //比较父节点和孩子节点
            if(arr[child] > arr[parent]){
                Swap.swap(arr, child, parent);
                parent = child;
                child = 2 * parent + 1;
            }
            else
                break;
        }
    }

    public static void heapSort(int[] arr){
        int len = arr.length;
        //建堆， 最后一个非叶子节点开始向下调整
        for(int i = (len - 2) / 2; i >= 0; --i){
            shiftDownBig(arr, i, len);
        }
        //交换 《---》向下调整
        // 未排序的元素个数
        int end = len - 1;
        while(end > 0){
            Swap.swap(arr, 0, end);
            shiftDownBig(arr, 0, end);
            --end;
        }
    }
}
