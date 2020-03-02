public class SelectSort {
    /*
             选择排序：
             时间复杂度： O(n^2)
             稳定性：可以让它稳定/不稳定
             空间复杂度：  常数空间  ---> O(1)
   */

    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void selectSort(int[] arr){
        int begin = 0;
        int end = arr.length - 1;
        while(begin < end){

            int minIdx = begin;
            int maxIdx = begin;
            for(int i = begin; i <= end; ++i){
                //最小值选前面
                if(arr[i] < arr[minIdx])
                    minIdx = i;
                //最大值选后面
                if(arr[i] >= arr[maxIdx])
                    maxIdx = i;
            }
            swap(arr, begin, minIdx);
            //如果最大值在起始位置，则经过上面的交换之后，最大值被移动到minIdx指向的位置
            if(maxIdx == begin)
                maxIdx = minIdx;

            swap(arr, end, maxIdx);
            ++begin;
            --end;
        }
    }

}
