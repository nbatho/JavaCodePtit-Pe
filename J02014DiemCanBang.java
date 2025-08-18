
import java.util.Scanner;

public class J02014DiemCanBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int t = 0 ; t < tc ;t++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int ans = -1;
            int[] left = new int[n];
            int[] right = new int[n];
            for (int i = 0 ;i < n;i++) 
            {

                a[i] = sc.nextInt();
                left[i] =a[i];
                right[i] =a[i];
            }


            left[0] = a[0];
            for (int i = 1 ;i < n;i++) {
                left[i] += left[i-1];
            }
            right[n-1] = a[n-1];
            for (int i = n - 2;i >= 0;i--) {
                right[i] += right[i+1];
            }
            for (int i = 1 ;i < n - 1;i++) {
                if (left[i-1] == right[i+1]) {
                    ans = i+1;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
