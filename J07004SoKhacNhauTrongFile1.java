import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class J07004SoKhacNhauTrongFile1 {
    public static void main(String[] args) {
        try {
            File f = new File("DATA.in");
            Scanner sc = new Scanner(f);
            HashMap <Integer, Integer> mp = new HashMap <>();
            while (sc.hasNextInt()) {
                int x = sc.nextInt();
                mp.put(x, mp.getOrDefault(x, 0) + 1);
            }
            for (int i: mp.keySet()) {
                System.out.println(i + " " + mp.get(i));
            }
        } catch (Exception e) {
        }
    }
}
