import java.util.Scanner;

public class MeetingDraw {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            double x=JieCheng(n);
            double y=CC(n);
            double result=(y/x)*100;
            System.out.println(String.format("%.2f",result)+"%");
        }
    }
    //所有人都抽不到奖的情况
    private static double CC(int n) {
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else {
            return (n-1)*(CC(n-1)+CC(n-2));
        }
    }

    private static double JieCheng(int n) {
        double x=1;
        while(n>1){
            x=x*n;
            n--;
        }
        return x;
    }
}
