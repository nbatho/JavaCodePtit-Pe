import java.util.ArrayList;
import java.util.Scanner;

public class J05037TinhGiaBan2 {
    static class MH {
        String ten, dv, ma;
        Long phivanchuyen, thanhtien, ban;

        MH(int stt, String ten, String dv, long nhap, long soluong) {
            this.ma = String.format("MH%02d", stt);
            this.ten = ten;
            this.dv = dv;
            this.phivanchuyen = Math.round((double)nhap * soluong*0.05);
            this.thanhtien = nhap * soluong + phivanchuyen;
            this.ban = Math.round((double)thanhtien*1.02/soluong); 
            if (this.ban % 100 != 0) this.ban = this.ban - this.ban%100 + 100;

            }

        void op() {
            System.out.printf("%s %s %s %d %d %d\n",
                    ma, ten, dv,
                    phivanchuyen,
                    thanhtien,
                    ban);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        ArrayList<MH> ls = new ArrayList<>();
        for (int i = 0; i < tc; i++) {
            sc.nextLine();
            ls.add(new MH(i + 1, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
        ls.sort((MH a, MH b) -> {
            return b.ban.compareTo(a.ban);
        });
        for (MH i : ls) i.op();
    }
}
