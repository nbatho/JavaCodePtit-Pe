import java.util.ArrayList;
import java.util.Scanner;

public class J05041SapXepBangTinhCong {
        static class Luong {
        String ten,ma;
        long luongThang,thuong,phuCap,thucLinh;

        Luong(int stt,String ten,long luongNgay,long soNgayCong,String Chucvu) {
            ma = String.format("NV%02d", stt);
            this.ten = ten;
            luongThang = luongNgay*soNgayCong;
            if (soNgayCong >= 25) thuong = (20*luongThang)/100;
            else if (soNgayCong >= 22) thuong = (10*luongThang)/100;
            else thuong = 0;

            String cv = Chucvu.toUpperCase();
            if (cv.equals("GD")) phuCap = 250000;
            else if (cv.equals("PGD")) phuCap = 200000;
            else if (cv.equals("TP")) phuCap = 180000;
            else if (cv.equals("NV")) phuCap = 150000;
            
            thucLinh = luongThang + thuong + phuCap;
        }
        void op() {
            System.out.printf("%s %s %d %d %d %d\n",ma,this.ten,luongThang,thuong,phuCap,thucLinh);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <Luong> ls = new ArrayList<>();
        for (int i = 0 ;i <tc;i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            Long ln = sc.nextLong();
            Long snc = sc.nextLong();
            String cv = sc.next();
            ls.add(new Luong(i+1,ten,ln,snc,cv));
        }
        for (int i = 0 ;i <tc-1;i++) {
            for (int j = i+1 ;j < tc;j++) {
                if (ls.get(i).thucLinh < ls.get(j).thucLinh) {
                    Luong tmp = ls.get(i);
                    ls.set(i,ls.get(j));
                    ls.set(j,tmp);
                }
            }
        }
        for (Luong i:ls) {
            i.op();
        }
    }
}
