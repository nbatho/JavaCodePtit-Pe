
import java.util.ArrayList;
import java.util.Scanner;

public class J05076NhapXuatHang {
    static class XH {
        String ma,ten;
        long kyvong,giaNhap,giaXuat;
        XH(String ma,String ten,String loai) {
            this.ma = ma;
            this.ten = ten;

            if (loai.compareTo("A") == 0)
                this.kyvong = 8;
            else if (loai.compareTo("B") == 0)
                this.kyvong = 5;
            else if (loai.compareTo("C") == 0) this.kyvong = 2;
            else this.kyvong = 0;
        }
        void update(long slnhap,long gianhap,long slxuat) {
            this.giaNhap =slnhap * gianhap;
            this.giaXuat =(this.kyvong + 100) * gianhap*slxuat / 100;
        }
        void op() {
            System.out.printf("%s %s %d %d\n",ma,ten,giaNhap,giaXuat);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        ArrayList <XH> ls = new ArrayList<>();
        sc.nextLine();
        for (int i = 0 ;i < tc;i++) {

            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String loai = sc.nextLine();
            ls.add(new XH(ma,ten,loai));
        }

        int q = sc.nextInt();
        for (int i = 0 ;i < q;i++) {
            String mh = sc.next();
            long slnhap = sc.nextLong(),gianhap = sc.nextLong(), slxuat = sc.nextLong();

            for (XH h:ls) {
                if (h.ma.equals(mh)) {
                    h.update(slnhap, gianhap, slxuat);
                    h.op();
                    break;
                }
            }
            
        }
        
    }
}
