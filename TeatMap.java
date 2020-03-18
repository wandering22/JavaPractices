import java.util.*;

public class TeatMap {
    public static void testMap(){
        Map<String, String> mp = new TreeMap<>();
        // Map: key 不重复， value 可以重复
        //插入：put： key不存在，直接插入，key如果存在，修改key对应的value
        mp.put("周荣", "20080311");
        //System.out.println(mp.get("周荣"));
        mp.put("王继文", "20160211");
        mp.put("周荣", "20120020");
        mp.put("陈老师", "20120020");
        // get
        //System.out.println(mp.get("周荣"));
        //System.out.println(mp.get("陈老师"));
        /*
        System.out.println(mp.get("王"));
        System.out.println(mp.getOrDefault("王", "00000"));
        System.out.println(mp.getOrDefault("周荣", "1111"));

         */
        //System.out.println(mp.remove("周荣"));
        // System.out.println(mp.remove("周荣"));

        //System.out.println(mp.containsKey("王继文"));
        //System.out.println(mp.containsValue("20120020"));
        System.out.println("keySet:");
        Set<String> keySet = mp.keySet();
        for(String key : keySet){
            System.out.println(key);
        }
        System.out.println("Values: ");
        Collection<String> values = mp.values();
        for(String v : values){
            System.out.println(v);
        }
        System.out.println("EntrySet:");
        Set<Map.Entry<String, String>> entrySet = mp.entrySet();
        for(Map.Entry<String, String> es : entrySet){
            System.out.println(es.getKey() + "---->"  + es.getValue());
        }
    }

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
