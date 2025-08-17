
import java.util.Scanner;

public class J02011SapXepChon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ;i <n;i++) a[i] = sc.nextInt();

        for (int i = 0 ;i < n - 1;i++) {
            int minv = i;
            for (int j = i+1 ;j < n;j++) {
               if (a[minv] > a[j]) {
                minv = j;
               }
            }
            int tmp = a[minv];
            a[minv] = a[i];
            a[i] = tmp;
            System.out.print("Buoc " + (i+1) + ": ");
            for (int j = 0 ;j < n;j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println("");
        }
    }
}
