import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BuyOrNotbug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        List<Character> list1 = new ArrayList<Character>();
        List<Character> list2 = new ArrayList<Character>();
        for (int i = 0; i < A.length(); i++) {
            list1.add(A.charAt(i));
        }
        for (int i = 0; i < B.length(); i++) {
            list2.add(B.charAt(i));
        }
        System.out.println(list1.size() + " " + list2.size());
        int count = 0;


        for (int i = 0; i < list2.size(); i++) {
            //int j = 0;
            boolean flag = true;
            for (int j = 0; j < list1.size(); j++) {
                //if (list1.contains(list2.get(j))) {

                if (list1.get(j) == list2.get(i)) {
                    list1.set(j, '0');
                    //list2.remove(i);
                    flag = false;
                    System.out.println(list1.size() + " " + list2.size());
                    break;
                }

            }
            if (flag == true) {
                count++;
            }
//            if (!list1.contains(list2.get(i))) {
//                //System.out.println("No");
//                count++;
//            }
        }
        // else


//        if(list2.size()==0){
//            System.out.println("Yes"+" "+(A.length()-B.length()));
//            //System.out.println(list1.size()+" "+list2.size());
//        }else
//            System.out.println("No"+" "+count);
        if (count != 0) {
            System.out.println("No" + " " + count);
        } else {
            System.out.println("Yes" + " " + (A.length() - B.length()));


        }
    }
}
