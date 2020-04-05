import java.sql.SQLOutput;
import java.util.Scanner;

public class CalculateCandy {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int a = 0,b=0,c=0,d=0;
        while(scanner.hasNextInt()){
             a=scanner.nextInt();
             b=scanner.nextInt();
             c=scanner.nextInt();
             d=scanner.nextInt();
        }

        int A=0,B=0,C=0;
        if((a+c)%2==0&&(b+d)%2==0&&(c-a)%2==0&&(d-b)%2==0&&(b+d)/2==(c-a)/2) {
            A = (a + c) / 2;
            B = (b + d) / 2;
            C = B - b;
            System.out.println(A+" "+B+" "+C);
        }
        else
            System.out.println("No");



    }
}
