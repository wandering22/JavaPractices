import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        System.out.println(list.size());      //0
        System.out.println(list.isEmpty());   //true
        list.add("哈喽");
        list.add("嗨");
        System.out.println(list.size());          //2
        System.out.println(list.isEmpty());       //false

        Object[] array=list.toArray();            // 返回一个装有所有集合中元素的数组
        System.out.println(Arrays.toString(array));      //   哈喽  嗨
        for(String s:list){
            System.out.println(s);                //   哈喽  （回车）  嗨
        }
        list.remove("嗨");
        System.out.println(list.size());          //1
        System.out.println(list.isEmpty());         //false
        for(String s:list){
            System.out.println(s);                //哈喽
        }
        list.clear();
        System.out.println(list.size());
    }

}
