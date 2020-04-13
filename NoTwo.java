import java.util.Scanner;

public class NoTwo {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int W=scanner.nextInt();
        int H=scanner.nextInt();
//        int[] arr1=new int[W];
//        int[] arr2=new int[H];
        int ret=0;

        if (W % 4 == 0 || H % 4 == 0) {
            ret = W * H / 2;
        }
        else if (W % 2 == 0 && H % 2 == 0) {
            ret = (W * H / 4 + 1) * 2;
        }
        else {
            ret = W * H / 2 + 1;
        }
        System.out.println(ret);
    }
}
