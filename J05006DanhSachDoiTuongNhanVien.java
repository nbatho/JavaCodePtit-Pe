
import java.util.Scanner;

public class J05006DanhSachDoiTuongNhanVien {
    static class NV {
        String mnv,ten,gt,ns,dc,mst,hd;

        NV(int stt, String mnv,String ten, String gt,String ns, String dc,String mst,String hd) {
            this.mnv = String.format("%05d", stt);
            this.ten = ten;
            this.gt = gt;
            this.ns = ns;
            this.dc = dc;
            this.mst = mst;
            this.hd = hd;
        }
        void op() {
            System.out.printf("%s %s %s %s %s %s %s\n",mnv,ten,gt,ns,dc,mst,hd);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ;i < tc;i++) {
            String ten = sc.nextLine();
            String gt = sc.nextLine();
            String ns = sc.nextLine();
            String dc = sc.nextLine();
            String mst = sc.nextLine();
            String hd = sc.nextLine();

            NV a = new NV(i+1,"",ten,gt,ns,dc,mst,hd);
            a.op();
        }
    }
}
