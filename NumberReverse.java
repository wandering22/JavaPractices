import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();

        String res="";

        while(num!=0){
            int x=num%10;
            res=res+String.valueOf(x);
            num=num/10;
        }
        System.out.println(res);
    }
}
