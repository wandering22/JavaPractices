import java.util.Scanner;

public class ToGiveChange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] X=str.split(" ");
        String[] p=X[0].split("\\.");
        String[] a=X[1].split("\\.");
        int[] A={Integer.parseInt(p[0]),Integer.parseInt(p[1]),Integer.parseInt(p[2])};
        int[] B={Integer.parseInt(a[0]),Integer.parseInt(a[1]),Integer.parseInt(a[2])};
        int[] result=new int[3];
        if(B[0]>A[0]){
            if(B[2]>A[2]){
                result[2]=B[2]-A[2];
            }else{
                B[2]=B[2]+29;
                result[2]=B[2]-A[2];
                B[1]=B[1]-1;
            }
            if(B[1]>A[1]){
                result[1]=B[1]-A[1];
            }else{
                B[1]=B[1]+17;
                result[1]=B[1]-A[1];
                B[0]=B[0]-1;
            }
            result[0]=B[0]-A[0];
            for(int i=0;i<2;i++){
                System.out.print(result[i]+".");
            }
            System.out.println(result[2]);
        }else{
            if(A[2]>B[2]){
                result[2]=A[2]-B[2];
            }else{
                A[2]=A[2]+29;
                result[2]=A[2]-B[2];
                A[1]=A[1]-1;
            }
            if(A[1]>B[1]){
                result[1]=A[1]-B[1];
            }else{
                A[1]=A[1]+17;
                result[1]=A[1]-B[1];
                A[0]=A[0]-1;
            }
            result[0]=A[0]-B[0];
            System.out.print("-");
            for(int i=0;i<2;i++){
                System.out.print(result[i]+".");
            }
            System.out.println(result[2]);
        }

    }
}
