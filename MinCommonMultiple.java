import java.util.Scanner;

public class MinCommonMultiple {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int A=scanner.nextInt();
        int B=scanner.nextInt();
        int ret=minCommonMultiple(A,B);
        System.out.println(ret);
    }
    public static int minCommonMultiple(int A,int B){
        //if(A%B==0)
        //   return A;
        //else if(B%A==0)
        //    return B;
        int max=0,min=0;
        if(A>B){
            max=A;
            min=B;
        }else if(A<B){
            max=B;
            min=A;
        }
        int i=min;
        while(i<A*B&&!(i%max==0&&i%min==0)){
            i++;
        }
        return i;
    }

}
