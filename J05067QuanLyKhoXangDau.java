
import java.util.ArrayList;
import java.util.Scanner;

public class J05067QuanLyKhoXangDau {
    static class Xang {
        String ma;
        long gia,thue,tien;
        String loai;
        Xang(String ma, long sl) {
            this.ma = ma;
            String l = ma.substring(3);

            if (l.equals("BP")) loai = "British Petro";
            else if (l.equals("ES")) loai = "Esso";
            else if (l.equals("SH")) loai = "Shell";
            else if (l.equals("CA")) loai = "Castrol";
            else if (l.equals("MO")) loai = "Mobil";
            else if (l.equals("TN")) loai = "Trong Nuoc";
            
           if (ma.startsWith("X")) {
                gia = 128000;
                if (loai.equals("Trong Nuoc")) {
                    thue = 0;
                } else {
                    thue = (3 * gia * sl) / 100;
                }
            }
            else if (ma.startsWith("D")) {
                gia = 11200;
                if (loai.equals("Trong Nuoc")) {
                    thue = 0;
                } else {
                    thue = (7 * gia * sl) / 200;
                }
            }
            else if (ma.startsWith("N")) {
                gia = 9700;
                if (loai.equals("Trong Nuoc")) {
                    thue = 0;
                } else {
                    thue = (2 * gia * sl) / 100;
                }
            }
            
            tien = gia*sl + thue;
        }
        void op() {
            System.out.printf("%s %s %d %d %d\n",ma,loai,gia,thue,tien);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <Xang> ls = new ArrayList<>();
        for (int i = 0 ;i < tc;i++) {
            String ma = sc.next();
            long sl = sc.nextLong();

            ls.add(new Xang(ma,sl));
        }

        for (Xang i:ls) {
            i.op();
        }
    }
}
