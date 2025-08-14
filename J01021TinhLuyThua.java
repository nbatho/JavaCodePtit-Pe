
import java.util.Scanner;

public class J01021TinhLuyThua {
    static long mod = 1000000007;
    public static long Power(long a,long b) {
        if (b == 0) return 1;
        if (b == 1) return a%mod;
        long x = Power(a,b/2);
        x = x*x%mod;

        if (b % 2 == 0) return x; 
        else return (x*a)%mod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            long b =sc.nextLong();

            if (a == 0 && b == 0) break;
            long ans = Power(a,b);
            System.out.println(ans);
        }
    }   
}
