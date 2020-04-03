import java.util.Scanner;

public class 统计回文 {
    public static boolean isHuiWen(StringBuilder A){
        int i=0;
        int j=A.length()-1;
        while(i<j){
            if(A.charAt(i)!=A.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args){
        int count=0;
        Scanner scanner=new Scanner(System.in);
        String A=scanner.nextLine();
        String B=scanner.nextLine();
        for(int i=0;i<=A.length();i++){
            StringBuilder strA=new StringBuilder(A);
            strA.insert(i,B);
            if(isHuiWen(strA)){
                count++;
            }
        }
        System.out.println(count);
    }
}
