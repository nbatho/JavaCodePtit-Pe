
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class J08026BienDoiST {
    static class Node {
        int val, step;
        Node(int v, int s) {
            val = v;
            step = s;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc --> 0) {
            int s = sc.nextInt(), t = sc.nextInt();
            int[] vs = new int[100001];
            Queue <Node> q = new ArrayDeque<>();

            q.add(new Node(s,0));
            vs[s] = 1;
            while (!q.isEmpty()) {
                Node top = q.poll();

                if (top.val == t) {
                    System.out.println(top.step);
                    break;
                }

                if (top.val * 2 <= 100000  && vs[top.val * 2] == 0) {
                    vs[top.val * 2] = 1;
                    q.add(new Node(top.val*2,top.step + 1));
                }
                if (top.val -1 > 0  && vs[top.val -1] == 0) {
                    vs[top.val -1] = 1;
                    q.add(new Node(top.val -1,top.step + 1));
                }
            }
        }
    }
}
