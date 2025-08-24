
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J03019XauConLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        ArrayList <Character> a = new ArrayList<>();
        for (int i = 0 ;i < s.length();i++) {
            char c = s.charAt(i);
            if (!a.contains(c)) {
                a.add(c);
            }
        }
        Collections.sort(a);
        int idx = 0;
        for (int i = a.size() - 1 ;i>= 0;i-=1) {
            char c = a.get(i);
            for (int j = idx;j < s.length();j++) {
                char ch = s.charAt(j);
                if (c == ch) {
                    System.out.print(ch);
                    idx = j;
                }
            }
        }
    }
}
