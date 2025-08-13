
import java.util.Scanner;

public class J01004SoNguyenTo {

    public static boolean isPrime(int n) {
        for (int i = 2;i*i <= n;i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        for (int i = 0 ;i < t ;i++) {
            int n = sc.nextInt();
            
            if (isPrime(n)) System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
