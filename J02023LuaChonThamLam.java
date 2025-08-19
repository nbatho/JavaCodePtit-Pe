import java.util.*;

public class J02023LuaChonThamLam {
    static String buildMax(int n, int s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int digit = Math.min(9, s);
            sb.append(digit);
            s -= digit;
        }
        return sb.toString();
    }

    static String buildMin(int n, int s) {
        int[] digits = new int[n];
        s--;                  
        digits[0] = 1;
        for (int i = n - 1; i >= 0; i--) {
            int add = Math.min(9 - digits[i], s);
            digits[i] += add;
            s -= add;
        }
        StringBuilder sb = new StringBuilder();
        for (int d : digits) sb.append(d);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        if (s == 0 && n > 1 || s > 9 * n) {
            System.out.println("-1 -1");
            return;
        }

        String minNum = buildMin(n, s);
        String maxNum = buildMax(n, s);

        System.out.println(minNum + " " + maxNum);
    }
}
