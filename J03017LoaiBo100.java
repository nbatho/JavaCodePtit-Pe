import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
public class J03017LoaiBo100 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc --> 0 ) {
            String s = sc.next();

            Stack <Integer> st = new Stack<>();
            ArrayList<Integer> ans = new ArrayList<>();
            for (int i = 0 ;i < s.length();i++) {
                if (st.size() >= 3) {
                    int a = st.peek(); st.pop();
                    int b = st.peek(); st.pop();
                    int c = st.peek(); st.pop();
 
                    if (s.charAt(a) == '0' && s.charAt(b) == '0' && s.charAt(c) == '1') {
                        ans.add(a);
                        ans.add(b);
                        ans.add(c);
                    }
                    else {
                        st.push(c);
                        st.push(b);
                        st.push(a);
                    }
                }

                st.push(i);
            }
            if (st.size() >= 3) {
                int a = st.peek(); st.pop();
                int b = st.peek(); st.pop();
                int c = st.peek(); st.pop();

                if (s.charAt(a) == '0' && s.charAt(b) == '0' && s.charAt(c) == '1') {
                    ans.add(a);
                    ans.add(b);
                    ans.add(c);
                }
                else {
                    st.push(c);
                    st.push(b);
                    st.push(a);
                }
            }
            Collections.sort(ans);
            int maxs = 0;
            int cnt =1;
            for (int i = 1 ;i < ans.size();i++) {
                if (Math.abs(ans.get(i) - ans.get(i-1)) == 1) {
                    cnt +=1;
                }
                else {
                    maxs = Math.max(maxs,cnt);
                    cnt =1;
                }
            }
            maxs = Math.max(maxs,cnt);
            System.out.println(maxs);
        }
    }
}