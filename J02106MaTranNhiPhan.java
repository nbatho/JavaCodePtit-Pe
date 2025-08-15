import java.util.Scanner;

public class J02106MaTranNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][3];

        for (int i = 0 ;i < n;i++) {
            for (int j = 0 ;j < 3;j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int ans = 0;
        for (int i = 0 ;i < n;i++) {
            int cntZero = 0;
            int cntOne = 0;
            for (int j =0 ;j < 3;j++) {
                if (a[i][j] == 1) {
                    cntOne +=1;    
                }
                else cntZero +=1;
            }
            if (cntOne > cntZero) ans +=1;
        }
        System.out.println(ans);
    }
}