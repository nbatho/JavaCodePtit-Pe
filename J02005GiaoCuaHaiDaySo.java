import java.util.*;

public class J02005GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int k = 0, h = 0;
        while (k < n && h < m) {
            if (a[k] == b[h]) {
                if (k == 0 || a[k] != a[k - 1]) {
                    System.out.print(a[k] + " ");
                }
                k++;
                h++;
            } else if (a[k] < b[h]) {
                k++;
            } else {
                h++;
            }
        }
    }
}
