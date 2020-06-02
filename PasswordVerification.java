import java.util.Scanner;

public class PasswordVerification {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextLine()) {
            String p = cin.nextLine();
            if (JudgeLength(p) && checkCharKinds(p) && Two(p))
                System.out.println("OK");
            else
                System.out.println("NG");
        }
    }
    // 1.长度超过8位
    public static boolean JudgeLength(String p){
        if (p==null || p.length()<=8)
            return false;
        return true;
    }
    // 2.包括大小写字母.数字.其它符号,以上四种至少三种
    public static boolean checkCharKinds(String p){
        int x=0,y=0,z=0,q=0;
        char[] ch = p.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]>='0'&&ch[i]<='9') {
                x=1;
                continue;
            }
            else if (ch[i]>='a'&&ch[i]<='z') {
                y=1;
                continue;
            }
            else if (ch[i]>='A'&&ch[i]<='Z') {
                z=1;
                continue;
            }else {
                q=1;
                continue;
            }
        }
        int ret = x+y+z+q;
        return ret>=3 ? true : false;
    }
    // 3.不能有相同长度超2的子串重复
    public static boolean Two(String p){
        for(int i=0 ;i<p.length()-2 ;i++){
            String str =p.substring(i, i+3);
            if (p.substring(i+1).contains(str))
                return false;
        }
        return true;
    }

}
