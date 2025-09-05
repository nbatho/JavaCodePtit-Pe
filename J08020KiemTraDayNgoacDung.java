
import java.util.Scanner;
import java.util.Stack;

public class J08020KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ;i < tc;i++) {
            String s = sc.nextLine();

            Stack<Character> st = new Stack<>();

            for (int j = 0 ;j < s.length();j++) {
                char c = s.charAt(j);

                if (c == '(' || c == '[' || c == '{') {
                    st.push(c);
                }
                else {
                    if (!st.empty()) {
                        if ((c == ')' && st.peek() == '(') || 
                            (c == ']' && st.peek() == '[') || 
                            (c == '}' && st.peek() == '{')) {
                            st.pop();
                        }

                        else st.push(c);
                    }
                }
            }
            if (st.empty()) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            } 
        }
    }
}
