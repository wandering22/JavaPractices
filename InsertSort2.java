public class InsertSort2 {
    public static void insertSort2(int[] arr){
        //开始可以认为第0个位置是排好序
        for(int i = 1; i < arr.length; ++i){
            //i: 下一个待排序元素的位置
            int key = arr[i];
            // end: 表示已排序数据的最后一个位置
            int end = i - 1;
            while(end >= 0 && arr[end] > key){
                arr[end + 1] = arr[end];
                --end;
            }
            arr[end + 1] = key;
        }
    }
}
