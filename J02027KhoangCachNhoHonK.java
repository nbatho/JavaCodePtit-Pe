import java.util.Arrays;
import java.util.Scanner;

public class J02027KhoangCachNhoHonK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        while (tc != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long cnt = 0;
            int[] a = new int[n];
            for (int i = 0 ;i < n;i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            int j = 0 ;
            for (int i = 0 ;i < n;i++) {
                while (j < n && Math.abs(a[i] - a[j]) < k) {
                    j +=1;
                }
                cnt += (j-i-1);
            }
            System.out.println(cnt);
            tc-=1;
        }
    }
}
