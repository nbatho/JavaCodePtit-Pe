
import java.io.File;
import java.util.Scanner;

public class J07078TimViTriXauCon {
    public static void main(String[] args) throws Exception {
        File f = new File("STRING.in");

        Scanner sc = new Scanner(f);
        int tc = sc.nextInt();
        while (tc --> 0) {
            String a = sc.next();
            String b = sc.next();
            for (int i = 0 ;i < a.length() - b.length();i++) {
                String x = a.substring(i,i+b.length());
                if (x.equals(b)) {
                    System.out.print(i+1 + " ");
                }
            }
            String x = a.substring(a.length() - b.length());
            if (x.equals(b)) {
                System.out.print(a.length() - b.length() + 1 + " ");
            }
            
            System.out.println("");
        }
    }
}
