import java.util.*;
public class BoxingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            Map<Character, Integer> map1 = new HashMap<>();
            Map<Character, Integer> map2 = new HashMap<>();
            int x = 0, y = 0;
            for (int i = 0; i < N; i++) {
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);
                if (Game(a, b) == 1) {
                    x++;

                    if (map1.containsKey(a)) {
                        map1.put(a, map1.get(a) + 1);
                    } else
                        map1.put(a, 1);
                }

                if (Game(a, b) == -1) {
                    y++;

                    if (map2.containsKey(b)) {
                        map2.put(b, map1.get(b) + 1);
                    } else
                        map2.put(b, 1);
                }


            }
            System.out.println(x + " " + (N - x - y) + " " + y);
            System.out.println(y + " " + (N - x - y) + " " + x);

            int max1=0;
            char k1=' ';
            for (char m : map1.keySet()) {
                if(map1.get(m)>max1) {
                    max1 = map1.get(m);
                    k1 = m;
                }
            }
            if(max1==0){
                System.out.print('B'+" ");
            }else
                System.out.print(k1+" ");
            int max2=0;
            char k2=' ';
            for (char n : map2.keySet()) {
                if(map2.get(n)>max2) {
                    max2 = map2.get(n);
                    k2 = n;
                }
            }
            if(max2==0){
                System.out.print('B'+" ");
            }else
                System.out.print(k2);
        }
    }
    public static int Game(char A,char B){
        if(A==B)
            return 0;
        else{
            if(A=='C'&&B=='J'||A=='J'&&B=='B'||A=='B'&&B=='C')
                return 1;
        }
        return -1;
    }
}
