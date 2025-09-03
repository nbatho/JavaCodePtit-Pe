
import java.util.ArrayList;
import java.util.Scanner;

public class J05079LopHocPhan1 {
    static class Mon {
        String ma,ten;

        Mon(String ma,String ten) {
            this.ma = ma;
            this.ten = ten;
        }
    }
    static class GV {
        String ma,ten,nhom,gv;

        GV(String ma, String ten,String nhom,String gv) {
            this.ma = ma;
            this.ten = ten;
            this.nhom = nhom;
            this.gv = gv;
        }
        void op() {
            System.out.printf("%s %s\n",nhom,gv);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();

        ArrayList <GV> ls = new ArrayList<>();
        ArrayList <Mon> mon = new ArrayList<>();

        for (int i = 0 ;i < tc;i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            String gv = sc.nextLine();
            ls.add(new GV(ma,ten,nhom,gv));
            mon.add(new Mon(ma,ten));
        }
        ls.sort((GV a,GV b) -> {
            return a.nhom.compareTo(b.nhom);
        });
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ;i < m;i++) {
            String ma = sc.nextLine();

            for (Mon x :mon) {
                if (x.ma.equals(ma)) {
                    System.out.printf("Danh sach nhom lop mon %s:\n",x.ten);
                    break;
                }
            }
            for (GV a:ls) {
                if (a.ma.equals(ma)) {
                    a.op();
                }
            }
        }

    }
}
