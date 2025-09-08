
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class J07073DangKyHinhThucGiangDay {
    static class MH {
        String ma,ten,htlt,htth;
        int stc;
        MH(String ma,String ten,int stc,String htlt,String htth) {
            this.ma = ma;
            this.ten = ten;
            this.stc = stc;
            this.htlt = htlt;
            this.htth = htth;
        }
        public String toString() {
            return ma + " " + ten + " " + stc + " " + htlt + " " + htth;
        }
    }
    public static void main(String[] args) {
        try {
            File f = new File("MONHOC.in");
            Scanner sc = new Scanner(f);
            int smh = sc.nextInt();
            sc.nextLine();
            ArrayList <MH> ls = new ArrayList<>();
            for (int i = 0 ;i < smh;i++) {
                String ma = sc.nextLine();
                String ten = sc.nextLine();
                int stc = Integer.parseInt(sc.nextLine());
                String htlt = sc.nextLine();
                String htth = sc.nextLine();

                ls.add(new MH(ma,ten,stc,htlt,htth));
            }
            ls.sort((MH a,MH b) -> {
                return a.ma.compareTo(b.ma);
            });
            for (MH a:ls) {
                if (a.htth.equals("Truc tuyen") || a.htth.endsWith(".ptit.edu.vn")) {
                    System.out.println(a);
                }
            }
        } catch (Exception e) {
        }
    }
}
