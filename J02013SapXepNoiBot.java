import java.util.*;
public class J02013SapXepNoiBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ;i < n;i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0 ;i < n;i++) {
            int swapped = 0;
            for (int j = 0 ; j < n-i-1;j++) {
                if (a[j+1] < a[j]) {
                    int tmp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tmp;
                    swapped = 1;
                }
            }
            if (swapped == 1) {
                System.out.print("Buoc " + (i+1) + ": ");
                for (int k = 0  ; k < n;k++) {
                    System.out.print(a[k] + " ");
                }
                System.out.println("");
            }
        }
    }
}
