
import java.util.Scanner;

public class J02036UocSoChungLonNhat {
    static int gcd(int a,int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
    static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        for (int t = 0 ; t < tc;t++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n+1];
            for (int i = 0 ;i < n;i++) a[i] = sc.nextInt();
            b[0] = a[0];
            for (int i = 1 ;i < n;i++) {
                b[i] = lcm(a[i-1],a[i]);
            }
            b[n] = a[n-1];
            for (int i = 0 ;i <= n;i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println("");
        }
    }
}
