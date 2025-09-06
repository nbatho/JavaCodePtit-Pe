import java.util.Scanner;
import java.util.Stack;

public class J08023HinhChuNhatLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) a[i] = sc.nextInt();

            int[] left = new int[n + 1];
            int[] right = new int[n + 1];

            Stack<Integer> st = new Stack<>();
            for (int i = 1; i <= n; i++) {
                while (!st.isEmpty() && a[st.peek()] >= a[i]) st.pop();
                if (st.isEmpty()) left[i] = 0;
                else left[i] = st.peek();
                st.push(i);
            }

            st = new Stack<>();
            for (int i = n; i >= 1; i--) {
                while (!st.isEmpty() && a[st.peek()] >= a[i]) st.pop();
                if (st.isEmpty()) right[i] = n + 1;
                else right[i] = st.peek();
                st.push(i);
            }

            long ans = 0;
            for (int i = 1; i <= n; i++) {
                int width = right[i] - left[i] - 1;
                long area = 1L * width * a[i];
                ans = Math.max(ans, area);
            }
            System.out.println(ans);
        }
    }
}
