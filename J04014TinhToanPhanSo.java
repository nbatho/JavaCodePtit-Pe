
import java.util.Scanner;

public class J04014TinhToanPhanSo {
    static long gcd(long a,long b) {
        while( b != 0) {
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
    static class Point {
        long x,y;

        void get(Scanner sc) {
            x = sc.nextLong();
            y = sc.nextLong();
        }
        Point rutgon(Point a) {

            long chung = gcd(a.x,a.y);

            a.x /= chung;
            a.y /=chung;

            return a;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc --> 0) {
            Point a = new Point();
            Point b = new Point();
            Point c = new Point();
            Point d = new Point();
            a.get(sc);
            b.get(sc);

            c.x = ((a.x * b.y) + (b.x * a.y))*((a.x * b.y) + (b.x * a.y));
            c.y = (a.y * b.y)*(a.y * b.y);

            c.rutgon(c);

            d.x = (a.x*b.x*c.x);
            d.y = (a.y*b.y*c.y);

            d.rutgon(d);
            System.out.print(c.x + "/" + c.y + " " + d.x + "/" + d.y);

            System.out.println("");
        }
    }
}
