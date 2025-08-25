import java.io.File;
import java.util.Scanner;

public class J07002TinhTong {
    public static void main(String[] args) {
        try {
            File f = new File("DATA.in");
            Scanner sc = new Scanner(f);
            long sum = 0;
            while (sc.hasNext()) {
                String s = sc.next();
                try {
                    long val = Long.parseLong(s);
                    if (val <= Integer.MAX_VALUE && val >= Integer.MIN_VALUE) {
                        sum += val;
                    }
                } catch (NumberFormatException e) {
                
                }
            }
            sc.close();
            System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
