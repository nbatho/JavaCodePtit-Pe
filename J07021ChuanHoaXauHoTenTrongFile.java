import java.io.File;
import java.util.Scanner;

public class J07021ChuanHoaXauHoTenTrongFile {
     public static void main(String[] args) {
        try {

            File f = new File("DATA.in");
            Scanner sc = new Scanner(f);

            while (true) {
                String s = sc.nextLine().toLowerCase();
                if (s.equals("end")) break;
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
        } catch (Exception e) {

        }
    }
}
