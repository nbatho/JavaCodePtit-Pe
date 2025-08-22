
import java.util.Scanner;

public class J03028MaHoaDRM {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc != 0) {
            String s = sc.next();
            int n = s.length();
            String b = s.substring(0,n/2);
            String c = s.substring(n/2,n);

            int xoayB = 0;
            int xoayC = 0;
            String rotateB = "";
            String rotateC = "";
            for (int i = 0 ;i < b.length();i++) {
                char kt = b.charAt(i);
                xoayB += (kt-65);
            }
            for (int i = 0 ;i < c.length();i++) {
                char kt = c.charAt(i);
                xoayC += (kt-65);
            }
            for (int i = 0 ;i < b.length();i++) {
                char kt = b.charAt(i);
                int sau = (kt + xoayB - 65)%26;
                rotateB += (char) (sau + 65);
            }
            for (int i = 0 ;i < c.length();i++) {
                char kt = c.charAt(i);
                int sau = (kt + xoayC - 65)%26;
                rotateC += (char) (sau + 65);
            }
            String ans = "";
            for (int i = 0 ;i < b.length();i++) {
                char tmp1 = rotateB.charAt(i);
                char tmp2 = rotateC.charAt(i);

                ans += (char) ((tmp1 + tmp2) % 26 + 65);
            }
            System.out.println(ans);

            tc-=1;
        }
    }    
}
