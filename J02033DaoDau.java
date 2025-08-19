import java.util.*;
public class J02033DaoDau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();

        long[] a = new long[n];
        int am = 0;
        for (int i = 0 ;i < n;i++) {
            a[i] = sc.nextLong();
            if (a[i] < 0) am +=1;
        }
        Arrays.sort(a);
        long sum =0;
        if (k <= am) {
            for (int i = 0 ;i < k;i++) {
                a[i] = -a[i];
            }
        }
        else {
            for (int i = 0 ;i < am;i++) {
                a[i] = -a[i];
            }
            Arrays.sort(a);
            k -=am;
            if (k % 2 == 1) a[0] = -a[0];
        }
        for (int i = 0 ;i < n;i++) {
            sum += a[i];
        }
        System.out.println(sum);
    }
}
