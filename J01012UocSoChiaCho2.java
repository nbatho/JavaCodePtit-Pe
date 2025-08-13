
import java.util.Scanner;

public class J01012UocSoChiaCho2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int j = 0 ;j < t ;j++) {
            int n = sc.nextInt();
            int cnt =0;
            for (int i = 1 ;i*i <= n;i++) {
                if (n % i == 0) {
                    if (i % 2 == 0) cnt +=1;
                    if (i != n/i && (n/i) % 2 == 0) cnt +=1;
                }         
            }
            System.out.println(cnt);
        }
    }
}