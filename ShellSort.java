public class ShellSort {
    /*
         希尔排序：改进的插入排序，数据越有序，优化的空间就越小
         时间复杂度： O(n) ~ O(n^2)  -----> O(n^1.3)
         稳定性：不稳定
         空间复杂度：  常数空间  ---> O(1)
   */
    public static void shellSort(int[] arr){
        //对数据进行分组
        //每组数据进行插入排序: 逻辑分组
        // 同一组数据， 他们之间的间隔不一定为1
        int gap = arr.length;
        while(gap > 1){
            gap = gap / 3 + 1;
            //i: 表示已排序数据的最后一个位置
            for(int i = 0; i < arr.length - gap; ++i){
                int end = i;
                int key = arr[end + gap];

                while(end >= 0 &&arr[end] > key){
                    arr[end + gap] = arr[end];
                    end -= gap;
                }
                arr[end + gap] = key;
            }
        }
    }
}
