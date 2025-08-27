import java.math.BigInteger;
import java.util.Scanner;

public class J03018TimSoDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc --> 0) {
            BigInteger s = sc.nextBigInteger();

            if (s.mod(new BigInteger("4")).toString().equals("0")) {
                System.out.println("4");
            }
            else System.out.println("0");
        }
    }
}