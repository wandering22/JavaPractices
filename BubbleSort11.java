public class BubbleSort11 {
    /*
            冒泡排序：
            时间复杂度：O(n) ~ O(n^2)  最好：顺序 + 标记  最坏： 逆序
            稳定性： 稳定
            空间复杂度：  常数空间  ---> O(1)
  */
    public static void bubbleSort(int[] arr){
        // len: 未排序的元素个数
        int len = arr.length;
        while(len > 0){
            //flag: true ---->已经有序
            boolean flag = true;
            //一轮冒泡排序， 排好一个元素的位置
            for(int i = 0; i < len - 1; ++i){
                if(arr[i] > arr[i + 1]){
                    Swap.swap(arr, i, i + 1);
                    flag = false;
                }
            }
            if(flag)
                break;
            --len;
        }
    }
}
