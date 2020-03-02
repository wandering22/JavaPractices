public class SelectSort2 {
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static void selectSort2(int[] arr){
        //i: 未排序的最大位置
        for(int i = arr.length - 1; i > 0; --i)
        {
            int end = i;
            int maxIdx = i;
            //从所有未排序的数据中找最大值的索引
            for(int j = end - 1; j >=0; --j){
                if(arr[j] >arr[maxIdx])
                    maxIdx = j;
            }
            swap(arr, maxIdx, end);
        }
    }

}
