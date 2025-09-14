import java.util.*;

public class J06001TinhToanHoaDonBanQuanAo {
    static class SP {
        String ma, tenSP;
        long gl1, gl2;

        SP(String ma, String tenSP, long gl1, long gl2) {
            this.ma = ma;
            this.tenSP = tenSP;
            this.gl1 = gl1;
            this.gl2 = gl2;
        }
    }

    static class HD {
        String maHD, tenSP;
        long gg, tra;

        HD(String maHD, SP sp, long slm, int loai, int stt) {
            this.maHD = maHD + "-" + String.format("%03d", stt);
            long tt = (loai == 1 ? slm * sp.gl1 : slm * sp.gl2);
            long giam = 0;
            if (slm >= 150) giam = tt * 50 / 100;
            else if (slm >= 100) giam = tt * 30 / 100;
            else if (slm >= 50) giam = tt * 15 / 100;
            this.gg = giam;
            this.tra = tt - giam;
            this.tenSP = sp.tenSP;
        }

        void op() {
            System.out.printf("%s %s %d %d\n", maHD, tenSP, gg, tra);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();
        Map<String, SP> map = new HashMap<>();
        for (int i = 0; i < tc; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long g1 = sc.nextLong(), g2 = sc.nextLong();
            sc.nextLine();
            map.put(ma, new SP(ma, ten, g1, g2));
        }

        int slhd = sc.nextInt();
        sc.nextLine();
        int stt = 1;
        for (int i = 0; i < slhd; i++) {
            String[] tmp = sc.nextLine().split(" ");
            String fullMa = tmp[0];
            String maSP = fullMa.substring(0, 2);
            int loai = fullMa.charAt(2) - '0';
            long slm = Long.parseLong(tmp[1]);

            SP sp = map.get(maSP);
            if (sp != null) {
                HD hd = new HD(fullMa, sp, slm, loai, stt++);
                hd.op();
            }
        }
    }
}
