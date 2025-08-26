import java.io.File;
import java.util.Scanner;
import java.util.TreeSet;

public class J07007LietKeTuKhacNhau {
    public static void main(String[] args) {
        try {
            File f = new File("VANBAN.in");
            Scanner sc = new Scanner(f);
            TreeSet <String> set = new TreeSet <>();
            while (sc.hasNext()) {
                String s = sc.next();

                set.add(s.toLowerCase());
            }
            for (String i:set) {
                System.out.println(i);
            }

        } catch (Exception e) {
        }
    }
} 
