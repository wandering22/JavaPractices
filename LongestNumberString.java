import java.util.Scanner;

public class LongestNumberString {
    public static StringBuilder Longest(String A){
//        if(A.length()==0){
//            return ;
//
//        }
       // int[] B=new int[];
        StringBuilder C=new StringBuilder();
        StringBuilder maxC=new StringBuilder();
        int len=0;
        int maxlen=0;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)>=48&&A.charAt(i)<=57){
                C.append(A.charAt(i));
                len++;
            }
            if(len>maxlen){
                maxlen=len;
                maxC=C;
            }
        }
        return maxC;
    }
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        String str1=scanner.toString();
        StringBuilder str=Longest(str1);
    }
}
