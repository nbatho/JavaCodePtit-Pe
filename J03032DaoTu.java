import java.util.Scanner;

public class J03032DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine(); 
        while (tc-- > 0) {
            String s = sc.nextLine();
            String tmp = "";
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c != ' ') {
                    tmp += c;
                } else {
                    for (int j = tmp.length() - 1; j >= 0; j--) {
                        System.out.print(tmp.charAt(j));
                    }
                    if (!tmp.isEmpty()) System.out.print(" ");
                    tmp = "";
                }
            }
            for (int j = tmp.length() - 1; j >= 0; j--) {
                System.out.print(tmp.charAt(j));
            }
            System.out.println();
        }
    }
}
