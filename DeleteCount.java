import java.util.*;

public class DeleteCount {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt()){
            int n=scanner.nextInt();
            Queue list=new LinkedList();
            if(n>1000)
                n=999;
            for(int i=0;i<n;i++){
                list.offer(i);
            }
            //int j=0;
            while(list.size()>1){
                for(int j=0;j<2;j++){
                    list.offer(list.poll());

                }
                list.poll();
                // j++;
            }


            System.out.println(list.poll());
        }
    }
}
