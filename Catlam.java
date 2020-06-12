import java.util.*;
public class Catlam {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=0;
        String[] strr=new String[2500];
        while(sc.hasNext()){
            //String str=sc.next();
            strr[i]=sc.next();
            i++;
        }
        Map<String,Integer> map=new HashMap<>();
        int count=0;
        for(int j=0;j<i;j++){
            if(map.containsKey(strr[j])){
                map.put(strr[j],map.get(strr[j]+1));
            }else{
                map.put(strr[j],1);
                count++;
            }
        }
        System.out.println(count);
    }
}
