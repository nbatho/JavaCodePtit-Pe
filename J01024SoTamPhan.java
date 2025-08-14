
import java.util.Scanner;

public class J01024SoTamPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        
        for (int t = 0 ; t < tc;t++) {
            String s = sc.next();
            int valid = 1;
            for (int i = 0 ;i < s.length();i++) {
                if (s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2') {
                    valid = 0;
                    break;
                }
            }
            if (valid == 1) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
