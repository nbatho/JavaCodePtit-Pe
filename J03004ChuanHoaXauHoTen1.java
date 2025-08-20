import java.util.*;

public class J03004ChuanHoaXauHoTen1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine(); 

        while (tc-- > 0) {
            String s = sc.nextLine().toLowerCase();
            String tmp = "";

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    tmp += c;
                } else if (c == ' ') {
                    if (!tmp.isEmpty()) {
                        System.out.print(Character.toUpperCase(tmp.charAt(0)));
                        for (int j = 1; j < tmp.length(); j++) {
                            System.out.print(tmp.charAt(j));
                        }
                        System.out.print(" ");
                        tmp = "";
                    }
                }
            }
            if (!tmp.isEmpty()) {
                System.out.print(Character.toUpperCase(tmp.charAt(0)));
                for (int j = 1; j < tmp.length(); j++) {
                    System.out.print(tmp.charAt(j));
                }
            }

            System.out.println();
        }
    }
}
