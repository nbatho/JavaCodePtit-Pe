
import java.math.BigInteger;
import java.util.Scanner;

public class J03033BoiSoChungNhoNhat {
    public static BigInteger gcd(BigInteger a , BigInteger b) {
        while (!b.equals(BigInteger.ZERO)) {
            BigInteger tmp = b;
            b = a.mod(b);
            a = tmp;
        }   
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int t = 0 ; t < tc;t++) {

            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
    
            BigInteger ans = gcd(a,b);
            BigInteger lcm = a.multiply(b).divide(ans);
            System.out.println(lcm);
        }
    }
}
