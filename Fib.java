import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fib(n);

    }

    public static void fib(int n){

        int ret1=0;
        for(int i=n;i>0;i--){


            if(judge(i)){
                ret1=n-i;
                break;
            }
        }
        int ret2=0;
        for(int i=n;i>0;i++){
            if(judge(i)){
                ret2=i-n;
                break;
            }

        }
        System.out.println(ret1<ret2?ret1:ret2);

    }
    public static boolean judge(int n){
        int i=1,j=1;
        while(j<n){
            j=i+j;
            i=j-i;
        }
        return (j==n);
    }
}
