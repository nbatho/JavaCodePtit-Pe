import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class J07049TinhNgayHetHanBaoHanh {
    public static class SP {
        String ma,ten,giaBan,thoiHan;

        public SP(String ma, String ten, String giaBan, String thoiHan) {
            this.ma = ma;
            this.ten = ten;
            this.giaBan = giaBan;
            this.thoiHan = thoiHan;
        }
        
    }
    public static class KH {
        String hoTenKH,diaChi,maSP,ngayMua,ma;
        int giaBan,thoiHan,soLuongMua,tongTien;
        String ngayDenHan;
        public KH(int i,String hoTenKH, String diaChi, String maSP, int soLuongMua, String ngayMua,int giaBan,int thoiHan) {
            this.ma = String.format("KH%02d", i);
            this.hoTenKH = hoTenKH;
            this.diaChi = diaChi;
            this.maSP = maSP;
            this.soLuongMua = soLuongMua;
            this.giaBan = giaBan;
            this.tongTien = this.giaBan * this.soLuongMua;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse(ngayMua,formatter);
            LocalDate newDate = date.plusMonths(thoiHan);
            this.ngayDenHan = newDate.format(formatter);
        }
        @Override
        public String toString() {
            return this.ma + " " + this.hoTenKH + " " + this.diaChi + " " + this.maSP + " " + this.tongTien + " " + this.ngayDenHan;
        };
        
    }
    public static void main(String[] args) throws Exception {
        File f = new File("MUAHANG.in");

        Scanner sc = new Scanner(f);
        ArrayList <SP> lsSP = new ArrayList<>();
        ArrayList <KH> lsKH = new ArrayList<>();
        int ssp = Integer.parseInt(sc.nextLine());
        for (int i = 0 ;i < ssp ;i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String giaBan = sc.nextLine();
            String thoiHan = sc.nextLine();
            lsSP.add(new SP(ma, ten, giaBan, thoiHan));
        }

        int soKH = Integer.parseInt(sc.nextLine());
        for (int i = 0 ;i < soKH;i++) {
            String hoTenKH = sc.nextLine();
            String diaChi = sc.nextLine();
            String maSP = sc.nextLine();
            String soLuongMua = sc.nextLine();
            String ngayMua = sc.nextLine();
            for (SP x : lsSP) {
                if (x.ma.equals(maSP))
                    lsKH.add(new KH(i+1,hoTenKH, diaChi, maSP, Integer.parseInt(soLuongMua), ngayMua,Integer.parseInt(x.giaBan),Integer.parseInt(x.thoiHan)));

            }
        }
        lsKH.sort((KH a, KH b) -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate d1 = LocalDate.parse(a.ngayDenHan, formatter);
            LocalDate d2 = LocalDate.parse(b.ngayDenHan, formatter);
            if (d1.equals(d2)) {
                return a.ma.compareTo(b.ma); 
            }
            return d1.compareTo(d2); 
        });
        for (KH a : lsKH) {
            System.out.println(a);
        }


    }
}
