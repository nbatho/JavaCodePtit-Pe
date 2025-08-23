import java.util.HashMap;
import java.util.Scanner;

public class J03010DiaChiEmail {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); 
        HashMap <String,Integer> mp = new HashMap<>();
        while (n-- > 0) {
            String s = sc.nextLine().toLowerCase();
            String tmp = "";
            String[] a = new String[100];
            String mail = "";
            int idx = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    tmp += c;
                } else if (c == ' ') {
                    if (!tmp.isEmpty()) {
                        a[idx++] = tmp;
                        tmp = "";
                    }
                }
            }
            if (!tmp.isEmpty()) {
                a[idx++] = tmp;
            }
            mail += a[idx-1];
            for (int i = 0 ;i < idx - 1 ;i++) {
                mail += a[i].charAt(0);
            }

            if (mp.containsKey(mail)) {
                int tt = mp.get(mail);
                System.out.println(mail + tt + "@ptit.edu.vn");
                mp.put(mail,tt +1);
            }
            else {
                System.out.println(mail + "@ptit.edu.vn");
                mp.put(mail, 2);
            }
        }

    }
}
