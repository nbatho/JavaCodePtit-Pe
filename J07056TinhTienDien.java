import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class J07056TinhTienDien {
    static class HD {
        String ma,ten;
        long thue,tienTrong,tienVuot,tienTong,dinhMuc;
        HD(int i,String ten,String hgd,long csd,long csc) {
            ma = String.format("KH%02d",i);
            this.ten = chuanHoa(ten);

            if (hgd.equals("A")) dinhMuc = 100;
            else if (hgd.equals("B")) dinhMuc = 500;
            else if (hgd.equals("C")) dinhMuc = 200;

            long soDien = csc - csd;

            if (soDien < dinhMuc) {
                tienTrong = soDien*450;
            } else tienTrong = dinhMuc * 450;

            if (soDien > dinhMuc) tienVuot = (soDien - dinhMuc)*1000;
            else tienVuot = 0;

            thue = tienVuot * 5 / 100;

            tienTong = tienTrong + tienVuot + thue;
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
            return ma + " " + ten + " " + tienTrong + " " + tienVuot + " " + thue + " " +tienTong;
        }
    }
    public static void main(String[] args) {
        try {
            File f = new File("KHACHHANG.in");

            Scanner sc = new Scanner(f);

            int tc = sc.nextInt();
            ArrayList <HD> ls = new ArrayList<>();
            for (int i = 0 ;i < tc;i++) {
                sc.nextLine();
                String ten = sc.nextLine();
                String hgd = sc.next();
                long csd = sc.nextLong();
                long csc = sc.nextLong();

                ls.add(new HD(i+1,ten,hgd,csd,csc));

            }
            ls.sort((HD a,HD b) -> {
                return Long.compare(b.tienTong, a.tienTong);
            });
            for (HD a:ls) System.out.println(a);

        } catch (Exception e) {
        }
    }
}
