
import java.util.Scanner;

public class J03035DienChuSo {
    static long pow(long n,long k) {
        if(k == 0) return 1;
        if (k == 1) return n;

        long x = pow(n,k/2);
        x*=x;
        if (k % 2 == 0) return x;
        else return n*x;
    }
    static long cntHoi(String s) {
        long cnt = 0;
        for (int i = 0 ;i < s.length();i++ ) {
            if (s.charAt(i) == '?') cnt +=1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();

        for (int t = 0 ;t < tc;t++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            long cnt = cntHoi(a);
            if (a.length() < b.length()) System.out.println("0");
            else {
                long ans = 0;
                int dis = a.length() - b.length();
                if (dis > 0) {
                    String tmp ="";
                    for (int i = 0 ;i < dis;i++) {
                        tmp += "0";
                    }
                    b = tmp + b;
                }
                
                for (int i = 0 ;i < a.length();i++) {
                    if (a.charAt(i) != '?') {
                        if (a.charAt(i) > b.charAt(i)) {
                            ans += pow(10,cnt);
                            break;
                        }
                        else if (a.charAt(i) < b.charAt(i)) {
                            ans += 0;
                            break;
                        }
                    }
                    else {
                        ans += (9 - (b.charAt(i) - '0'))*pow(10,cnt-1);
                        cnt -=1;
                    }
                }
                System.out.println(ans);
            }
            
            
        }
    }
}
