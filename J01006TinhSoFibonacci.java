
import java.util.Scanner;

public class J01006TinhSoFibonacci {
    static long[] F = new long[93];
    public static void Init() {
        F[0] = 1;
        F[1] = 1;
        for (int i = 2 ;i < 93;i++) {
            F[i] = F[i-1] + F[i-2];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Init();
        int t = sc.nextInt();
        for (int i = 0 ;i < t;i++) {
            int n = sc.nextInt();

            System.out.println(F[n-1]);
        }
    }
}
