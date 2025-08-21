import java.io.File;
import java.util.*;

public class J07008DayConTangDan {
    static ArrayList<String> ans = new ArrayList<>();

    public static void Try(int i, int n, int[] c, int[] a) {
        for (int j = 0; j <= 1; j++) {
            a[i] = j;
            if (i == n) {
                ArrayList<Integer> b = new ArrayList<>();
                for (int k = 1; k <= n; k++) {
                    if (a[k] == 1) b.add(c[k]);
                }

                if (b.size() > 1) {
                    boolean valid = true;
                    for (int t = 0; t < b.size() - 1; t++) {
                        if (b.get(t) >= b.get(t + 1)) { 
                            valid = false;
                            break;
                        }
                    }
                    if (valid) {
                        StringBuilder sb = new StringBuilder();
                        for (int x : b) sb.append(x).append(" ");
                        ans.add(sb.toString().trim());
                    }
                }
            } else {
                Try(i + 1, n, c, a);
            }
        }
    }

    public static void main(String[] args) {
        try {
            File f = new File("DAYSO.in");
            Scanner sc = new Scanner(f);

            int n = sc.nextInt();
            int[] a = new int[n + 1];
            int[] c = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                c[i] = sc.nextInt();
            }

            Try(1, n, c, a);

            Collections.sort(ans);
            for (String s : ans) {
                System.out.println(s);
            }

            sc.close();
        } catch (Exception e) {
           
        }
    }
}
