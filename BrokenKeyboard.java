import java.util.*;
public class BrokenKeyboard {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String A=sc.next().toUpperCase();
        String B=sc.next().toUpperCase();
//        Map<Character,Integer> map=new HashMap<>();
//        for(int i=0;i<B.length();i++){
//            boolean flag=true;
//            for(int j=0;j<A.length();j++){
//                if(A.charAt(j)==B.charAt(i)) {
//                    flag=false;
//
//                }
//
//            }
//            if(flag==true){
//                if(map.containsKey(B.charAt(i))){
//                    map.put(B.charAt(i),map.get(B.charAt(i)+1));
//                }else
//                    map.put(B.charAt(i),1);
//            }
//
//        }
//        for(Character c:map.keySet()){
//            System.out.print(c+" ");
//        }

        for(int i=0;i<B.length();i++){
            A=A.replace(B.charAt(i)+"","");
        }

        String str="";
        for(int i=0;i<A.length();i++){
            if(str.contains(A.charAt(i)+"")){
                continue;
            }else{
                System.out.print(A.charAt(i));
                str+=A.charAt(i);
            }
        }
    }
}