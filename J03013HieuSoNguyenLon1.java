
import java.util.ArrayList;
import java.util.Scanner;

public class J03013HieuSoNguyenLon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc != 0) {
            String a = sc.next();
            String b = sc.next();

            if (a.length() < b.length()) {
                String tmp = a;
                a = b;
                b = tmp;
            }
            if (b.length() < a.length()) {
                String zero ="";
                int thieu = a.length() - b.length();
                for (int i = 0 ;i < thieu;i++) {
                    zero += "0";
                }
                b = zero + b;
            }
            int nho = 0;
            int num = 0;
            ArrayList <Integer> ans = new ArrayList<>();
            for (int i = a.length() - 1 ;i>=0;i-=1) {
                int s1 = a.charAt(i) - '0';
                int s2 = b.charAt(i) - '0';
                num = s1 - s2 - nho;
                if (num < 0) {
                    num += 10;
                    nho = 1;
                }
                else nho = 0;
                ans.add(num);
            }
            for (int i = ans.size() - 1 ;i >= 0;i--) {

                System.out.print(ans.get(i));
            }
            System.out.println("");
            tc -=1;
        }
    }    
}
