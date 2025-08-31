import java.util.*;

public class J05043TinhThuNhapChoNhanVien {
    static class Luong {
        String ten, cv, ma;
        long pc, lc, ung, conlai;

        Luong(int stt, String ten, String cv, long lcb, long snc) {
            ma = String.format("NV%02d", stt);
            this.ten = ten;
            this.cv = cv;

            if (cv.equals("GD")) pc = 500;
            else if (cv.equals("PGD")) pc = 400;
            else if (cv.equals("TP")) pc = 300;
            else if (cv.equals("KT")) pc = 250;
            else pc = 100;


            lc = lcb * snc;

            long tong = lc + pc;
            long tmp = Math.round((tong * 2.0 / 3) / 1000) * 1000;
            ung = Math.min(25000, tmp);

            conlai = lc + pc - ung;
        }

        void op() {
            System.out.printf("%s %s %d %d %d %d\n", ma, ten, pc, lc, ung, conlai);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Luong> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String ten = sc.nextLine();
            String cv = sc.nextLine();
            long lcb = Long.parseLong(sc.nextLine());
            long snc = Long.parseLong(sc.nextLine());
            ds.add(new Luong(i + 1, ten, cv, lcb, snc));
        }

        for (Luong nv : ds) nv.op();
    }
}
