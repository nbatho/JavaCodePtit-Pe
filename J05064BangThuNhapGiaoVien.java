import java.util.ArrayList;
import java.util.Scanner;

public class J05064BangThuNhapGiaoVien {
    static class GV {
        String ma,ten;
        long pc,thunhap,bac;
        String ngach;
        GV(String ma,String ten,long lcb) {
            this.ma = ma; this.ten = ten;

            ngach = ma.substring(0,2);
            String hs = ma.substring(2);
            bac = Integer.parseInt(hs);
            if (ngach.equals("HT")) pc = 2000000;
            else if (ngach.equals("HP")) pc = 900000;
            else pc = 500000;

            thunhap = lcb* bac + pc;

        }
        void op() {
            System.out.printf("%s %s %d %d %d\n",ma,ten,bac,pc,thunhap);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <GV> ls = new ArrayList<>();
        for (int i = 0  ;i < tc;i++) {
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            long lcb = sc.nextLong();

            ls.add(new GV(ma,ten,lcb));
        }
        ArrayList <GV> ans = new ArrayList<>();
        int cntHT = 0;
        int cntHP = 0;
        for (GV i:ls) {
            if (cntHT  == 0 && i.ngach.equals("HT")) {
                cntHT += 1;
                ans.add(i);
            }
            else if (cntHP < 2 && i.ngach.equals("HP")) {
                cntHP += 1;
                ans.add(i);
            }
            else if (i.ngach.equals("GV")) ans.add(i);
        }
        for (GV i:ans) {
            i.op();
        }
    }
}