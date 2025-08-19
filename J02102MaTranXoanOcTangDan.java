import java.util.*;

public class J02102MaTranXoanOcTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n *n;
        int[] a = new int[m];
        for (int i = 0 ;i < m;i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[][] c = new int[n][n];
        int idx = 0;

        int top = 0, bot = n - 1, left = 0, right = n -1;
        while (top <= bot && left <= right) {
            for (int i = left ; i<= right;i++) {
                c[top][i] = a[idx];
                idx+=1;
            }
            top +=1;
            for (int i = top ; i<=bot;i++) {
                c[i][right] = a[idx];
                idx+=1;
            }
            right -=1;
            if (top <= bot) {
                for (int i = right ; i>= left;i-=1) {
                    c[bot][i] = a[idx];
                    idx+=1;
                }
                bot -=1;
            }
            if (left <= right) {
                for (int i = bot; i>= top;i-=1) {
                    c[i][left] = a[idx];
                    idx+=1;
                }
                left +=1;
            }
        }
        
        for (int i = 0 ;i < n;i++) {
            for (int j = 0 ;j < n;j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }


    }    
}
