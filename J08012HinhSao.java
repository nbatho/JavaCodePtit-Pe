import java.util.*;

public class J08012HinhSao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] deg = new int[n + 1];

        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            deg[u]++;
            deg[v]++;
        }

        int center = 0;
        for (int i = 1; i <= n; i++) {
            if (deg[i] == n - 1) center++;
            else if (deg[i] != 1) {
                System.out.println("No");
                return;
            }
        }

        if (center == 1) System.out.println("Yes");
        else System.out.println("No");
    }
}
