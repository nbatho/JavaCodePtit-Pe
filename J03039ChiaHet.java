import java.math.BigInteger;
import java.util.*;
public class J03039ChiaHet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc != 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();

            boolean check1 = a.mod(b).equals(BigInteger.ZERO);
            boolean check2 = b.mod(a).equals(BigInteger.ZERO);


            if (check1 || check2) System.out.println("YES");
            else System.out.println("NO");


            tc -=1;
        }
    }
}
