import java.util.*;
public class WordInversion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            String[] s=str.split("[^a-zA-Z]+");
            StringBuilder sb = new StringBuilder();
            for (int i = s.length - 1; i >= 0; i--){
                sb.append(s[i] + " ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}