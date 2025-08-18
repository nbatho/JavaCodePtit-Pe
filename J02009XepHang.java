
import java.util.Scanner;

public class J02009XepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] t = new int[n];
        int[] d = new int[n];
        for (int i = 0 ; i < n;i++) {
            t[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }

        for (int i = 0 ;i < n-1;i++) {
            for (int j = i+1 ;j<n;j++) {
                if (t[i] > t[j]) {
                    int tmp = t[i];
                    t[i] = t[j];
                    t[j] = tmp;

                    int tmp2 = d[i];
                    d[i] = d[j];
                    d[j] = tmp2;
                }
            }
        }
        int ans = 0;
        for (int i = 0 ;i < n;i++) {
            if (t[i] > ans) {
                ans = t[i];
            }
            ans += d[i];
        }
        System.out.println(ans);
    }
}
