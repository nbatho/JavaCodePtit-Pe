import java.util.ArrayList;
import java.util.Scanner;

public class J05066TimKiemTheoTen {
        static class NV {
        String ten, cv,ma;
        int hsl, shnv;
        NV(String ma, String ten) {
            this.ten = ten;
            this.ma = ma;
            cv = ma.substring(0,2);
            hsl = Integer.parseInt(ma.substring(2,4));
            shnv = Integer.parseInt(ma.substring(4));
            if (cv.equals("GD") && shnv > 1) cv = "NV";
            else if (cv.equals("PP") || cv.equals("TP")) {
                if (shnv > 3) cv = "NV";
            }
        }
        void op() {
            System.out.printf("%s %s %03d %02d\n", ten, cv, shnv, hsl);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();
        ArrayList<NV> ls = new ArrayList<>();
        for (int i = 0; i < tc; i++) {
            String s = sc.nextLine();
            String ma = s.substring(0, 7);
            String ten = s.substring(8);
            ls.add(new NV(ma, ten));
        }
        ls.sort((NV a, NV b) -> {
            if (a.hsl == b.hsl) {
                return Integer.compare(a.shnv, b.shnv);
            }
            return Integer.compare(b.hsl, a.hsl);
        });
        int q = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < q; i++) {
            String x = sc.nextLine();
            for (NV a : ls) {
                if (a.ten.toLowerCase().contains(x.toLowerCase())) a.op();
            }
            System.out.println("");
        }
    }
}