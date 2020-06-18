import java.util.Scanner;

public class StringEncryption {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String A = sc.nextLine();
            String B = sc.nextLine();
            char[] A1 = A.toCharArray();
            char[] B1 = B.toCharArray();
            StringBuffer sb1 = new StringBuffer();
            for(int i = 0; i < A1.length; i++){
                sb1.append(encryption(A1[i]));
            }
            StringBuffer sb2 = new StringBuffer();
            for(int i = 0; i < B1.length; i++){
                sb2.append(decryption(B1[i]));
            }
            //return sb.toString();
            System.out.println(sb1.toString());
            System.out.println(sb2.toString());
        }
    }
    public static char encryption(char c){
        if(c >= 'a' && c < 'z')
            return (char)(c + 1 - 32);
        else if(c == 'z')
            return 'A';
        else if(c >= 'A' && c < 'Z')
            return (char)(c + 1 + 32);
        else if(c == 'Z')
            return 'a';
        else if(c >= '0' && c < '9')
            return (char)(c + 1);
        else if(c == '9')
            return '0';
        else
            return c;
    }

    public static char decryption(char c){
        if(c > 'a' && c <= 'z')
            return (char)(c - 1 - 32);
        else if(c == 'a')
            return 'Z';
        else if(c > 'A' && c <= 'Z')
            return (char)(c - 1 + 32);
        else if(c == 'A')
            return 'z';
        else if(c > '0' && c <= '9')
            return (char)(c - 1);
        else if(c == '0')
            return '9';
        else
            return c;
    }
}
