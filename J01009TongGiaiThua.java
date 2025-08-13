
import java.util.Scanner;

public class J01009TongGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0;
        long[] F = new long[22];
        F[0] = 1;
        for (int i = 1 ; i <= n ;i++) {
            F[i] = F[i-1]*i;
            ans += F[i];
        }
        System.out.println(ans);
    }
}

