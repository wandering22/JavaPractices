import java.util.*;

public class ReSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int x=sc.nextInt();
            int n=sc.nextInt();
            String s=String.valueOf(x);
            if(s.length()!=8){
                System.out.println("error");
                break;
            }
            List<Integer> list=new ArrayList<>();
            int i=0;
            for( i=0;i<8;i++){
                list.add(x%10);
                x=x/10;
            }

            n=8-n;
            list.remove(n);
            int[] arr=new int[7];
            for(int j=0;j<7;j++){
                arr[j]=list.get(j);
            }
            Arrays.sort(arr);
            for(int j=6;j>=0;j--){
                System.out.print(arr[j]);
            }
        }
    }
}
