import java.util.*;

import static com.sun.webkit.perf.WCFontPerfLogger.log;

public class TimeJudge {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=0;i<m;i++){
            String s=sc.nextLine();
            Stack<String> A=new Stack<>();
            double[] nums=new double[100];
            double x;

            int len=s.length();
            for(int j=0;j<len;j++){
                int c=1;
                if(s.charAt(j)=='*'){
                    A.add("*");
                }else if(s.charAt(j)=='n'){
                    nums[c++]=n;
                }else if(s.charAt(j)=='s'){
                    A.add("sqrt");
                }else if(s.charAt(j)=='l'){
                    A.add("lg");
                }
            }
        }
    }
}