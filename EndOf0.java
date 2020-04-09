import java.util.Scanner;

public class EndOf0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = 0;
        while (n != 0) {
            result += n / 5;
            n /= 5;
        }
        System.out.println(result);
    }
}
