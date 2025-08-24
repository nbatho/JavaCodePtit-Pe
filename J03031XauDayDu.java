
import java.util.Scanner;

public class J03031XauDayDu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc --> 0 ) {
            String s = sc.next();
            int k = sc.nextInt();

            int[] d = new int[26];
            for (int i = 0 ;i < s.length();i++) {
                char c = s.charAt(i);
                d[c - 'a'] +=1;
            }
            int miss = 0;
            for (int i = 0 ;i < 26;i++) {
                if (d[i] == 0) {
                    miss +=1;
                }
            }
            if (miss <= k) {
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
    
}
