import java.util.*;

public class J02022SoXaCach {
    static int n;
    public static void Try(int i, int[] a, int[] vs) {
        for (int j = 1; j <= n; j++) {
            if (vs[j] == 0) {
                a[i] = j;
                vs[j] = 1;
                if (i == n) {
                    boolean valid = true;
                    for (int k = 1; k < n; k++) {
                        if (Math.abs(a[k + 1] - a[k]) == 1) {
                            valid = false;
                            break;
                        }
                    }
                    if (valid) {
                        for (int k = 1; k <= n; k++) {
                            System.out.print(a[k]);
                        }
                        System.out.println("");
                    }
                } else {
                    Try(i + 1, a, vs);
                }
                vs[j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            n = sc.nextInt();
            int[] a = new int[15];
            int[] vs = new int[15];
            Try(1, a, vs);
        }
    }
}
