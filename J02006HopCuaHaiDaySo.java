import java.util.*;
public class J02006HopCuaHaiDaySo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        int m = sc.nextInt();
    
        int[] a = new int[n+m];
    
        for (int i = 0; i < n + m; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        System.out.print(a[0] + " ");

        for (int i = 1 ;i < a.length;i++) {
            if (a[i] != a[i-1]) {
                System.out.print(a[i] + " ");
            }
        }
    }

}
