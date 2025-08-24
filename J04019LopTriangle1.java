import java.util.Scanner;

public class J04019LopTriangle1 {
    static class Triangle {
        Point a ,b,c;

        Triangle(Point a, Point b, Point c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        double dis(Point a, Point b) {
            return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
        }
        public boolean valid() {
            double d1 = dis(a, b);
            double d2 = dis(a, c);
            double d3 = dis(b, c);

            return (d1 + d2 > d3) && (d1 + d3 > d2) && (d2 + d3 > d1);
        }
        public String getPerimeter() {
            double d1 = dis(a, b);
            double d2 = dis(a, c);
            double d3 = dis(b, c);
            double s = d1+d2+d3;
            return String.format("%.3f", s);
        }
        
    }
    static class Point {
        double x, y;

        static Point nextPoint(Scanner sc) {
            Point p = new Point();
            p.x = sc.nextDouble();
            p.y = sc.nextDouble();
            return p;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            Triangle a = new Triangle(Point.nextPoint(sc), Point.nextPoint(sc), Point.nextPoint(sc));
            if(!a.valid()){
                System.out.println("INVALID");
            } else{
                System.out.println(a.getPerimeter());
            }
        }
    }
}
