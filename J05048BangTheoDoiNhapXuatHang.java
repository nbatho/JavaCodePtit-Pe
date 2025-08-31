
import java.util.ArrayList;
import java.util.Scanner;

public class J05048BangTheoDoiNhapXuatHang {
    static class Hang {
        String ma;
        long nhap,xuat,gia,tien,thue;
        Hang(String ma, long nhap) {
            this.ma = ma;
            this.nhap = nhap;
            char d = ma.charAt(0),c = ma.charAt(ma.length() - 1);
            if (d == 'A') xuat = Math.round(nhap * 60.0 / 100);
            else if (d == 'B') xuat = Math.round(nhap * 70.0 / 100);
            
            if (c == 'Y') gia = 110000;
            else if (c == 'N') gia = 135000;

            tien = xuat*gia;

            if (d == 'A' && c == 'Y') thue = 8*tien/100;
            else if (d == 'A' && c == 'N') thue = 11*tien/100;
            else if (d == 'B' && c == 'Y') thue = 17*tien/100;
            else if (d == 'B' && c == 'N') thue = 22*tien/100;
        }
        void op() {
            System.out.printf("%s %d %d %d %d %d\n",ma,nhap,xuat,gia,tien,thue);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <Hang> ls = new ArrayList<>();

        for (int i = 0 ;i < tc;i++) {
            sc.nextLine();
            String ma = sc.nextLine();
            long nhap = sc.nextLong();

            ls.add(new Hang(ma,nhap));
        }

        for (Hang i:ls) {
            i.op();
        }
    }
}
