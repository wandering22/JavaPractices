import java.util.*;

public class kSmallestPairs {
    public int getSum(int[] o){
        return o[0] + o[1];
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        Queue<int[]> q = new PriorityQueue<int[]>(k, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return getSum(o2) - getSum(o1);
            }
        });

        for(int i = 0 ; i < nums1.length ; i ++){
            for(int j = 0 ; j < nums2.length ; j ++){
                int[] tmp = new int[]{nums1[i],nums2[j]};
                if(q.size() < k)
                    q.add(tmp);
                else{
                    if(getSum(tmp) < getSum(q.peek())){
                        q.poll();
                        q.add(tmp);
                    }
                }
            }
        }

        List<List<Integer>> res = new LinkedList<>();
        while(!q.isEmpty()){
            //res.add(q.poll());
            //将q队列顶的元素放进res
            List<Integer> num = new LinkedList<>();
            int[] tmp = q.poll();
            num.add(tmp[0]);
            num.add(tmp[1]);
            res.add(num);
        }

        return res;
    }
}
