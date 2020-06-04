import java.util.*;
public class SayOpposite {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //String[] str=new String[80];
        //int i=0;
        //while ((sc.hasNext())){
        //String A=sc.nextLine();
        //}

        String str=sc.nextLine();
        String[] A = str.split(" ");
        for(int i=0;i<A.length;i++){
            if(i==A.length-1){
                System.out.print(A[A.length-1-i]);
            }else{
                System.out.print(A[A.length-1-i]+" ");
            }
        }


    }
}
