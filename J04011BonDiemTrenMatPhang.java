import java.util.Scanner;

public class J04011BonDiemTrenMatPhang {
    static class Point3D {
        long x, y, z;

        Point3D(int a, int b, int c) {
            x = (long)a;
            y = (long)b;
            z = (long)c;
        }

        static boolean check(Point3D A, Point3D B, Point3D C, Point3D D) {
            return ((B.y - A.y) * (C.z - A.z) - (B.z - A.z) * (C.y - A.y)) * (D.x - A.x) + 
                    ((B.z - A.z) * (C.x - A.x) - (B.x - A.x) * (C.z - A.z)) * (D.y - A.y) + 
                    ((B.x - A.x) * (C.y - A.y) - (B.y - A.y) * (C.x - A.x)) * (D.z - A.z) == 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        while (tc-- > 0) {
            Point3D p1 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(), sc.nextInt(), sc.nextInt());

            if (Point3D.check(p1, p2, p3, p4)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
