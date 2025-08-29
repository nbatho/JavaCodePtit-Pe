import java.util.ArrayList;
import java.util.Scanner;

public class J05029DanhSachDoanhNghiepNhanSinhVienThucTap2 {
    static class TT {
        String mdn,tdn;
        int ssv;

        TT(String mdn,String tdn,int ssv) {
            this.mdn = mdn;
            this.tdn = tdn;
            this.ssv = ssv;
        }
        void op() {
            System.out.printf("%s %s %d\n",mdn,tdn,ssv);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <TT> ls = new ArrayList<>();
        for (int i = 0 ;i < tc;i++) {
            sc.nextLine();
            String mdn = sc.nextLine();
            String tdn = sc.nextLine();
            int ssv = sc.nextInt();

            ls.add(new TT(mdn,tdn,ssv));
        }
        for (int i = 0 ;i < tc - 1 ;i++) {
            for (int j = i + 1 ;j< tc;j++) {
                if (ls.get(i).ssv == ls.get(j).ssv) {
                    if (ls.get(i).mdn.compareTo(ls.get(j).mdn) > 0) {
                        TT tmp = ls.get(i);
                        ls.set(i,ls.get(j));
                        ls.set(j,tmp);
                    }
                }
                else if (ls.get(i).ssv < ls.get(j).ssv) {
                    TT tmp = ls.get(i);
                    ls.set(i,ls.get(j));
                    ls.set(j,tmp);
                }
            }
        }
        int q = sc.nextInt();
        for (int i = 0 ;i < q;i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n",a,b);

            for (TT sv:ls) {
                if (sv.ssv >= a && sv.ssv <= b)
                    sv.op();
            }
        }


    }
}