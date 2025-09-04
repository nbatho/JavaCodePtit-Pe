
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class J07048DanhSachSanPham2 {
    static class SP {
        String ma,ten;
        int ban,bh;
        SP(String ma,String ten,int ban ,int bh) {
            this.ma = ma;
            this.ten = ten;
            this.ban = ban;
            this.bh = bh;
        }
        public String toString() {
            return ma + " " + ten + " " + ban + " " + bh;
        }
    }
    public static void main(String[] args) {
        try {
            File f = new File("SANPHAM.in");
            Scanner sc = new Scanner(f);

            int tc = sc.nextInt();
            ArrayList <SP> ls = new ArrayList<>();
            for (int i = 0 ;i < tc;i++) {
                sc.nextLine();

                ls.add(new SP(sc.nextLine(),sc.nextLine(),sc.nextInt(),sc.nextInt()));
            }

            ls.sort((SP a,SP b) -> {
                if (a.ban == b.ban){
                    return a.ma.compareTo(b.ma);
                }
                return Integer.compare(b.ban, a.ban);
            });
            for (SP i:ls) System.out.println(i);
        } catch (Exception e) {
        }
    }
}
