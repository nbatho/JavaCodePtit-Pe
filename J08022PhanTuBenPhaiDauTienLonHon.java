
import java.util.Scanner;
import java.util.Stack;

public class J08022PhanTuBenPhaiDauTienLonHon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        for (int t = 0 ; t < tc ;t++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] ans = new int[n]; 
            for (int i = 0 ;i < n;i++) {
                a[i] = sc.nextInt();
                ans[i] = -1;
            }
            Stack <Integer> st = new Stack<>();
            for (int i = n - 1 ;i>= 0 ;i--) {
                while (!st.empty() && st.peek() <= a[i]) st.pop();
                if (!st.empty()) ans[i] = st.peek();
                st.push(a[i]);
            }
            for (int i = 0 ;i < n;i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println("");
        }
    }
}
