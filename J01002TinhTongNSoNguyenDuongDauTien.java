import java.util.*;
public class J01002TinhTongNSoNguyenDuongDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0 ;i < t ;i++) {
            int n = sc.nextInt();
            long ans = (long) (n)*(n+1) / 2;
            System.out.println(ans);
        }
    }
    
}
