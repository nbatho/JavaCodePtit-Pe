
import java.util.ArrayList;
import java.util.Scanner;

public class J05013TuyenDung {
    static class NV {
        String ten,ma,tt;
        double tong;
        NV(int i,String ten,double lt,double th) {
            ma = String.format("TS%02d", i);
            this.ten = ten;
            tong = (lt + th) / 2.0;
            if (tong > 9.5) tt = "XUAT SAC";
            else if (tong >= 8) tt = "DAT";
            else if (tong >= 5) tt = "CAN NHAC";
            else tt = "TRUOT";
        }
        void op() {
            System.out.printf("%s %s %.2f %s\n",ma,ten,tong,tt);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <NV> ls = new ArrayList<>();
        for (int i = 0 ;i < tc;i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            double lt = sc.nextDouble();
            double th = sc.nextDouble();
            if (lt > 10) lt /= 10.0;
            if (th > 10) th /= 10.0;
            ls.add(new NV(i+1,ten,lt,th));
        }
        ls.sort((NV a,NV b) -> {
            return Double.compare(b.tong, a.tong);
        });
        for (NV i:ls) i.op();
    }
}
