import java.util.Scanner;

public class DeletePublicChar2 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String A = sc.nextLine();
            String B = sc.nextLine();
            String ret = "[" + B + "]";
            String result = A.replaceAll(ret, "");
            System.out.println(result);
        }
    }
}
