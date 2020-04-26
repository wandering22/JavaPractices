import java.util.Scanner;
//每个测试用例在一行中给出10个非负整数，顺序表示我们拥有数字0、数字1、……数字9的个数。整数间用一个空
//        格分隔。10个数字的总个数不超过50，且至少拥有1个非0的数字
public class GroupMin {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        for(int i = 0;i <a.length;i++){
            a[i] = s.nextInt();
        }
        int j = 1;
        for(;j<a.length;j++) {
            if (a[j] != 0) {
                System.out.print(j);
                a[j] = a[j]-1;
                break;
            }
        }
        for(int k = 0;k <10;k++){
            for(int m = 0;m<a[k];m++){
                System.out.print(k);
            }
        }
    }
}
