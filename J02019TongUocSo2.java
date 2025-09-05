import java.util.*;

public class J02019TongUocSo2 {
    static boolean[] isPrime;
    static int[] sumDiv;
    public static void sieve(int n) {
        isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }
    public static void sumDivSieve(int n) {
        sumDiv = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                sumDiv[j] += i;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        sieve(b);
        sumDivSieve(b);

        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime[i]) continue;
            if (i % 2 != 0 && i < 945) continue;
            if (sumDiv[i] > 2 * i) cnt++;
        }

        System.out.println(cnt);
    }
}