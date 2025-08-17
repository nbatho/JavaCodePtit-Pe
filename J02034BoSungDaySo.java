import java.util.Scanner;

public class J02034BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maxv = 0;
        int[] a = new int[n];
        int[] d = new int[205];
        int valid = 1;
        for (int i = 0 ;i < n;i++) {
            a[i] = sc.nextInt();
            if (maxv < a[i]) maxv = a[i]; 
            d[a[i]] +=1;
        }
        for (int i = 1 ; i <= maxv;i++) {
            if (d[i] == 0) {
                valid = 0;
                System.out.println(i);
            }
        }
        if (valid == 1) System.out.println("Excellent!");
    }
}
