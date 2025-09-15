
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class J06005QuanLyBanHang1 {
    static class KH {
        String maKhachHang,tenKH,gt,ns,dc;
        KH(String maKH,String tenKH,String gt,String ns,String dc) {
            maKhachHang = maKH;
            this.tenKH = tenKH;
            this.gt = gt;
            this.ns = ns;
            this.dc = dc;
        }

        @Override
        public String toString() {
            return tenKH + " " + dc;
        }
        

    }
    static class MH {
        String maMatHang,tenMH,dvt;
        long mua,ban;
        MH(String maMatHang,String tenMH,String dvt,long mua,long ban) {
            this.maMatHang = maMatHang;
            this.tenMH = tenMH;
            this.dvt = dvt;
            this.mua = mua;
            this.ban = ban;
        }

        @Override
        public String toString() {
            return tenMH + " " + dvt + " " + mua + " " + ban;
        }
        
    }
    static class HD {
        String maHD,khachHang,matHang;
        String soluong;
        long giaMua,tt;
        HD(int i,String khachHang,String matHang,String soluong ) {
            maHD = String.format("HD%03d", i);
            this.khachHang = khachHang;
            this.matHang = matHang;
            this.soluong = soluong;
        }
        void update(long giaMua) {
            tt = Long.valueOf(soluong) * giaMua;
        }
        @Override
        public String toString() {
            return soluong + " " + tt;
        }
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        LinkedHashMap <String,KH> lsKH = new LinkedHashMap<>();
        for (int i = 0 ;i < n;i++) {
            String maKH = String.format("KH%03d", i+1);
            String tenKH = sc.nextLine();
            String gt = sc.nextLine();
            String ns = sc.nextLine();
            String dc = sc.nextLine();

            lsKH.put(maKH,new KH(maKH,tenKH,gt,ns,dc));
        }

        LinkedHashMap <String,MH> lsMH = new LinkedHashMap<>();
        int m = sc.nextInt();
        for (int i = 0 ;i < m;i++) {
            sc.nextLine();
            String maMatHang = String.format("MH%03d", i+1);
            String tenMH = sc.nextLine();
            String dvt = sc.nextLine();
            long mua = sc.nextLong();
            long ban = sc.nextLong();

            lsMH.put(maMatHang,new MH(maMatHang,tenMH,dvt,mua,ban));
        }

        int k = sc.nextInt();
        sc.nextLine();

        ArrayList <HD> lsHD = new ArrayList<>();
        for (int i = 0 ;i < k ;i++) {
            String s[] = sc.nextLine().split("\\s++");
            String khachHang = s[0];
            String matHang = s[1];
            String soluong = s[2];

            lsHD.add(new HD(i+1,khachHang,matHang,soluong));
        }

        for (HD a : lsHD) {
            System.out.print(a.maHD + " ");
            KH kh = lsKH.get(a.khachHang);
            MH mh = lsMH.get(a.matHang);
            if (kh != null) System.out.print(kh + " ");
            if (mh != null) {
                System.out.print(mh + " ");
                a.update(mh.ban);
            }
            System.out.println(a);
        }
    }
}
