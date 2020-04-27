import java.util.Scanner;

public class Square {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a=sc.nextLine();
        int x=(n+1)/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<x;j++){
                if(j==0||j==x-1){
                    System.out.print(a);
                }else if(i==1||i==n-2){
                    System.out.print(a);
                }else
                    System.out.print(" ");




            }
            System.out.println();
        }

    }
}
