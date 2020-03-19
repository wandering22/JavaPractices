import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int num :nums){
            /*
            Integer n = mp.get(num);
            if(n == null)
                mp.put(num, 1);
            else{
                ++n;
                mp.put(num, n);
            }
            */

            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        for(int num : nums){
            if(mp.get(num) == 1)
                return num;
        }
        return -1;
    }
}

class Solution {
    public int singleNumber(int[] nums) {
        int ret = 0;
        for(int num :nums)
            ret ^= num;
        return ret;
    }
}