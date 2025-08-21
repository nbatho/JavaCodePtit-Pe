import java.util.Scanner;

public class J03024SoUuThe {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc !=0) {
            String s = sc.next();
            int valid = 1;
            int ok = 1;
            int chan = 0;
            int le = 0;
            for (int i = 0 ;i < s.length() ; i++) {
                char c  = s.charAt(i);
                if (c >= '0' && c <= '9') {
                    if ((c - '0') % 2 == 0) {
                        chan +=1;
                    }
                    else le+=1;
                }
                else {
                    valid = 0;
                    break;
                }
            }

            if (valid == 0) {
                System.out.println("INVALID");
            }
            else {
                if (chan > le) {
                    System.out.println("YES");
                } else if (le > chan && (le % 2 != 0)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }

            }

            tc-=1;
        }
    }
}
