import java.math.BigInteger;
import java.util.*;

public class BigIntegerSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BigInteger> list = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            list.add(new BigInteger(scanner.next()));
        }
        Collections.sort(list);
        for (BigInteger i : list) {System.out.println(i);
        }
    }
}