import java.io.File;
import java.util.*;

public class J07075LichGiangDayTheoTen {

    static class MH {
        String maMon, tenMon;
        int soTC;
        MH(String maMon, String tenMon, int soTC) {
            this.maMon = maMon;
            this.tenMon = tenMon;
            this.soTC = soTC;
        }
    }

    static class Lop {
        String maNhom, maMon, tenGV, phongHoc, tenMon;
        int ngayday, kip;
        
        public Lop(int i, String maMon, int ngayday, int kip, String tenGV, String phongHoc, String tenMon) {
            maNhom = String.format("HP%03d", i);
            this.maMon = maMon;
            this.ngayday = ngayday;
            this.kip = kip;
            this.tenGV = tenGV;
            this.phongHoc = phongHoc;
            this.tenMon = tenMon;
        }

        @Override
        public String toString() {
            return maNhom + " " + tenMon + " " + ngayday + " " + kip + " " + phongHoc;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int sm = sc.nextInt();
        Map<String, String> monMap = new HashMap<>();
        for (int i = 0; i < sm; i++) {
            sc.nextLine();
            String ma = sc.nextLine().trim();
            String ten = sc.nextLine().trim();
            int soTC = sc.nextInt();
            monMap.put(ma, ten);
        }


        Scanner sc1 = new Scanner(new File("LICHGD.in"));
        int snl = Integer.parseInt(sc1.nextLine());
        ArrayList<Lop> lshp = new ArrayList<>();
        for (int i = 0; i < snl; i++) {
            String maMon = sc1.nextLine().trim();
            int ngayday = Integer.parseInt(sc1.nextLine().trim());
            int kip = Integer.parseInt(sc1.nextLine().trim());
            String tenGV = sc1.nextLine().trim();
            String phongHoc = sc1.nextLine().trim();
            lshp.add(new Lop(i + 1, maMon, ngayday, kip, tenGV, phongHoc, monMap.get(maMon)));
        }


        lshp.sort((a, b) -> {
            if (a.ngayday == b.ngayday) {
                if (a.kip == b.kip) {
                    return a.tenGV.compareTo(b.tenGV);
                }
                return Integer.compare(a.kip, b.kip);
            }
            return Integer.compare(a.ngayday, b.ngayday);
        });

        String s = sc1.nextLine();
        System.out.printf("LICH GIANG DAY GIANG VIEN %s:\n", s);
        for (Lop a : lshp) {
            if (a.tenGV.equals(s)) {
                System.out.println(a);
            }
        }

        sc.close();
        sc1.close();
    }
}
