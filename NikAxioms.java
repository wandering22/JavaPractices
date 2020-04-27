import java.util.Scanner;

public class NikAxioms {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);

        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            int cur = input * (input - 1) + 1;
            StringBuffer s = new StringBuffer();
            for (int i = 0; i < input; i++) {
                if (i == input - 1) {
                    s.append(cur);
                }
                else {
                    s.append(cur + "+");
                }
                cur += 2;
            }
            System.out.println(s);
        }


    }
}
