import java.io.File;
import java.util.*;

public class J07036BangDiemTheoLop {
    static class SV {
        String msv, ten, lop, email;
        SV(String msv, String ten, String lop, String email) {
            this.msv = msv;
            this.lop = lop;
            this.email = email;
            this.ten = chuanHoa(ten);
        }
        static String chuanHoa(String s) {
            s = s.trim().toLowerCase().replaceAll("\\s+", " ");
            String[] parts = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for (String x : parts) {
                sb.append(Character.toUpperCase(x.charAt(0)))
                  .append(x.substring(1))
                  .append(" ");
            }
            return sb.toString().trim();
        }
    }

    static class MON {
        String maMon, tenMon, stc;
        MON(String maMon, String tenMon, String stc) {
            this.maMon = maMon;
            this.tenMon = tenMon;
            this.stc = stc;
        }
    }

    static class BangDiem {
        SV sv;
        MON m;
        String maMon;
        double diem;
        String diemIn;

        BangDiem(SV sv,MON m, String maMon, String diem) {
            this.sv = sv;
            this.maMon = maMon;
            this.m = m;
            this.diem = Double.parseDouble(diem);
            this.diemIn = diem;
        }

        void op() {
            System.out.printf("%s %s %s %s %s\n", sv.msv, sv.ten, maMon,m.tenMon, diemIn);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int ssv = sc.nextInt(); sc.nextLine();
        ArrayList<SV> lssv = new ArrayList<>();
        for (int i = 0; i < ssv; i++) {
            lssv.add(new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }

        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        int sm = sc1.nextInt(); sc1.nextLine();
        ArrayList<MON> lsm = new ArrayList<>();
        for (int i = 0; i < sm; i++) {
            lsm.add(new MON(sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }

        Scanner sc2 = new Scanner(new File("BANGDIEM.in"));
        int t = sc2.nextInt(); sc2.nextLine();
        ArrayList<BangDiem> lsbd = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String[] s = sc2.nextLine().split("\\s+");
            String msv = s[0], maMon = s[1], diem = s[2];
            for (SV a : lssv) {
                if (a.msv.equals(msv)) {
                    for (MON b:lsm) {
                        if (maMon.equals(b.maMon)) {
                            lsbd.add(new BangDiem(a,b ,maMon, diem));
                        }
                    }
                }
            }
        }

        int q = sc2.nextInt();
        while (q-- > 0) {
            String ml = sc2.next();

            System.out.printf("BANG DIEM lop %s:\n", ml);

            ArrayList<BangDiem> tmp = new ArrayList<>();
            for (BangDiem bd : lsbd) {
                if (bd.sv.lop.equals(ml)) {
                    tmp.add(bd);
                }
            }

            tmp.sort((a, b) -> {
                if (a.maMon.equals(b.maMon)) return a.sv.msv.compareTo(b.sv.msv);
                return a.maMon.compareTo(b.maMon);
            });

            for (BangDiem bd : tmp) bd.op();
        }
    }
}
