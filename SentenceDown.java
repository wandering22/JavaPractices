import java.util.Scanner;

public class SentenceDown {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] strr=str.split(" ");
        for(int i=strr.length-1;i>=0;i--){
            if(i>0)
                System.out.print(strr[i]+" ");
            else
                System.out.print(strr[i]);
        }

    }
}
