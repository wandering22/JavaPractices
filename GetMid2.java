public class GetMid2 {
    //三数取中法： 为了让数据分组更加均衡
    public static int getMid(int[] arr, int left, int right){
        // 从 arr[left], arr[mid], arr[right],中选一个中间值
        int mid = (left + right) / 2;
        if(arr[mid] > arr[left]){
            if(arr[mid] < arr[right])
                return mid;
            else{
                // mid  > left, >= right
                if(arr[left] > arr[right])
                    return left;
                else
                    return right;
            }
        }
        else{
            // mid <= left
            if(arr[mid] > arr[right])
                return mid;
            else{
                // mid <= left, <= right
                if(arr[left] < arr[right])
                    return left;
                else
                    return right;
            }
        }
    }
}
