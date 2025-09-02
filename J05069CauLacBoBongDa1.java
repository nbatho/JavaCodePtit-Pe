
import java.util.ArrayList;
import java.util.Scanner;

public class J05069CauLacBoBongDa1 {
    static class CLB {
        String ma,ten,maCLB;
        long doanhthu,sl,giave;
        CLB(String ma,String ten,long giave) {
            this.ma = ma;
            this.ten = ten;
            this.doanhthu = 0;
            this.giave = giave;
        }
        void update(String maCLB,long sl) {
            this.sl = sl;
            this.maCLB = maCLB;
            this.doanhthu = this.giave*this.sl;
        }
        void op() {
            System.out.printf("%s %s %d\n",maCLB,ten,doanhthu);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <CLB> ls = new ArrayList<>();

        for (int i = 0 ;i < tc;i++) {
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int giave = sc.nextInt();

            ls.add(new CLB(ma,ten,giave));
        }

        int soTran = sc.nextInt();
        for (int i = 0 ;i < soTran;i++) {
            sc.nextLine();
            String tran = sc.next();
            long sl = sc.nextLong();

            String maCLB = tran.substring(1,3);
            for (CLB j:ls) {
                if (j.ma.equals(maCLB)) {
                    j.update(tran,sl);
                    j.op();
                }
            }
           
        }
    }
}
