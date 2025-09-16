import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class J07074LichGiangDayTheoMon {
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
        String maNhom, maMon, tenGV, phongHoc;
        int ngayday, kip;

        public Lop(int i, String maMon, int ngayday, int kip, String tenGV, String phongHoc) {
            maNhom = String.format("HP%03d", i);
            this.maMon = maMon;
            this.ngayday = ngayday;
            this.kip = kip;  
            this.tenGV = tenGV;
            this.phongHoc = phongHoc;
        }

        @Override
        public String toString() {
            return maNhom + " " + ngayday + " " + kip + " " + tenGV + " " + phongHoc;
        }
    }

    public static void main(String[] args) throws Exception {
        File f1 = new File("MONHOC.in");
        Scanner sc = new Scanner(f1);

        int sm = sc.nextInt();
        ArrayList<MH> lsMH = new ArrayList<>();
        for (int i = 0; i < sm; i++) {
            sc.nextLine();
            lsMH.add(new MH(sc.nextLine(), sc.nextLine(), sc.nextInt()));
        }

        File f2 = new File("LICHGD.in");
        Scanner sc1 = new Scanner(f2);

        int snl = Integer.parseInt(sc1.nextLine());
        ArrayList<Lop> lshp = new ArrayList<>();
        for (int i = 0; i < snl; i++) {
            String maMon = sc1.nextLine();
            int ngayday = Integer.parseInt(sc1.nextLine());
            int kip = Integer.parseInt(sc1.nextLine());
            String tenGV = sc1.nextLine();
            String phongHoc = sc1.nextLine();
            lshp.add(new Lop(i + 1, maMon, ngayday, kip, tenGV, phongHoc));
        }
        lshp.sort((Lop a,Lop b) -> {
            if (a.ngayday == b.ngayday) {
                if ( a.kip == b.kip) {
                    return a.tenGV.compareTo(b.tenGV);
                }
                return Integer.compare(a.kip, b.kip);
            }
            return Integer.compare(a.ngayday, b.ngayday);
        });
        String s = sc1.nextLine();   
        for (MH x:lsMH) {
            if (s.equals(x.maMon)) {
                System.out.printf("LICH GIANG DAY MON %s:\n",x.tenMon);
                break;
            }
        }
        for (Lop a : lshp) {
            if (a.maMon.equals(s)) {
                System.out.println(a);
            }
        }

        sc.close();
        sc1.close();
    }
}
