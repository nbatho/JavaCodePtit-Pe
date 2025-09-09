import java.io.File;
import java.util.Scanner;

public class J07076SapXepMaTran {
    public static void main(String[] args) {
        try {
            File f = new File("MATRIX.in");
            Scanner sc = new Scanner(f);
            int tc = sc.nextInt();
            while (tc --> 0) {

                int n = sc.nextInt(),m = sc.nextInt(), i = sc.nextInt();
    
                int[][] a = new int[n+1][m+1];
                for (int t = 1 ; t <= n;t++) {
                    for (int k = 1 ; k<=m;k++) {
                        a[t][k] = sc.nextInt();
                    }
                }
                for (int j = 1 ;j <= n;j++) {
                    for (int k = j + 1;k<=n;k++) {
                        if (a[j][i] > a[k][i]) {
                            int tmp = a[j][i];
                            a[j][i] = a[k][i];
                            a[k][i] = tmp;
                        }
                    }
                }

                for (int t = 1 ; t <= n;t++) {
                    for (int k = 1 ; k<=m;k++) {
                        System.out.print(a[t][k] + " ");
                    }
                    System.out.println("");
                }
            }
        } catch (Exception e) {
        }
    }
}