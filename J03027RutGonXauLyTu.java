
import java.util.Scanner;
import java.util.Stack;

public class J03027RutGonXauLyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        Stack <Character> st = new Stack<>();

        for (int i = 0 ;i < s.length();i++) {
            char c = s.charAt(i);
            if (st.size() >= 2) {
                char a = st.pop();
                char b =st.pop();
                if (a != b) {
                    st.push(b);
                    st.push(a);
                }
            }
            st.push(c);
        }
        if (st.size() >= 2) {
            char a = st.pop();
            char b =st.pop();
            if (a != b) {
                st.push(b);
                st.push(a);
            }
        }
        if (st.empty()) System.out.println("Empty String");
        else {
            String ans = "";
            while (!st.empty()) {
                ans += st.pop();
            }
            for (int i = ans.length() - 1 ; i >= 0;i-=1) {
                System.out.print(ans.charAt(i));
            }
            System.out.println("");
        }
        
    }
}
