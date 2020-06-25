import java.util.*;
public class PingPongFrame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String a=sc.next();
            String b=sc.next();

            ArrayList<Character> A = new ArrayList<Character>();
            ArrayList<Character> B = new ArrayList<Character>();
            for(int i = 0; i < a.length(); i++) {
                A.add(a.charAt(i));
            }
            for(int i = 0; i < b.length(); i++) {
                B.add(b.charAt(i));
            }
            for(int i = 0; i < B.size(); i++) {
                if(A.contains(B.get(i))) {
                    A.remove(A.get(A.indexOf(B.get(i))));
                    B.remove(i);
                    i--;
                }
            }
            if(B.size() == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            A = null;
            B = null;

        }
    }
}
