import java.util.Scanner;

public class HighestScore {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int N=sc.nextInt();
            int M=sc.nextInt();
            int[] arr=new int[N];
            for(int i=0;i<N&&sc.hasNext();i++){
                arr[i]=sc.nextInt();
            }

            for(int i=0;i<M&&sc.hasNext();i++){
                //String C=sc.next();
                char C=sc.next().charAt(0);
                int A=sc.nextInt();
                int B=sc.nextInt();
                if(C=='Q'){
                    int max=0;
                    int end = Math.max(A, B);
                    int begin = Math.min(A, B)-1;
                    for(int j=begin;j<end;j++){
                        if(arr[j]>max){
                            max=arr[j];
                        }
                    }
                    System.out.println(max);
                }else{
                    arr[A-1]=B;
                }
            }
        }
    }
}
