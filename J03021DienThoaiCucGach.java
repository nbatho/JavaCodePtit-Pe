
import java.util.Scanner;

public class J03021DienThoaiCucGach {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc != 0) {
            String s = sc.next();
            
            int[] a = new int[s.length()];
            for (int i = 0 ;i < s.length();i++) {
                char c = s.toUpperCase().charAt(i);
                
                if (c == 'A' || c == 'B' || c == 'C') a[i] = 2;
                else if (c == 'D' || c == 'E' || c == 'F') a[i] = 3;
                else if (c == 'G' || c == 'H' || c == 'I') a[i] = 4;
                else if (c == 'J' || c == 'K' || c == 'L') a[i] = 5;
                else if (c == 'M' || c == 'N' || c == 'O') a[i] = 6;
                else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') a[i] = 7; 
                else if (c == 'T' || c == 'U' || c == 'V') a[i] = 8;
                else a[i] = 9;
            }
            boolean valid = true;
            for (int i = 0 ;i < s.length() / 2;i++) {
                if (a[i] != a[s.length() - 1 - i]) {
                    valid = false;
                    break;
                }
            }
            System.out.println(valid ? "YES" : "NO");

            tc-=1;
        }
    }
}
