import java.util.BitSet;
import java.util.Scanner;

public class J01014UocSoNguyenToLonNhat {
    static int MAXN = 1000000;
    static BitSet prime = new BitSet(MAXN + 1);

    public static void sieve() {
        prime.set(2, MAXN + 1, true);
        for (int i = 2; i * 1L * i <= MAXN; i++) {
            if (prime.get(i)) {
                for (long j = (long) i * i; j <= MAXN; j += i) {
                    prime.clear((int) j);
                }
            }
        }
    }

    public static void main(String[] args) {
        sieve();
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            long n = sc.nextLong();
            long ans = 0;
            long tmp = n;

            for (int i = 2; i * 1L * i <= tmp; i++) {
                if (prime.get(i)) {
                    while (n % i == 0) {
                        ans = i;
                        n /= i;
                    }
                }
            }
            if (n > 1) ans = n; 

            System.out.println(ans);
        }
        sc.close();
    }
}
