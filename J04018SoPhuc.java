
import java.util.Scanner;

public class J04018SoPhuc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        for (int i = 0 ;i < tc;i++) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();

            int x1 = a + c;
            int x2 = b + d;
            
            int c1 = x1*a - x2*b;
            int c2 = a*x2 + b*x1;

            int d1 = x1*x1 - x2*x2;
            int d2 = 2*x1*x2;

            System.out.print(c1);
            if (c2 > 0) {
                System.out.printf(" + %di, ",c2);
            }
            else {
                System.out.printf(" - %di, ",-c2);
            }
            System.out.print(d1);
            if (d2 > 0) {
                System.out.printf(" + %di\n",d2);
            }
            else {
                System.out.printf(" - %di\n",-d2);
            }
        }
    }
}
