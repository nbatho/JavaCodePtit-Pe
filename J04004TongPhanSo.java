
import java.util.Scanner;

public class J04004TongPhanSo {
    public static long  gcd(long  a, long  b) {
        while (b != 0) {
            long tmp = b;
            b = a%b;
            a = tmp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long p1 = sc.nextInt(), p2 = sc.nextInt(),q1 = sc.nextInt(),q2 = sc.nextInt();

        long maup = gcd(p1,p2);
        long mauq = gcd(q1,q2);

        p1/=maup;
        p2/=maup;
        q1/=mauq;
        q2/=mauq;

        long mau = p2*q2;
        long tu = p1*q2 + p2*q1;
        long chung = gcd(tu,mau);

        System.out.println((tu/chung)+"/"+(mau/chung));
        

    }
    
}
