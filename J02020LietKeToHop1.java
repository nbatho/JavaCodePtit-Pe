import java.util.Scanner;

public class J02020LietKeToHop1 {
    static int[] c = new int[20]; 
    static int cnt = 0;
    public static void Try(int i,int n,int k) {
        for (int j = c[i-1] + 1 ; j <= n - k + i ;j++) {
            c[i] = j;
            if (i == k) {
                cnt +=1;
                for (int t = 1 ; t <= k;t++) {
                    System.out.print(c[t] + " ");
                }
                System.out.println();
            }
            else Try(i+1,n,k);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        Try(1,n,k);
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
