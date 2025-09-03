import java.util.ArrayList;
import java.util.Scanner;

public class J05008DienTichDaGiac {
    static class Point {
        double x,y;
        Point(double a,double b) {
            x = a;
            y = b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        for (int t = 0 ;t < tc;t++) {
            int n = sc.nextInt();
            ArrayList<Point> ls = new ArrayList<>();
            for (int i = 0 ;i < n;i++) {
                ls.add(new Point(sc.nextInt(), sc.nextInt()));
            }
            
            double s = 0;
            for (int i = 0 ; i < n-1 ; i++) {
                s += ls.get(i).x * ls.get(i+1).y - ls.get(i+1).x * ls.get(i).y;
            }
           
            s += ls.get(n-1).x * ls.get(0).y - ls.get(0).x * ls.get(n-1).y;

            s = Math.abs(s) / 2.0;
            System.out.printf("%.3f\n", s);
        }
    }
}
