public class 寻找第k大 {
    public static int partion1(int[] arr, int left, int right){
        //基准值
        int key = arr[left];
        int start = left;
        while(left < right){
            //从后向前找第一个小于key的数据位置
            while(left < right && arr[right] >= key)
                --right;
            //从前向后找第一个大于key的数据位置
            while(left < right &&arr[left] <= key)
                ++left;

            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
        int tmp2 = arr[left];
        arr[left] = arr[start];
        arr[start] = tmp2;
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
    public static int findKth(int[] a, int n, int K) {
        // write code here
        //for(int i=0;i<a.length;i++){

        //}
        quickSort(a,0,n-1);
        return a[n-K];
    }
}
