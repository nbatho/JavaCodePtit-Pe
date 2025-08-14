import java.util.*;

public class J01022XauNhiPhan {
    static long[] len = new long[93]; 
    static void init() {
        len[1] = 1;
        len[2] = 1;
        for (int i = 3; i <= 92; i++) {
            len[i] = len[i-2] + len[i-1];
        }
    }

    static char find(int n, long k) {
        if (n == 1) return '0';
        if (n == 2) return '1';
        if (k <= len[n-2]) return find(n-2, k);
        else return find(n-1, k - len[n-2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        init();
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(find(n, k));
        }
    }
}
