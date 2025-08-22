
import java.util.Scanner;

public class J03026XauKhacNhauDaiNhat {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        int tc = sc.nextInt();
        while (tc != 0) {
            String a = sc.next();
            String b = sc.next();

            int invalid = 1;
            if (a.length() != b.length()) invalid = 0;
            else {
                for (int i = 0 ;i < a.length();i++) {
                    if (a.charAt(i) != b.charAt(i)) {
                        invalid = 0;
                        break;
                    }
                }

            }
            if (invalid == 0) System.out.println(Math.max(a.length(),b.length()));
            else {
                System.out.println("-1");
            }
            tc-=1;  
        }
    }
    
}
