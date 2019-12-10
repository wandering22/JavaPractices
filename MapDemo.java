import java.util.Map;
import java.util.HashMap;


public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        System.out.println(map.size());          //0
        System.out.println(map.isEmpty());        //true
        map.put("作者", "鲁迅");
        map.put("书名", "狂人日记");
        map.put("发表时间", "1989");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()         //打印
                    + "--->" + entry.getValue());
        }
        System.out.println(map.get("作者"));         //鲁迅  根据指定的 k 查找对应的 v
        System.out.println(map.getOrDefault("作者", "佚名"));  //根据指定的 k 查找对应的 v，没有找到用默认值代替
        System.out.println(map.getOrDefault("页数", "佚名"));  //佚名是默认值
        System.out.println(map.containsKey("作者"));         //      true
        System.out.println(map.containsValue("佚名"));         //  false
        System.out.println(map.size());         //3
        System.out.println(map.isEmpty());         //false
        map.put("发表时间", "1990");         //修改
        map.put("页数", "300");         //  增加
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()         //打印
                    + "--->" + entry.getValue());
        }
    }
    }
