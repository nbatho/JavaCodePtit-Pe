import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class J08029QuanMa {
    static class Pair {
        int f, s, step;
        Pair(int x, int y, int i) {
            f = x;
            s = y;
            step = i;
        }
    }

    static Pair[] d = {
        new Pair(-2, 1, 0),
        new Pair(-1, 2, 0),
        new Pair(1, 2, 0),
        new Pair(2, 1, 0),
        new Pair(-2, -1, 0),
        new Pair(-1, -2, 0),
        new Pair(1, -2, 0),
        new Pair(2, -1, 0)
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();
        while (tc-- > 0) {
            String s = sc.nextLine();

            int x = s.charAt(0) - 'a';
            int y = s.charAt(1) - '1';
            int u = s.charAt(3) - 'a';
            int v = s.charAt(4) - '1';

            int[][] vs = new int[8][8];
            Queue<Pair> q = new ArrayDeque<>();
            q.add(new Pair(y, x, 0));
            vs[y][x] = 1;

            int ans = -1;
            while (!q.isEmpty()) {
                Pair top = q.poll();

                if (top.f == v && top.s == u) {
                    ans = top.step;
                    break;
                }

                for (Pair dir : d) {
                    int ni = top.f + dir.f;
                    int nj = top.s + dir.s;
                    if (ni >= 0 && ni < 8 && nj >= 0 && nj < 8 && vs[ni][nj] == 0) {
                        vs[ni][nj] = 1;
                        q.add(new Pair(ni, nj, top.step + 1));
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
