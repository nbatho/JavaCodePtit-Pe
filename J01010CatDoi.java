
import java.util.Scanner;

public class J01010CatDoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        for (int t = 0 ;t < tc ;t++) {
            String n = sc.next();
            int cntZero = 0;
            long ans = 0;
            int valid = 1;
            for (int i = 0 ;i < n.length();i++) {
                int tmp = n.charAt(i);
                if (tmp == '0' || tmp == '8' || tmp == '9') {
                    cntZero += 1;
                    ans = 10*ans + 0;
                }
                else if (tmp == '1') ans = 10*ans + 1;
                else {
                    valid = 0;
                }
            }
            if (cntZero == n.length()) System.out.println("INVALID");
            else {
                if (valid == 0) System.out.println("INVALID");
                else System.out.println(ans);
            }
        }
    }
}
