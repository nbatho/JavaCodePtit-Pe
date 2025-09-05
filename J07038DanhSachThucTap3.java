import java.io.*;
import java.util.*;

public class J07038DanhSachThucTap3 {
    static class SV {
        String ma, ten, lop, email;

        SV(String ma, String ten, String lop, String email) {
            this.ma = ma;
            this.ten = chuanhoaTen(ten);
            this.lop = lop;
            this.email = email;
        }

        static String chuanhoaTen(String s) {
            String[] tmp = s.toLowerCase().trim().split("\\s+");
            StringBuilder ans = new StringBuilder();
            for (String word : tmp) {
                ans.append(Character.toUpperCase(word.charAt(0)))
                   .append(word.substring(1))
                   .append(" ");
            }
            return ans.toString().trim();
        }

        @Override
        public String toString() {
            return ma + " " + ten + " " + lop;
        }
    }

    static class DN {
        String maDN, tenDN;
        int maxSV;
        ArrayList<SV> ds;

        DN(String maDN, String tenDN, int maxSV) {
            this.maDN = maDN;
            this.tenDN = tenDN;
            this.maxSV = maxSV;
            this.ds = new ArrayList<>();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("DANH SACH THUC TAP TAI ").append(tenDN).append(":\n");
            for (int i = 0; i < Math.min(ds.size(), maxSV); i++) {
                sb.append(ds.get(i)).append("\n");
            }
            return sb.toString().trim();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner svScanner = new Scanner(new File("SINHVIEN.in"));
        Scanner dnScanner = new Scanner(new File("DN.in"));
        Scanner ttScanner = new Scanner(new File("THUCTAP.in"));

        int nSV = Integer.parseInt(svScanner.nextLine());
        HashMap<String, SV> mapSV = new HashMap<>();
        for (int i = 0; i < nSV; i++) {
            SV x = new SV(svScanner.nextLine(), svScanner.nextLine(),
                          svScanner.nextLine(), svScanner.nextLine());
            mapSV.put(x.ma, x);
        }
        svScanner.close();

        int nDN = Integer.parseInt(dnScanner.nextLine());
        HashMap<String, DN> mapDN = new HashMap<>();
        for (int i = 0; i < nDN; i++) {
            String maDN = dnScanner.nextLine();
            String tenDN = dnScanner.nextLine();
            int maxSV = Integer.parseInt(dnScanner.nextLine());
            mapDN.put(maDN, new DN(maDN, tenDN, maxSV));
        }
        dnScanner.close();

        int nTT = Integer.parseInt(ttScanner.nextLine());
        for (int i = 0; i < nTT; i++) {
            String svCode = ttScanner.next();
            String dnCode = ttScanner.next();
            mapDN.get(dnCode).ds.add(mapSV.get(svCode));
        }

        for (DN d : mapDN.values()) {
            d.ds.sort((a, b) -> a.ma.compareTo(b.ma));
        }

        int q = ttScanner.nextInt();
        ttScanner.nextLine();
        while (q-- > 0) {
            String maDN = ttScanner.nextLine();
            System.out.println(mapDN.get(maDN));
        }
        ttScanner.close();
    }
}
