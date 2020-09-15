public class ThirdMax {
    public int thirdMax(int[] nums) {
        Integer max = null;
        Integer mid = null;
        Integer min = null;
        for (Integer x : nums) {
            if (x.equals(max) || x.equals(mid) || x.equals(min)) {
                continue;
            }
            if ((max== null) || x > max) {
                min = mid;
                mid = max;
                max = x;
            }
            else if ((mid == null) || x > mid) {
                min = mid;
                mid = x;
            }
            else if ((min == null) || x > min) {
                min = x;
            }
        }
        if (min == null) {
            return max;
        }else {
            return min;
        }
    }
}
