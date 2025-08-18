import java.util.Scanner;

public class J02008BoiSoNhoNhatCuaNSoNguyenDuongDauTien {
    public static long gcd(long a, long b) {
        while (b != 0) {
            long tmp = b;
            b = a%b;
            a = tmp;
        }

        return a;
    }

    public static long lcm(long a, long b) {
        return (a*b) / gcd(a,b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            long n = sc.nextLong();
            long ans = 1;

            for (int i = 2; i <= n; i++) {
                ans = lcm(ans, i);
            }

            System.out.println(ans);
        }
    }
}
