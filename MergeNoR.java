public class MergeNoR {
    public static void mergeNoR(int[] arr){
        int[] tmp = new int[arr.length];
        //i: 每次归并的元素个数
        for(int i = 1; i < arr.length; i *= 2){
            // j: 下一次归并的起始位置
            for(int j = 0; j < arr.length; j += 2 * i) {
                //mergeInternal(arr, j, j + i - 1, j + 2 * i - 1, tmp);  区间可能越界
                int left = j;
                int mid = j + i - 1;
                //右半部分没有数据，不用进行归并
                if(mid >= arr.length - 1)
                    continue;
                int right = j + 2 * i - 1;
                //判断右边的区间是否越界
                if(right >= arr.length){
                    right = arr.length - 1;
                }
                MergeSort.mergeInternal(arr, left, mid, right, tmp);
            }
        }
    }
}
