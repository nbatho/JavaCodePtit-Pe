import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022LoaiBoSoNguyen {
    static boolean isDigit(String s) {
        for (int i = 0 ;i < s.length();i++) {
            if (s.charAt(i) <  '0' || s.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        try {
            File f = new File("DATA.in");
            Scanner sc = new Scanner(f);
            ArrayList <String> a = new ArrayList<>();
            while (sc.hasNext()) {
                String s = sc.next();
                if (!isDigit(s)) {
                    a.add(s);
                }
                else {
                    if (s.length() > 10) {
                        a.add(s);

                    }
                }
            }
            Collections.sort(a);
            for (String i : a) {
                System.out.print(i + " ");
            }
            sc.close();
        } catch (Exception e) {
        }
    }
}
