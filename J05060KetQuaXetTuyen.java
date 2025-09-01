
import java.util.ArrayList;
import java.util.Scanner;

public class J05060KetQuaXetTuyen {
    static class PH {
        String ma,ten,ns,xh;
        double thuong,tong;
        int yyyy,tuoi;

        PH(int i,String ten,String ns,double lt,double th) {
            ma = String.format("PH%02d", i);
            this.ten =ten;
            this.ns = ns;
            String tmp[] = ns.split("/");
            yyyy = Integer.parseInt(tmp[2]);
            tuoi = 2021 - yyyy;
            if (lt >= 8 && th >= 8) thuong = 1;
            else if (lt >= 7.5 && th >= 7.5) thuong = 0.5;
            else thuong = 0;

            tong = Math.round((lt+th)/2 + thuong);
            if (tong > 10) tong = 10;
            if (tong >= 9) xh = "Xuat sac";
            else if (tong >= 8) xh = "Gioi";
            else if (tong >= 7) xh = "Kha";
            else if (tong >= 5) xh = "Trung binh";
            else xh = "Truot";
        }
        void op() {
            if (tong == (int) tong)
                System.out.printf("%s %s %d %d %s\n",ma,ten,tuoi,(int)tong,xh);
            else System.out.printf("%s %s %d %%.1f %s\n",ma,ten,tuoi,tong,xh);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <PH> ls = new ArrayList<>();
        for (int i = 0 ;i < tc;i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            String ns = sc.nextLine();
            double lt = sc.nextDouble();
            double th = sc.nextDouble();

            ls.add(new PH(i+1,ten,ns,lt,th));
        }

        for (PH i:ls) i.op();
    }
}
