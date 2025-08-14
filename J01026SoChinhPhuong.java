
import java.util.Scanner;

public class J01026SoChinhPhuong {
    static int[] a = new int[31623];
    public static void Init() {
        for (int i = 1 ;i <=31622;i++) {
            a[i] = i*i;
        }
    }
    public static void main(String[] args) {
        Init();
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        for (int t = 0 ; t < tc;t++) {
            int n = sc.nextInt();
            int found = 0;
            for (int i = 1 ; i < 31623;i++) {
                if (n == a[i]) {
                    found = 1;
                    break;
                }
            }
            if (found == 0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
