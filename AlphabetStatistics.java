import java.util.HashMap;
import java.util.Scanner;

public class AlphabetStatistics {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String[] arr = in.next().split("");
            HashMap<String,Integer> map = new HashMap<>();
            for(int i = 0; i <26 ; i++){
                char ch = (char) ('A'+i);
                String s = String.valueOf(ch);
                map.put(s,0);
            }
            for(int i = 0;i<arr.length;i++){
                if(arr[i].charAt(0)>='A'&&arr[i].charAt(0)<='Z'){
                    map.put(arr[i],map.get(arr[i])+1);
                }
            }
            for(String str:map.keySet())
                System.out.println(str+":"+map.get(str));
        }
    }
}
