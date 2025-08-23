
import java.util.Scanner;

public class J04003PhanSo {
    public static long  gcd(long  a, long  b) {
        while (b != 0) {
            long tmp = b;
            b = a%b;
            a = tmp;
        }
        return a;
    }
    public static void main(String[] args) {
        long a , b;
        Scanner sc = new Scanner(System.in);

        a = sc.nextLong();
        b = sc.nextLong();

        long mau = gcd(a,b);
        System.out.println((a/mau)+"/"+(b/mau));
    }
}
