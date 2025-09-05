import java.util.*;

public class J08015CapSoCoTongBangK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextLong();

            Map<Long, Long> freq = new HashMap<>();
            long cnt = 0;

            for (long x : a) {
                long need = k - x;
                if (freq.containsKey(need)) {
                    cnt += freq.get(need);
                }
                freq.put(x, freq.getOrDefault(x, 0L) + 1);
            }

            System.out.println(cnt);
        }
    }
}
