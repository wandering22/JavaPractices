import java.util.*;

public class ListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.contains(3));    //true
        System.out.println(list.contains(5));    //false
        System.out.println(list.indexOf(1));     //0
        System.out.println(list.lastIndexOf(1));

        list.set(0, 0);
        //list.set(3,4);
        System.out.println(list);

        List<Integer> subList = list.subList(1, 2);  //截取
        System.out.println(subList);

        List<Integer> list2 = new ArrayList<>(list);
        System.out.println(list2);

        for (Integer e : list2) {
            System.out.println(e);
        }


    }
}
