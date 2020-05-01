public class FindUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) {
        if (nums == null || nums.length <= 1)
            return 0;
        int l = nums.length, r = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                int index = i - 1;
                while (index >= 0) {
                    if (nums[index] <= nums[i]) break;
                    index--;
                }
                l = Math.min(index + 1, l);
            }
            int j = nums.length - 1 - i;
            if (nums[j] > nums[j + 1]) {
                int index = j + 1;
                while (index < nums.length) {
                    if (nums[index] >= nums[j]) break;
                    index++;
                }
                r = Math.max(r, index - 1);
            }
        }
        return r == -1 ? 0 : r - l + 1;
    }
}
