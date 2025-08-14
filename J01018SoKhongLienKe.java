import java.util.*;
public class J01018SoKhongLienKe {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        int tc = sc.nextInt();
        for (int t = 0 ;t < tc;t++) {
            String s = sc.next();
            int valid = 1;
            int sum = s.charAt(0) - '0';
            for (int i = 1 ;i < s.length() - 1;i++) {
                sum += s.charAt(i) - '0';
                int a = s.charAt(i) - '0';
                int b = s.charAt(i+1) - '0';
                if (Math.abs(a-b) != 2) {
                    valid = 0;
                    break;
                }
    
            }
            sum += s.charAt(s.length()-1) -'0';
            if (sum % 10 != 0) valid = 0;
            if (valid == 1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
