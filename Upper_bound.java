public class Upper_bound {
    public class Solution {
        /**
         * 二分查找
         *
         * @param n int整型 数组长度
         * @param v int整型 查找值
         * @param a int整型一维数组 有序数组
         * @return int整型
         */
        public int upper_bound_(int n, int v, int[] a) {
            // write code here
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int mid = (left + right) / 2;
                if (v <= a[mid]) {
                    if (mid == 0 || a[mid - 1] < v)
                        return mid + 1;
                    else
                        right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return n + 1;
        }
    }
}
