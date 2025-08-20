import java.util.Scanner;

public class J03005ChuanHoaXauHoTen2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine(); 

        while (tc-- > 0) {
            String s = sc.nextLine().toLowerCase();
            String tmp = "";
            String[] a = new String[100];
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

            for (int i = 1; i < idx; i++) {
                System.out.print(Character.toUpperCase(a[i].charAt(0)));
                for (int j = 1;j < a[i].length();j++) {
                    System.out.print(a[i].charAt(j));
                }
                if (i == idx -1) {

                    System.out.print(", ");
                }
                else System.out.print(" ");
            }
            System.out.println(a[0].toUpperCase());
        }
    }
}
