import java.util.ArrayList;
import java.util.Scanner;

public class J05075DiemDanh2 {
        static class SV {
        String msv, ten, lop;
        int so;    
        String dk; 
        
        SV(String msv, String ten, String lop) {
            this.msv = msv;
            this.ten = ten;
            this.lop = lop;
            this.so = 10; 
            this.dk = "";
        }
        
        void update(String dd) {
            for (char c : dd.toCharArray()) {
                if (c == 'm' || c == 'M') so -= 1;
                else if (c == 'v' || c == 'V') so -= 2;
            }
            if (so < 0) so = 0;
            if (so == 0) dk = "KDDK";
        }
        
        void op() {
            if (so == 0) 
                System.out.printf("%s %s %s %d %s\n", msv, ten, lop, so, dk);
            else
                System.out.printf("%s %s %s %d\n", msv, ten, lop, so);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = Integer.parseInt(sc.nextLine());
        ArrayList<SV> ls = new ArrayList<>();
        
        for (int i = 0; i < tc; i++) {
            String msv = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            ls.add(new SV(msv, ten, lop));
        }
        
        for (int i = 0; i < tc; i++) {
            String[] tmp = sc.nextLine().trim().split(" ");
            String mSV = tmp[0];
            String dd = tmp[1];
            for (SV sv : ls) {
                if (sv.msv.equals(mSV)) {
                    sv.update(dd);
                    break;
                }
            }
        }
        String lopChon = sc.nextLine();
        for (SV sv : ls) {
            if (sv.lop.equals(lopChon))
                sv.op();
        }
    }
}
