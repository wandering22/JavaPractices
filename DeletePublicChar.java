import java.util.Scanner;

public class DeletePublicChar {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        String A=scanner.nextLine();
        String B=scanner.nextLine();
        char[] C=B.toCharArray();
        char[] D=A.toCharArray();
        for(int i=0;i<D.length;i++){
            if(!B.contains(String.valueOf(D[i]))){
                System.out.print(D[i]);
            }
        }
        System.out.println();
    }
}
