import java.util.Scanner;
import java.util.Stack;

public class J08028HinhChuNhatDonSac {
    static long largestRectangle(int[] a, int n) {
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
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt(), n = sc.nextInt();
        int[] yellow = new int[n + 1];
        int[] blue = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            yellow[i] = sc.nextInt();
            blue[i] = m - yellow[i];
        }

        long ans = Math.max(largestRectangle(yellow, n),
                            largestRectangle(blue, n));
        System.out.println(ans);
    }
}
