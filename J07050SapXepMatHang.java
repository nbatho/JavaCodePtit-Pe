
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class J07050SapXepMatHang {
    static class MH {
        String ma,ten,nhom;
        double ln;
        MH(int i,String ten,String nhom,double mua,double ban) {
            ma = String.format("MH%02d", i);
            this.ten = ten;
            this.nhom = nhom;
            this.ln = ban - mua;
        }
        void op() {
            System.out.printf("%s %s %s %.2f\n",ma,ten,nhom,ln);
        }
    }
    public static void main(String[] args) {
        try {
            File f = new File("MATHANG.in");
            Scanner sc = new Scanner(f);

            int tc = sc.nextInt();
            ArrayList <MH> ls = new ArrayList<>();
            for (int i = 0 ;i < tc;i++) {
                sc.nextLine();
                ls.add(new MH(i+1,sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble()));
            }
            ls.sort((MH a,MH b) -> {
                return Double.compare(b.ln, a.ln);
            });
            for (MH i:ls) i.op();
        } catch (Exception e) {
        }
    }
}
