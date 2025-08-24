import java.util.Scanner;

public class J04008ChuViTamGiac {
    static class Point {
        double x, y;

        void get(Scanner sc) {
            x = sc.nextDouble();
            y = sc.nextDouble();
        }

        double dis(Point a, Point b) {
            return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
        }

        public boolean check(Point a, Point b, Point c) {
            double d1 = dis(a, b);
            double d2 = dis(a, c);
            double d3 = dis(b, c);

            return (d1 + d2 > d3) && (d1 + d3 > d2) && (d2 + d3 > d1);
        }

        public double cv(Point a, Point b, Point c) {
            double d1 = dis(a, b);
            double d2 = dis(a, c);
            double d3 = dis(b, c);
            return d1 + d2 + d3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            Point p = new Point(); 
            Point p1 = new Point();
            Point p2 = new Point();
            Point p3 = new Point();

            p1.get(sc);
            p2.get(sc);
            p3.get(sc);

            if (!p.check(p1, p2, p3)) {
                System.out.println("INVALID");
            } else {
                System.out.printf("%.3f\n", p.cv(p1, p2, p3));
            }
        }
    }
}
