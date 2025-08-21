
import java.util.Scanner;

public class J03040BienSoDep {
    public static boolean checkTang(int[] a,int idx) {
        for (int i = 0 ;i < idx - 1;i++) {
            if (a[i] >= a[i+1]) {
                return false;
            }
        }   
        return true;
    }
    public static boolean dep(int[] a ,int idx) {
        for (int i = 0; i < idx;i++) {
            if (a[i] != 6 && a[i] != 8) return false;
        }
        return true;
    }
    public static boolean checkbang1(int[] a , int idx) {
        int first = a[0];
        for (int i = 1 ;i < idx;i++) {
            if (a[i] != first) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkbang2(int[] a , int idx) {
        return ((a[0] == a[1] && a[1] == a[2])
            && (a[4] == a[3])
        );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc != 0) {

            String s = sc.next();
            int idx = 0;
            int[] a = new int[5];
            for (int i = 5 ;i < s.length();i++) {
                char c = s.charAt(i);
                if (c >= '0' && c <= '9') {
                    a[idx++] = (c - '0');
                }
            }
            if (checkTang(a,idx) || dep(a,idx) || checkbang1(a,idx) || checkbang2(a, idx)) {
                System.out.println("YES");
            }
            else System.out.println("NO");
            tc -=1;
        }
    }
}
