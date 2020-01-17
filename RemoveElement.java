public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        //int nlength=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            // if(nums[i]==val){
            //     int tmp=nums[i];
            //     for(int j=nums.length-1;j>0;j--){
            //         nums[j-1]=nums[j];
            //     }
            //     int l=nums.length;
            //     nums[l-1]=tmp;
            // }

            // if(nums[i]!=val){
            //     nlength++;
            // }

            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;

    }
}
