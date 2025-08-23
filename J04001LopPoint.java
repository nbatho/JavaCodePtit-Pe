
import java.util.Scanner;

public class J04001LopPoint {
    static  class Point {
        double x;
        double y;
        public void getPoint(Scanner sc) {
            x = sc.nextDouble();
            y = sc.nextDouble();
        }
    }
    static double dis(Point a, Point b) {
        return Math.sqrt((a.x - b.x) * (a.x - b.x) + ((a.y - b.y) * (a.y - b.y)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc != 0) {
            Point a = new Point();
            Point b = new Point();
            a.getPoint(sc);
            b.getPoint(sc);
            System.out.printf("%.4f\n",dis(a,b));
            tc-=1;
        }
    }
}
