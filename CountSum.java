import java.util.Scanner;

public class CountSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int a=n;
            //int[] arr=new int[];
            int m=0;
            while(n>0){
                m+=n%10;
                n=n/10;
            }
            System.out.print(m+" ");
            int x=a*a;
            int y=0;
            while(x>0){
                y+=x%10;
                x=x/10;
            }
            System.out.println(y);
        }
    }
}
