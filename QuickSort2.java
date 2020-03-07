public class QuickSort2 {
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

    public static int partion2(int[] arr, int left, int right){
        //获取基准值
        int key = arr[left];
        //挖坑填坑
        while(left < right){
            //从右边找第一个小于key的数据，填左边的坑
            while(left < right && arr[right] >= key)
                --right;
            //填坑
            arr[left] = arr[right];
            //从左边找第一个大于key的数据，填右边的坑
            while(left < right && arr[left] <= key)
                ++left;
            //填坑
            arr[right] = arr[left];
        }

        //填基准值到中间相遇的位置
        arr[left] = key;
        return left;
    }

    public static int partion3(int[] arr, int left, int right){
        //三数取中
        int mid = GetMid2.getMid(arr, left, right);
        Swap.swap(arr, left, mid);

        int key = arr[left];
        int prev = left; //最后一个小于key的位置
        int cur = left + 1; //下一个小于key的位置
        while(cur <= right){
            //如果cur找到下一个小于key的位置，并且prev 和 cur之间有大于key的值，则交换prev, cur的值
            if(arr[cur] < key && ++prev != cur)
                Swap.swap(arr, prev, cur);
            ++cur;
        }
        Swap.swap(arr, left, prev);
        return prev;
    }

    /*
        快排递归：
        时间复杂度：O(nlogn)    最坏时间复杂度： 没有优化之前 O(n^2)
        稳定性：不稳定  基准值的位置进行交换的时候有可能改变相同元素的相对位置
        空间复杂度：logn
     */
    public static void quickSort(int[] arr, int left, int right){
        if(left < right){
            //int mid = partion1(arr, left, right);
            //int mid = partion2(arr, left, right);
            int mid = partion3(arr, left, right);

            //进行分组
            quickSort(arr, left, mid - 1);
            quickSort(arr, mid + 1, right);
        }
    }
}
