
import java.util.ArrayList;
import java.util.Scanner;

public class J05018BangDiemHocSinh {
    static class SV {
        String ten;
        String msv = "";
        double diem = 0;
        String tt = "";
        SV(int stt,String ten,double diem) {
            this.msv = String.format("HS%02d", stt);
            this.ten = ten;
            this.diem = diem;
            if (this.diem >= 9) tt = "XUAT SAC";
            else if (this.diem >= 8) tt = "GIOI";
            else if (this.diem >= 7) tt = "KHA";
            else if (this.diem >= 5) tt = "TB";
            else tt = "YEU";
        }
        void op() {
            System.out.printf("%s %s %.1f %s\n",this.msv,ten,this.diem,this.tt);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <SV> ls = new ArrayList<>();
        for (int i = 0 ;i < tc;i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            double tong = 0;
            for (int j = 0 ;j < 10 ;j++) {
                if (j == 0 || j == 1) {
                    tong += sc.nextDouble()*2;
                }
                else tong += sc.nextDouble();
            }
            SV a = new SV(i+1,ten,Math.round(tong/12*10)/10.0);
            ls.add(a);
        }
        ls.sort((o1, o2) -> {
            int cmp = Double.compare(o2.diem, o1.diem);
            if (cmp == 0) return o1.msv.compareTo(o2.msv); 
            return cmp;
        });
        for (SV i:ls) {
            i.op();
        }
    }
}
