
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class J08024So0VaSo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc --> 0) {
            int n = sc.nextInt();

            Queue <String> q = new ArrayDeque<>();

            q.add("9");

            while (!q.isEmpty()) {
                String t = q.poll();

                if (Integer.parseInt(t) % n == 0) {
                    System.out.println(t);
                    break;
                }

                q.add(t + "0");
                q.add(t + "9");
            }
        }
    }
}
