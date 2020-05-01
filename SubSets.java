import java.util.ArrayList;
import java.util.List;

public class SubSets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        for(int i = 0; i < nums.length ; i++){
            int size = res.size();
            for (int j = 0; j < size; j++) {
                List<Integer> newtemp = new ArrayList<Integer>(res.get(j));
                newtemp.add(nums[i]);
                res.add(newtemp);
            }
        }
        return res;

    }
}
