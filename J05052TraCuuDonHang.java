
import java.util.ArrayList;
import java.util.Scanner;

public class J05052TraCuuDonHang {
    static class MH {
        String ten,ma;
        String stt,loai;
        long giamgia,tien;
        MH(String ten,String ma, long gia,Long sl) {
            this.ten = ten;
            this.ma = ma;
            stt = ma.substring(1,4);
            loai = ma.substring(4);

            if (loai.equals("1")) giamgia = 50*gia*sl/100;
            else if (loai.equals("2")) giamgia = 30*gia*sl/100;

            tien = gia*sl - giamgia;
        }
        void op() {
            System.out.printf("%s %s %s %d %d\n",ten,ma,stt,giamgia,tien);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <MH> ls = new ArrayList<>();
        for (int i = 0 ;i < tc;i++) {
            sc.nextLine();
            String ten =sc.nextLine();
            String ma = sc.nextLine();
            long gia = sc.nextLong();
            long sl = sc.nextLong();

            ls.add(new MH(ten,ma,gia,sl));
        }

        for (MH i:ls) i.op();
    }
}
