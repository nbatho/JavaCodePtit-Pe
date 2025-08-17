import java.util.*;
public class J02103TichMaTranVoiChuyenViCuaNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        int tc = sc.nextInt();
        for (int t = 0  ; t < tc ;t++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[][] a = new int[n][m];
            int[][] c = new int[m][n];
            for (int i = 0 ;i < n;i++) {
                for (int j = 0 ;j < m;j++) {
                    a[i][j] =sc.nextInt();
                }
            }

            for (int i = 0 ; i < n;i++) {
                for (int j = 0 ;j < m;j++) {
                    c[j][i] = a[i][j];
                }
            }
            System.out.println("Test " + (t+1) + ":");
            for (int i = 0 ;i < n;i++) {
                for (int j = 0 ;j < n;j++) {
                    int tmp = 0;
                    for (int k = 0 ; k < m;k++) {
                        tmp += a[i][k] * c[k][j];
                    }
                    System.out.print(tmp + " ");
                }
                System.out.println("");
            }

        }
    }
}
