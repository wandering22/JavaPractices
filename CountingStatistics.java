import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingStatistics {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            Map<String, Integer> map = new LinkedHashMap<String, Integer>();
            for(int i=0; i<n; i++) {
                map.put(sc.next(),0);
            }
            int x= sc.nextInt();
            int invalid = 0;
            for(int i=0; i<x; i++) {
                String y = sc.next();
                if(map.get(y) == null) {
                    invalid ++;
                } else {
                    map.put(y,map.get(y)+1);
                }
            }
            for(Map.Entry entry : map.entrySet()) {
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
            System.out.println("Invalid : "+invalid);
        }
    }
}
