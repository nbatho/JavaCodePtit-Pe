import java.util.*;

public class J05036TinhGiaBan1 {
    static class MH {
        String ten, dv, ma;
        double phivanchuyen, thanhtien, ban;

        MH(int stt, String ten, String dv, int nhap, int soluong) {
            this.ma = String.format("MH%02d", stt);
            this.ten = ten;
            this.dv = dv;
            double nhapTien = 1.0 * nhap * soluong;
            this.phivanchuyen = nhapTien * 0.05;
            this.thanhtien = nhapTien + phivanchuyen;
            this.ban = thanhtien * 1.02;
        }

        void op() {
            System.out.printf("%s %s %s %d %d %d\n",
                    ma, ten, dv,
                    Math.round(phivanchuyen),
                    Math.round(thanhtien),
                    Math.round(ban));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        ArrayList<MH> ls = new ArrayList<>();
        for (int i = 0; i < tc; i++) {
            sc.nextLine();
            ls.add(new MH(i + 1, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        for (MH i : ls) i.op();
    }
}
