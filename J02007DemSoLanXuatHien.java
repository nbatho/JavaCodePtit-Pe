
import java.util.Scanner;

public class J02007DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        for (int t = 0 ; t < tc;t++) {
            int n = sc.nextInt();

            int[] d = new int[100004];
            int[] a = new int[n];

            int maxval = 0;
            for (int i = 0 ;i < n;i++) {
                a[i] = sc.nextInt();
                d[a[i]] +=1;
                if (maxval < a[i]) {
                    maxval = a[i];
                }
            }
            int[] vs = new int[maxval+1];
            System.out.println("Test " + (t+1) + ":");
            for (int j = 0 ;j < n ;j++) {
                if (vs[a[j]] == 0) {

                    System.out.print(a[j] + " xuat hien ");
                    System.out.println(d[a[j]] + " lan");
                    vs[a[j]] = 1;
                }
            }
        }
    }
}
