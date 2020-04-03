import java.util.Scanner;

public class 汽水瓶 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        while(scanner.hasNextInt()){
            int n=scanner.nextInt();
            int a=n/2;
            System.out.println(a);
        }
    }
}
