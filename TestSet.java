import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestSet {
    public static void testSet()
    {
        Set<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(-2);
        set.add(100);
        //遍历时有序
        for(Integer e : set){
            System.out.print(e + " ");
        }
        System.out.println();

        System.out.println("迭代器：搜索树的中序遍历");
        Iterator<Integer> it = set.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }
    }

    public static void main(String[] args) {
        //testMap();
        testSet();
    }
}
