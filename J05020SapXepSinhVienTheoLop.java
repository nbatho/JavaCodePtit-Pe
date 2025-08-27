
import java.util.ArrayList;
import java.util.Scanner;

public class J05020SapXepSinhVienTheoLop {
    static class SV {
        String msv,ten,lop,email;
        SV(String msv, String ten, String lop,String email) {
            this.msv = msv;
            this.ten = ten;
            this.lop = lop;
            this.email = email;
        }
        void op() {
            System.out.printf("%s %s %s %s\n",msv,ten,lop,email);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();
        ArrayList <SV> a = new ArrayList<>();
        for (int i = 0 ;i < tc;i++) {
            
            String msv = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();

            a.add(new SV(msv,ten,lop,email));
            
        }
        for (int i = 0 ;i < tc - 1;i++) {
            for (int j = i + 1 ;j< tc;j++) {
                if (a.get(i).lop.compareTo(a.get(j).lop) > 0) {
                    SV tmp = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,tmp);
                }
                else if (a.get(i).lop.equals(a.get(j).lop)) {
                    if (a.get(i).msv.compareTo(a.get(j).msv) > 0) {
                    SV tmp = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,tmp);
                }
                }
            }
        }

        for (SV i:a) {
            i.op();
        }
    }
}
