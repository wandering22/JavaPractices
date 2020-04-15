import java.util.*;

public class DigitStatistics {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
       // int n=scanner.nextInt();
        String n=scanner.nextLine();
        //Queue c=new LinkedList() ;
       // int count=0;
        int[] num=new int[10];
        //for(int j=0;j<10;j++){

            for(int i=0;i<n.length();i++){
                num[n.charAt(i)-'0']++;
//                if(n.charAt(i)==j){
//
//                    num[]
//                    count++;
              }

            for(int i=0;i<10;i++){
                if(num[i]!=0){
                    System.out.println(i+":"+num[i]);
                }
            //c.offer(count);

        }
//        Stack s=new Stack();
//        List list=new ArrayList();
//        while(n>0){
//            int x=n%10;
//            n=n/10;
//            s.push(x);
//            list.add(x);
//        }
//
//        for(int i=0;i<list.size();i++)
//        while(!s.isEmpty()){
//
//        }

    }
}
