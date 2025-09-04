import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class J07034DanhSachMonHoc {
    static class M {
        String ma,ten;
        int stc;
        M(String ma,String ten,int stc) {
            this.ma = ma;
            this.ten = ten;
            this.stc =stc;
        }
        public String toString() {
            return ma + " " + ten + " " + stc;
        }
    }

    public static void main(String[] args) {
        try {
            File f = new File("MONHOC.in");
    
            Scanner sc = new Scanner(f);
            int tc = sc.nextInt();

            ArrayList <M> ls = new ArrayList<>();
            for (int i = 0 ;i < tc;i++) {
                sc.nextLine();
                String ma = sc.nextLine();
                String ten = sc.nextLine();
                int stc = sc.nextInt();
                ls.add(new M(ma,ten,stc));
            }
            ls.sort((M a,M b) -> {
                return a.ten.compareTo(b.ten);
            });
            for (M a:ls) System.out.println(a);
        } catch (Exception e) {
        }


    }
    
}
