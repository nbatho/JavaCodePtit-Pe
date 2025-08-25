
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07058DanhSachMonThi {
    static class Mon {
        String ma, ten, htt;

        Mon(String ma, String ten, String htt) {
            this.ma = ma;
            this.ten = ten;
            this.htt = htt;
        }

        void op() {
            System.out.printf("%s %s %s\n", ma, ten, htt);
        }
    }
    public static void main(String[] args) {
        try {
            File f = new File("MONHOC.in");
            Scanner sc = new Scanner(f);
            
            int n = sc.nextInt();
            sc.nextLine();
            ArrayList <Mon> a = new ArrayList<>();
            for (int i = 0 ; i < n ;i++) {
                String ma,ten,htt;
                ma = sc.nextLine();
                ten = sc.nextLine();
                htt = sc.nextLine();

                a.add(new Mon(ma,ten,htt));
            }
            Collections.sort(a,(m1, m2) -> m1.ma.compareTo(m2.ma));
            for (int i = 0 ;i < a.size();i++) {
                a.get(i).op();
            }

        } catch (Exception e) {
        }
        
        
    }
}
