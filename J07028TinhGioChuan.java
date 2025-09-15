import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class J07028TinhGioChuan {
        static class MON {
        String maMonHoc, tenMon;
        MON(String maMonHoc, String tenMon) {
            this.maMonHoc = maMonHoc;
            this.tenMon = tenMon;
        }
    }

    static class GV {
        String maGiangVien, tenGiangVien;
        GV(String maGiangVien, String tenGiangVien) {
            this.maGiangVien = maGiangVien;
            this.tenGiangVien = tenGiangVien;
        }
    }

    static class HP {
        String maMH, maGV;
        double gioChuan;
        HP(String maMH, String maGV, double gioChuan) {
            this.maMH = maMH;
            this.maGV = maGV;
            this.gioChuan = gioChuan;
        }
    }

    public static void main(String[] args) throws Exception {    
        File f1 = new File("MONHOC.in"); 
        Scanner sc = new Scanner(f1);

        int smh = sc.nextInt();
        LinkedHashMap<String, MON> lsMon = new LinkedHashMap<>();
        for (int i = 0; i < smh; i++) {
            String maMonHoc = sc.next();
            String tenMon = sc.nextLine().trim();
            lsMon.put(maMonHoc, new MON(maMonHoc, tenMon));
        }

        File f2 = new File("GIANGVIEN.in"); 
        Scanner sc2 = new Scanner(f2);
        int sgv = sc2.nextInt();
        sc2.nextLine();
        LinkedHashMap<String, GV> lsGV = new LinkedHashMap<>();
        for (int i = 0; i < sgv; i++) {
            String maGV = sc2.next();
            String tenGV = sc2.nextLine().trim();
            lsGV.put(maGV, new GV(maGV, tenGV));
        }

        File f3 = new File("GIOCHUAN.in"); 
        Scanner sc3 = new Scanner(f3);

        int soHP = sc3.nextInt();
        sc3.nextLine();
        ArrayList<HP> lsHP = new ArrayList<>();
        for (int i = 0; i < soHP; i++) {
            String s[] = sc3.nextLine().split("\\s+");
            String maGV = s[0];
            String maMon = s[1];
            double gioChuan = Double.parseDouble(s[2]);
            lsHP.add(new HP(maMon, maGV, gioChuan));
        }

        Map<String, Double> tongGio = new LinkedHashMap<>();
        for (HP a : lsHP) {
            tongGio.put(a.maGV, tongGio.getOrDefault(a.maGV, 0.0) + a.gioChuan);
        }

        for (String maGV : lsGV.keySet()) {
            if (tongGio.containsKey(maGV)) {
                GV gv = lsGV.get(maGV);
                System.out.printf("%s %.2f\n", gv.tenGiangVien, tongGio.get(maGV));
            }
        }
    }
}
