import java.util.Stack;

public class QuickSortNoR {
    /*
    快排
   非递归： 模拟递归过程
   1. 选基准值
   2. 根据基准值分组
   3. 给划分的小组数据进行重复1,2的过程
   */
    public static void quickSortNoR(int[] arr)
    {
        int left = 0;
        int right = arr.length - 1;
        //栈用来记录区间
        Stack<Integer> st = new Stack<>();
        if(left < right){
            st.push(left);
            st.push(right);
        }
        while(!st.isEmpty()){
            //取出栈顶的一对区间值
            int right1 = st.pop();
            int left1 = st.pop();
            //分组
            int mid = QuickSort2.partion3(arr, left1, right1);
            // 新的分组继续压栈
            if(mid - 1 > left1){
                st.push(left1);
                st.push(mid - 1);
            }
            if(mid + 1 < right1){
                st.push(mid + 1);
                st.push(right1);
            }
        }
    }
}
