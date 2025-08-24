
import java.util.Scanner;

public class J04012BaiToanTinhCong {
    static class NV {
        String mnv = "NV01";
        String ten;
        int lcb;
        int cong;
        String cv;

        String getTen(Scanner sc) {
            return sc.nextLine();
        }
        int getLcb(Scanner sc) {
            return sc.nextInt();
        }
        int getCong(Scanner sc) {
            return sc.nextInt();
        }
        String getCv(Scanner sc) {
            return sc.nextLine();
        }
        int pc(String s) {
            if (s.equals("GD")) return 250000;
            else if (s.equals("PGD")) return 200000;
            else if (s.equals("TP")) return 180000;
            else return 150000;
        }
        int thuong(int c,int l) {
            if (c >= 25) return (20*l)/100;
            else if (c >= 22 && c < 25) return (10*l)/100;
            else return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NV a = new NV();

        String ten = a.getTen(sc);
        int lcb = a.getLcb(sc);
        int cong = a.getCong(sc);
        sc.nextLine();
        String cv = a.getCv(sc);
        int phucap = a.pc(cv);
        int luong = lcb*cong;
        int t = a.thuong(cong, luong);
        int thunhap = phucap + luong + t;

        System.out.printf("%s %s %d %d %d %d",a.mnv,ten,luong,t,phucap,thunhap);
        

    }
}
