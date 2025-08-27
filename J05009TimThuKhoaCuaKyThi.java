
import java.util.ArrayList;
import java.util.Scanner;

public class J05009TimThuKhoaCuaKyThi {
    static class TS {
        String ten,ns;
        double tong;
        int stt;
        TS(int stt,String ten, String ns, double tong) {
            this.stt = stt;
            this.ten = ten;
            this.ns = ns;
            this.tong = tong;
        }
        void op() {
            System.out.printf("%d %s %s %.1f\n",stt,ten,ns,tong);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        double maxScore = 0;
        ArrayList <TS> a = new ArrayList<>();
        for (int i = 1 ; i <= tc;i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            String ns = sc.nextLine();
            double m1 = sc.nextDouble();
            double m2 = sc.nextDouble();
            double m3 = sc.nextDouble();
            double tong = m1 + m2 + m3;
            maxScore = Math.max(maxScore,tong);
            a.add(new TS(i,ten,ns,tong));
        }
        ArrayList <TS> ans = new ArrayList<>();
        for (TS i: a) {
            if (maxScore == i.tong) {
                ans.add(i);
            }
        } 

        for (TS i: ans) {
            i.op();
        }
    }
}
