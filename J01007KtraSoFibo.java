import java.util.Scanner;

public class J01007KtraSoFibo {
    static long[] F = new long[93];
    public static void Init() {
        F[0] = 0;
        F[1] = 1;
        for (int i = 2 ;i < 93;i++) {
            F[i] = F[i-1] + F[i-2];
        }
    }
    public static void main(String[] args) {
        Init();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0 ;i < t;i++) {
            long n = sc.nextLong();
            int found = 0;
            for (int j = 0 ;j < 93;j++) {
                if (n == F[j]) {
                    found = 1;
                    break;
                }
            }
            if (found == 0) System.out.println("NO");
            else System.out.println("YES");
           
        }
    }
}
