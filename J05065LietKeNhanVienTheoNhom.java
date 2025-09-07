import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J05065LietKeNhanVienTheoNhom {
    static class NV {
        String ten, cv;
        int hsl, shnv;
        NV(String ma, String ten) {
            this.ten = ten;
            cv = ma.substring(0,2);
            hsl = Integer.parseInt(ma.substring(2,4));
            shnv = Integer.parseInt(ma.substring(4));
        }
        void update() {
            cv = "NV";
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

        


        HashMap<String,Integer> mp = new HashMap<>();
        for (NV a : ls) {
            if (a.cv.equals("GD")) {
                if (mp.getOrDefault("GD", 0) >= 1) a.update();
                else mp.put("GD", mp.getOrDefault("GD", 0) + 1);
            } else if (a.cv.equals("TP")) {
                if (mp.getOrDefault("TP", 0) >= 3) a.update();
                else mp.put("TP", mp.getOrDefault("TP", 0) + 1);
            } else if (a.cv.equals("PP")) {
                if (mp.getOrDefault("PP", 0) >= 3) a.update();
                else mp.put("PP", mp.getOrDefault("PP", 0) + 1);
            }
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
                if (a.cv.equals(x)) a.op();
            }
            System.out.println("");
        }
    }
}
