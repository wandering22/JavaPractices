public class InsertSort {
    /*
      插入排序：
      时间复杂度： 最坏情况： O(n^2) ---> 逆序序列    最好情况：O(n)  ---> 顺序序列
      稳定性：稳定
      空间复杂度：  常数空间  ---> O(1)
    */
    public static void insertSort(int[] arr){
        //开始可以认为第0个位置是排好序
        for(int i = 0; i < arr.length - 1; ++i){
            int key = arr[i + 1];
            //i: 表示已排序数据的最后一个位置
            int end = i;
            while(end >= 0 && arr[end] > key){
                //把大的元素向后移动
                arr[end + 1] = arr[end];
                //继续向前搜索
                --end;
            }
            // end : -1  或者  <= key的一个位置
            arr[end + 1] = key;
        }
    }
}
