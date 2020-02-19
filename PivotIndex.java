public class PivotIndex {
    public int pivotIndex(int[] nums) {
        //左求和*2+中心索引值 = 总和
        int sum=0,sum2=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(sum2*2+nums[i]==sum){
                return i;
            }
            sum2+=nums[i];
        }
        return -1;
    }
}
