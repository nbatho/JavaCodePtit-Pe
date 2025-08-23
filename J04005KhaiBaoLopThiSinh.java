
import java.util.Scanner;

public class J04005KhaiBaoLopThiSinh {
    static class TS {
        String ten, ns;
        double m1,m2,m3;

        public void get(Scanner sc) {
            ten = sc.nextLine();
            ns = sc.nextLine();
            m1 = sc.nextDouble();
            m2 = sc.nextDouble();
            m3 = sc.nextDouble();
        }
        public void op() {
            System.out.printf("%s %s %.1f",ten,ns,(m1+m2+m3));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TS hs = new TS();
        hs.get(sc);
        hs.op();
    }
    
}
