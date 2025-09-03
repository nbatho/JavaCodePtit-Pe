import java.util.ArrayList;
import java.util.Scanner;

public class J05078BangLuongTheoPhongBan {
    static class Ban {
        String ma, ten;
        Ban(String ma, String ten) {
            this.ma = ma;
            this.ten = ten;
        }
    }

    static class NV {
        String ma, ten, tenPhong,tenPB;
        String loai;
        long nam, heso;
        long luong;

        NV(String ma, String ten, long lcb, long cong) {
            this.ma = ma;
            this.ten = ten;
            this.tenPhong = "";
            tenPB = ma.substring(3);

            loai = ma.substring(0, 1);
            nam = Long.parseLong(ma.substring(1, 3));

            if (nam >= 16) {
                if (loai.equals("A")) heso = 20;
                else if (loai.equals("B")) heso = 16;
                else if (loai.equals("C")) heso = 14;
                else if (loai.equals("D")) heso = 13;
            } else if (nam >= 9) {
                if (loai.equals("A")) heso = 14;
                else if (loai.equals("B")) heso = 13;
                else if (loai.equals("C")) heso = 12;
                else if (loai.equals("D")) heso = 11;
            } else if (nam >= 4) {
                if (loai.equals("A")) heso = 12;
                else if (loai.equals("B")) heso = 11;
                else if (loai.equals("C")) heso = 10;
                else if (loai.equals("D")) heso = 9;
            } else {
                if (loai.equals("A")) heso = 10;
                else if (loai.equals("B")) heso = 10;
                else if (loai.equals("C")) heso = 9;
                else if (loai.equals("D")) heso = 8;
            }
            luong = lcb * cong * heso*1000;
        }

        void op() {
            System.out.printf("%s %s %d\n", ma, ten, luong);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soPhongBan = sc.nextInt();
        sc.nextLine();

        ArrayList<Ban> b = new ArrayList<>();
        ArrayList<NV> ls = new ArrayList<>();

        for (int i = 0; i < soPhongBan; i++) {
            String s = sc.nextLine();
            String maPhong = s.substring(0, 2);
            String tenPhong = s.substring(3);
            b.add(new Ban(maPhong, tenPhong));
        }

        int soNV = sc.nextInt();
        for (int i = 0; i < soNV; i++) {
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long lcb = sc.nextLong();
            long cong = sc.nextLong();
            ls.add(new NV(ma, ten, lcb, cong));
        }
        sc.nextLine();
        String maPB = sc.nextLine();
        for (Ban i:b) {
            if (i.ma.equals(maPB)) {
                System.out.printf("Bang luong phong %s:\n",i.ten);
                break;
            }
        }
        for (NV a : ls) {
            for (Ban i : b) {
                if (i.ma.equals(a.ma.substring(3))) {
                    a.tenPhong = i.ten;
                    break;
                }
            }
            if (a.tenPB.equals(maPB))
                a.op();
        }
    } 
}
