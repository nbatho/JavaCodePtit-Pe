import java.util.*;

public class J02017ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Stack<Integer> st = new Stack<>();
        for (int x : a) {
            if (!st.isEmpty() && (st.peek() + x) % 2 == 0) {
                st.pop(); 
            } else {
                st.push(x); 
            }
        }

        System.out.println(st.size());
    }
}
