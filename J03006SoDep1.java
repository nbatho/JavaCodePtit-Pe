
import java.util.Scanner;

public class J03006SoDep1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc != 0) {
            String s = sc.next();
            int valid = 1;
            for (int i = 0 ;i < s.length();i++) {
                int tmp = s.charAt(i) - '0';
                if (tmp % 2 != 0) {
                    valid = 0;
                    break;
                }
            }
            for (int i = 0 ;i < s.length() / 2;i++) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    valid = 0;
                    break;
                }
            }
            if (valid == 1) System.out.println("YES");
            else System.out.println("NO");
            tc-=1;
        }
    }
}
