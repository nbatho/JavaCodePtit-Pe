import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

public class J07051TinhTienPhong {
    static class HD {
        String ma, ten, phong;
        long ngay;
        long gia;

        HD(int i, String ten, String phong, String nhan, String tra, String dv) {
            this.ma = String.format("KH%02d", i);
            this.ten = chuanHoa(ten);
            this.phong = phong;

            DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate ngayNhan = LocalDate.parse(nhan, f);
            LocalDate ngayTra = LocalDate.parse(tra, f);

            ngay = ChronoUnit.DAYS.between(ngayNhan, ngayTra) + 1;

            char tang = phong.charAt(0);
            if (tang == '1') gia = 25 * ngay;
            else if (tang == '2') gia = 34 * ngay;
            else if (tang == '3') gia = 50 * ngay;
            else if (tang == '4') gia = 80 * ngay;

            gia += Integer.parseInt(dv);
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

        public String toString() {
            return ma + " " + ten + " " + phong + " " + ngay + " " + gia;
        }
    }
    static String modifiedTime(String s) {
        String tmp[] = s.split("/");
        String dd = tmp[0];
        if (dd.length() < 2) {
            dd = "0" + dd;
        }
        String mm = tmp[1];
        if (mm.length() < 2) {
            mm = "0" + mm;
        }
        String hh = tmp[2];
        return dd + "/" + mm + "/" + hh;
    }
    public static void main(String[] args) {
        try {
            File f = new File("KHACHHANG.in");
            Scanner sc = new Scanner(f);

            int tc = Integer.parseInt(sc.nextLine());
            ArrayList<HD> ls = new ArrayList<>();

            for (int i = 0; i < tc; i++) {
                String ten = sc.nextLine().trim();
                String phong = sc.nextLine().trim();
                String nhan = sc.nextLine().trim();
                String tra = sc.nextLine().trim();
                String dv = sc.nextLine().trim();

                ls.add(new HD(i + 1, ten, phong, modifiedTime(nhan), modifiedTime(tra), dv));
            }

            ls.sort((HD a, HD b) -> Long.compare(b.gia, a.gia));
            ls.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
