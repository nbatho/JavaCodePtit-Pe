import java.util.*;
public class J01011bSCuSC {

    public static long GCD(long a, long b) {
        while (b != 0) {
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
    public static long LCM(long a,long b) {
        return (a * b) / GCD(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0 ;i < t;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(LCM(a, b) + " " + GCD(a, b));
        }
    }
}
