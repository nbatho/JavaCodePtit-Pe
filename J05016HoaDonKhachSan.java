
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class J05016HoaDonKhachSan {
    static class HD {
        String ma,ten;
        String phong;
        long ngay;
        long gia;
        HD(int i,String ten,String phong,String nhan,String tra,String dv) {
            this.ma = String.format("KH%02d", i);
            this.ten =ten;
            this.phong = phong;
            DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate ngayNhan = LocalDate.parse(nhan,f);
            LocalDate ngayTra = LocalDate.parse(tra,f);

            ngay = Math.abs(ChronoUnit.DAYS.between(ngayTra, ngayNhan)) + 1;
            char tang = phong.charAt(0);
            if (tang == '1') gia = 25*ngay;
            else if (tang == '2') gia = 34*ngay;
            else if (tang == '3') gia = 50*ngay;
            else if (tang == '4') gia = 80*ngay;
            gia += Integer.valueOf(dv);
        }
        public String toString() {
            return ma + " " + ten + " " + phong + " " + ngay + " " + gia;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <HD> ls = new ArrayList<>();
        sc.nextLine();
        for (int i = 0 ;i < tc;i++) {
            String ten = sc.nextLine().trim();
            String phong = sc.nextLine().trim();
            String nhan = sc.nextLine().trim();
            String tra = sc.nextLine().trim();
            String dv = sc.nextLine().trim();

    
            ls.add(new HD(i+1,ten,phong,nhan,tra,dv));
        }
        ls.sort((HD a,HD b) -> {
            return Long.compare(b.gia, a.gia);
        });
        ls.forEach(e -> System.out.println(e));
    }
}
