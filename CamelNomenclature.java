import java.util.Scanner;

public class CamelNomenclature {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            char[] c=str.toCharArray();
            for(int i=0;i<c.length;i++){
                if(c[i]=='_'){
                    c[i+1]=(char)(str.charAt(i+1)-32);

                }

            }
            String s=new String(c);
            String[] strr=s.split("_");
            for(int i=0;i<strr.length;i++){
                System.out.print(strr[i]);
            }
            System.out.println();
        }
    }
}
