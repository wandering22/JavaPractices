import java.util.Scanner;

public class BuyApple {
    public static void main (String[] args){
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        //int count1=0;
        //int count2=0;
        if(n%2!=0){
            System.out.println(-1);
        }
        else if(n%8==0){
            System.out.println(n/8);
        }
        else if(n%8!=0)
        {
            System.out.println(n/8+1);
        }

    }
}
