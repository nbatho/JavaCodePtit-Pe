import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02026DayConCoKPhanTuTangDan {
    static int[] c = new int[25]; 
    static int[] a = new int[25]; 
    static List<String> ans = new ArrayList<>();

    public static void Try(int i,int n,int k) {
        for (int j = c[i-1] + 1 ; j <= n - k + i ; j++) {
            c[i] = j;
            if (i == k) {
                int valid = 1;
                if (valid == 1) {

                    for (int t = 1 ; t <= k; t++) {
                        System.out.print(a[c[t]] + " ");
                    }
                    System.out.println("");
                }
            } else {
                Try(i+1,n,k);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            ans.clear();
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 1 ;i <= n;i++) {
                for (int j = i + 1;j <=n;j++) {
                    if (a[i] > a[j]) {
                        int tmp = a[i];
                        a[i] = a[j];
                        a[j] = tmp;
                    }
                }   
            }
            Try(1,n,k);
        }
    }
}
