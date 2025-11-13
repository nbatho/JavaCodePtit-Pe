import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class J07060SapXepLichThi {
    public static class Mon {
        String maMon,tenMon,hinhThucThi;

        public Mon(String maMon, String tenMon, String hinhThucThi) {
            this.maMon = maMon;
            this.tenMon = tenMon;
            this.hinhThucThi = hinhThucThi;
        }

        
    }
    public static class CaThi {
        String maCaThi,ngayThi,gioThi,phongThi;

        public CaThi(int i, String ngayThi, String gioThi, String phongThi) {
            this.maCaThi = String.format("C%03d", i);
            this.ngayThi = ngayThi;
            this.gioThi = gioThi;
            this.phongThi = phongThi;
        }

        @Override
        public String toString() {
            return ngayThi + " " + gioThi + " " + phongThi;
        };
        
    }
    public static class Lich {
        String maCaThi,maMon,maNhom, tenMon;
        int ssv ;
        CaThi ct;
        public Lich(String maCaThi,String maMon,String maNhom, int ssv) {
            this.maCaThi = maCaThi;
            this.maMon = maMon;
            this.maNhom = maNhom;
            this.ssv = ssv;
        }
        public void updateCaThi(CaThi x) {
            ct = x;
        }
        public void updateMon(String x) {
            this.tenMon = x;
        }
        public void in() {
            System.out.print(ct);
            System.out.printf(" %s %s %d\n",tenMon,maNhom,ssv);
        }
    }
    public static void main(String[] args) throws Exception {
        File f1 = new File("MONTHI.in");
        Scanner sc1 = new Scanner(f1);
        ArrayList <Mon> lsMon = new ArrayList<>();
        File f2 = new File("CATHI.in");
        Scanner sc2 = new Scanner(f2);
        ArrayList <CaThi> lsCaThi = new ArrayList<>();
        File f3 = new File("LICHTHI.in");
        Scanner sc3 = new Scanner(f3);
        ArrayList <Lich> lsLich = new ArrayList<>();
        int smh = Integer.parseInt(sc1.nextLine());

        for (int i = 0 ;i < smh;i++) {
            String maMon = sc1.nextLine();
            String tenMon = sc1.nextLine();
            String hinhThucThi = sc1.nextLine();
            lsMon.add(new Mon(maMon, tenMon, hinhThucThi));
        }

        int sct = Integer.parseInt(sc2.nextLine());

        for (int i = 0 ;i < sct;i++) {
            String Ngay = sc2.nextLine();
            String Gio = sc2.nextLine();
            String idPhongThi = sc2.nextLine();

            lsCaThi.add(new CaThi(i+1, Ngay, Gio, idPhongThi));
        }

        int soLuong = Integer.parseInt(sc3.nextLine());
        for (int i = 0 ;i <soLuong;i++) {
            String[] tmp = sc3.nextLine().split("\\s+");
            String maCaThi = tmp[0];
            String maMon = tmp[1];
            String maNhom = tmp[2];
            int ssv = Integer.parseInt(tmp[3]);

            lsLich.add(new Lich(maCaThi, maMon, maNhom, ssv));
        }

        for (Lich x : lsLich) {
            for (CaThi c : lsCaThi) {

                if (x.maCaThi.equals(c.maCaThi)) {
                    x.updateCaThi(c);
                }
            }
            for (Mon m : lsMon) {
                if (x.maMon.equals(m.maMon)) {
                    x.updateMon(m.tenMon);
                }
            }
        }

        lsLich.sort((Lich a, Lich b) -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate d1 = LocalDate.parse(a.ct.ngayThi,formatter);
            LocalDate d2 = LocalDate.parse(b.ct.ngayThi,formatter);

            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm");
            LocalTime t1 = LocalTime.parse(a.ct.gioThi,formatter1);
            LocalTime t2 = LocalTime.parse(b.ct.gioThi,formatter1);
            if (d1.equals(d2)) {
                if (t1.equals(t2)) {

                    return a.maCaThi.compareTo(b.maCaThi);
                }
                return t1.compareTo(t2);
            }
            return d1.compareTo(d2);
        });

        for (Lich x:lsLich) {
            x.in();
        }
    }
}
