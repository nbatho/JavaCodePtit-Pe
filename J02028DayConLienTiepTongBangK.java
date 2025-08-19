
import java.util.Scanner;

public class J02028DayConLienTiepTongBangK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc != 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            int[] a = new int[n];
            long sum = 0;
            for (int i = 0 ;i < n;i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
            if (k == 0 && sum > 0) {
                System.out.println("NO");
            }
            else {

                if (sum < k) {
                    System.out.println("NO");
                }
                else {
                    int valid = 0;
                    int l = 0;
                    long x = a[0];
                    for (int r = 1 ; r < n;r++) {
                        x += a[r];
                        while (x > k && l <= r) {
                            x -=a[l++];
                        }
                        if (x == k) {
                            valid = 1;
                            break;
                        }
                    }
    
                    if (valid == 1) System.out.println("YES");
                    else System.out.println("NO");
                }
                
            }
            tc-=1;
        }
    }
}
