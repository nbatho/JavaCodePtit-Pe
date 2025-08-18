import java.util.*;

public class J02016BoBaPytago {
    public static int Bin(Long[] a,int l,int r,Long x) {
        while (l <= r) {
            int m = (l + r) / 2;
            if (a[m].equals(x)) {
                return m;
            }
            else if (x > a[m]) {
                l = m + 1;
            }
            else r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            Long[] a = new Long[n];
            for (int i = 0 ; i < n; i++) {
                Long x = sc.nextLong();
                a[i] = x * x;
            }

            Arrays.sort(a); 

            boolean valid = false;
            for (int c = n - 1; c >= 2; c--) {
                int l = 0, r = c - 1;
                while (l < r) {
                    long sum = a[l] + a[r];
                    if (sum == a[c]) {
                        valid = true;
                        break;
                    }
                    if (sum < a[c]) l++;
                    else r--;
                }
                if (valid) break;
            }


            System.out.println(valid ? "YES" : "NO");
        }
    }
}
