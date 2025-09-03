import java.util.ArrayList;
import java.util.Scanner;

public class J05080LopHocPhan2 {
    static class GV {
        String ma,ten,nhom,gv;

        GV(String ma, String ten,String nhom,String gv) {
            this.ma = ma;
            this.ten = ten;
            this.nhom = nhom;
            this.gv = gv;
        }
        void op() {
            System.out.printf("%s %s %s\n",ma,ten,nhom);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();

        ArrayList <GV> ls = new ArrayList<>();

        for (int i = 0 ;i < tc;i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String nhom = sc.nextLine();
            String gv = sc.nextLine();
            ls.add(new GV(ma,ten,nhom,gv));
        }
        ls.sort((GV a,GV b) -> {
            if (a.ma.equals(b.ma))
                return a.nhom.compareTo(b.nhom);
            return a.ma.compareTo(b.ma);
        });
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ;i < m;i++) {
            String ten = sc.nextLine();
            System.out.printf("Danh sach cho giang vien %s:\n",ten);
            for (GV a:ls) {
                if (a.gv.equals(ten)) {
                    a.op();
                }
            }
            
        }

    }
}
