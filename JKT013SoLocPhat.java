import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class JKT013SoLocPhat {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc --> 0) {
            int n = sc.nextInt();

            Queue <String> q = new ArrayDeque<>();
            ArrayList <String> ans = new ArrayList<>();
            q.add("6");
            q.add("8");

            while (!q.isEmpty()) {
                String t = q.poll();

                if (t.length() <= n) {
                    ans.add(t);
                }
                else break;

                q.add(t + "6");
                q.add(t + "8");
            }
            System.out.println(ans.size());
            for (int i = ans.size() - 1 ; i >= 0;i--) {
                System.out.print(ans.get(i) + " ");
            }
            System.out.println("");
        }
    }
}
