import java.util.ArrayList;
import java.util.Scanner;

public class J05035DanhSachThucTap2 {
    static class SV {
        int stt;
        String msv,ten,lop,email,dn;

        SV(int stt,String msv,String ten,String lop,String email,String dn) {
            this.stt= stt;
            this.msv = msv.trim();
            this.ten = ten.trim();
            this.lop = lop.trim();
            this.email = email.trim();
            this.dn = dn.trim();
        }

        void op() {
            System.out.printf("%d %s %s %s %s %s\n",stt,msv,ten,lop,email,dn);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();
        ArrayList <SV> ls = new ArrayList<>();
        for (int i = 0 ;i < tc;i++) {
            ls.add(new SV(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine()));
        }

        ls.sort((SV a,SV b) -> {
            return a.msv.compareTo(b.msv);
        }); 

        int q = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ;i < q;i++) {
            String x = sc.nextLine();
            for (SV p:ls) {
                if (p.dn.equals(x)) {
                    p.op();
                }
            }
        }
    }
}
