import java.util.*;

public class OnlyOnce {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            //这块不是很懂，使用nextInt接收个数时，还未输入具体数字 nextLine后面的代码也会执行
            String s=sc.nextLine();
            String s1=sc.nextLine();
            String[]  ss=s1.split(" ");
            Map<String,Integer> mm=new HashMap<String,Integer>();
            for(int i=0;i<ss.length;i++){
                //偶数最终将不在map中
                if(mm.containsKey(ss[i])){
                    mm.remove(ss[i]);
                }else{
                    mm.put(ss[i],1);
                }
            }
            Set<Map.Entry<String,Integer>>  es=mm.entrySet();
            int [] arr=new int[2];
            for(Map.Entry<String,Integer>  en:es){
                if(arr[0]==0){
                    arr[0]=Integer.parseInt(en.getKey());
                }else{
                    arr[1]=Integer.parseInt(en.getKey());
                }
            }
            int max=arr[0];
            int min=arr[1];
            if(arr[1]>max){
                max=arr[1];
                min=arr[0];
            }
//            if(arr[0]>arr[1]){
//                arr[0]=arr[0]^arr[1];
//                arr[1]=arr[0]^arr[1];
//                arr[0]=arr[0]^arr[1];
//            }
            System.out.println(min+" "+max);
        }

    }
//    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        List<Integer> list1=new ArrayList<>();
//        for(int i=0;i<n;i++){
//            list1.add(sc.nextInt());
//
//        }
//
//        List<Integer> list=new ArrayList<>();
//        int len=n;
//        for(int i=0;i<len-1;i++){
//            int count=1;
//            for(int j=i+1;j<len;j++){
//                if(list1.get(j)==list1.get(i)){
//                    count++;
//                    list.remove(j);
//                    len--;
//                }
//            }
//            if(count%2!=0){
//                list.add(count);
//
//            }
//        }
//        int max=list.get(0);
//        int min=list.get(1);
//        if(list.get(1)>max){
//            max=list.get(1);
//            min=list.get(0);
//        }
//        System.out.print(min+" "+max);
//    }
}
