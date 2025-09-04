import java.util.ArrayList;
import java.util.Scanner;

public class J05017HoaDonTienNuoc {
    static class NC {
        String ten,ma;
        double tt;
        long tien;
        NC(int i, String ten, double cu, double moi) {
            ma = String.format("KH%02d", i);
            this.ten = ten;
            tt = moi - cu;

            if (tt > 100) {
                tien = Math.round((50*100 + 50*150 + (tt - 100)*200) * 1.05);
            } else if (tt > 50) {
                tien = Math.round((50*100 + (tt - 50)*150) * 1.03);
            } else {
                tien = Math.round(tt * 100 * 1.02);
            }
        }

        public String toString() {

            return ma + " " + ten + " " + tien;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <NC> ls = new ArrayList<>();

        for (int i = 0 ;i < tc;i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            double cu = sc.nextDouble();
            double moi = sc.nextDouble();

            ls.add(new NC(i+1,ten,cu,moi));
        }
        ls.sort((NC a,NC b) -> {
            return Double.compare(b.tien, a.tien);
        });
        for (NC nc : ls) {
            System.out.println(nc);
        }
    }
}
