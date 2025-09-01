
import java.util.ArrayList;
import java.util.Scanner;

public class J05057BangDiemTuyenSinh {
    static class Diem {
        String mts,ten,tt;
        double tong;
        double ut;
        
        Diem(String mts,String ten,double d1,double d2,double d3) {
            this.mts = mts;
            this.ten =ten;
            tong = d1*2 + d2 + d3;
            String kv = mts.substring(0,3);
            if (kv.equals("KV3")) ut = 2.5;
            else if (kv.equals("KV2")) ut = 1.0;
            else ut = 0.5;

            if (tong + ut >= 24) tt = "TRUNG TUYEN";
            else tt = "TRUOT";

        }
        void op() {
            if (tong == (int) tong && ut == (int) ut) {

                System.out.printf("%s %s %d %d %s\n",mts,ten,(int) ut,(int)tong,tt);
            }
            else if (tong ==(int) tong && ut != (int) ut) {
                System.out.printf("%s %s %.1f %d %s\n",mts,ten,ut,(int)tong,tt);
            }
            else if (tong != (int) tong && ut == (int) ut) {
                System.out.printf("%s %s %d %.1f %s\n",mts,ten,(int)ut,tong,tt);
            }
            else System.out.printf("%s %s %.1f %.1f %s\n",mts,ten,ut,tong,tt);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <Diem> ls = new ArrayList<>();
        for (int i = 0 ;i < tc;i++) {
            sc.nextLine();
            String mts = sc.nextLine();
            String ten = sc.nextLine();
            double d1 = sc.nextDouble();
            double d2 = sc.nextDouble();
            double d3 = sc.nextDouble();

            ls.add(new Diem(mts,ten,d1,d2,d3));
        }
        for (Diem i:ls) i.op();
    }
    
}
