
import java.util.Scanner;

public class J02004MangDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int t= 0 ;  t < tc ; t++) {
            int n = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0 ;i < n;i++) {
                a[i] = sc.nextInt();
            }
            int valid = 1;
            for (int i = 0 ;i < n /2;i++) {
                if (a[i] != a[n - i - 1]) {
                    valid = 0;
                    break;
                }
            }
            if (valid == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
