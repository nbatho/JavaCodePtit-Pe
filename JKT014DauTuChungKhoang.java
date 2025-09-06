import java.util.Scanner;
import java.util.Stack;

public class JKT014DauTuChungKhoang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc --> 0) {
            int n = sc.nextInt();
            int [] a = new int[n+1];
            for (int i = 1 ;i <= n;i++) a[i] = sc.nextInt();
            Stack <Integer> st = new Stack<>();
            for (int i = 1 ;i <= n;i++) {
                while (!st.empty() && a[i] >= a[st.peek()]) st.pop();
                if (!st.empty()) {
                    System.out.print((i - st.peek()) + " ");
                }
                else System.out.print(i + " ");
                st.push(i);
         
            }
            System.out.println("");
        }
    }
}