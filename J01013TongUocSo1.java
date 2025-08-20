import java.util.*;

public class J01013TongUocSo1 {
    static final int MAX = 2000000; 
    static int[] spf = new int[MAX + 1];


    static void sieve() {
        for (int i = 2; i <= MAX; i++) spf[i] = i;
        for (int i = 2; i * i <= MAX; i++) {
            if (spf[i] == i) { 
                for (int j = i * i; j <= MAX; j += i) {
                    if (spf[j] == j) spf[j] = i;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sieve();

        int tc = sc.nextInt();
        long ans = 0; 
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            while (n > 1) {
                ans += spf[n];
                n /= spf[n];
            }
        }
        System.out.println(ans);
    }
}