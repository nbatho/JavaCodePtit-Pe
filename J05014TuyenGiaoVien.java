
import java.util.ArrayList;
import java.util.Scanner;

public class J05014TuyenGiaoVien {
    static class GV {
        String ten,mon,stt,tt;
        double diemut,tong;

        GV(int i,String ten,String ma,double th,double cm) {
            stt = String.format("GV%02d", i);
            this.ten = ten;
            char m = ma.charAt(0);
            char ut = ma.charAt(1);
            if (m == 'A') mon = "TOAN";
            else if (m == 'B') mon = "LY";
            else if (m == 'C') mon = "HOA";

            if (ut == '1') diemut = 2.0;
            else if (ut == '2') diemut = 1.5;
            else if (ut == '3') diemut = 1.0;
            else if (ut == '4') diemut = 0.0;

            tong = th*2.0 + cm + diemut;

            if (tong >= 18) tt = "TRUNG TUYEN";
            else tt = "LOAI";
        }
        void op() {
            System.out.printf("%s %s %s %.1f %s\n",stt,ten,mon,tong,tt);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <GV> ls = new ArrayList<>();

        for (int i = 0 ;i < tc;i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            String ma = sc.nextLine();
            double th = sc.nextDouble();
            double cm = sc.nextDouble();

            ls.add(new GV(i+1,ten,ma,th,cm));
        }
        ls.sort((GV a, GV b) -> {
            return Double.compare(b.tong, a.tong);
        });
        for (GV i:ls) i.op();
    }
}
