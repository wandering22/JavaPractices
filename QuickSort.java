public class QuickSort {
    public static int partion1(int[] arr, int left, int right){
        //基准值
        int key = arr[left];
        int start = left;
        while(left < right){
            //一定要先从后向前找第一个小于key的数据位置， 否则数据的位置会产生错误
            while(left < right && arr[right] >= key)
                --right;
            //从前向后找第一个大于key的数据位置
            while(left < right &&arr[left] <= key)
                ++left;
            //交换
            Swap.swap(arr, left, right);
        }
        //把基准值和相遇的位置的数据进行交换
        //错误： arr[left] = key; 相遇位置的数据被覆盖
        Swap.swap(arr, left, start);
        return left;
    }

    public static void quickSort(int[] arr, int left, int right){
        if(left < right){
            int mid = partion1(arr, left, right);
            //进行分组
            quickSort(arr, left, mid - 1);
            quickSort(arr, mid + 1, right);
        }
    }
}
