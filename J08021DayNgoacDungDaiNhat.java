
import java.util.Scanner;
import java.util.Stack;

public class J08021DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ;i < tc;i++) {
            String s = sc.nextLine();

            Stack <Integer> st = new Stack<>();
            int ans = 0;
            st.push(-1);
            for (int j = 0 ;j < s.length();j++) {
                char c = s.charAt(j);
                if (c == '(') {
                    st.push(j);
                }
                else {
                    st.pop();
                    if (!st.empty()) {
                        ans = Math.max(ans,j - st.peek());
                    }
                    else st.push(j);
                }
            }
            System.out.println(ans);
        }
    }
}
