import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class J07046DanhSachLuuTru {
    static class KS {
        String ma,ten,mp;
        long luutru;
        KS(int i,String ten,String mp,String den,String di) throws Exception {
            ma = String.format("KH%02d", i);
            this.ten = ten;
            this.mp = mp;

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date first = sdf.parse(den);
            Date second = sdf.parse(di);

            long diff = second.getTime() - first.getTime();
            luutru = TimeUnit.MILLISECONDS.toDays(diff);

        }
        void op() {
            System.out.printf("%s %s %s %d\n",ma,ten,mp,luutru);
        }
    }
    public static void main(String[] args) {
        try {
            File f = new File("KHACH.in");

            Scanner sc = new Scanner(f);

            int tc = sc.nextInt();
            sc.nextLine();
            ArrayList <KS> ls = new ArrayList<>();
            for (int i = 0 ;i < tc;i++) {
                String ten = sc.nextLine();
                String mp = sc.nextLine();
                String den = sc.nextLine();
                String di = sc.nextLine();

                ls.add(new KS(i+1,ten,mp,den,di));
            }
            ls.sort((KS a,KS b) -> {
                return Long.compare(b.luutru,a.luutru);
            });
            for (KS a:ls) a.op();
        } catch (Exception e) {
        }
    }
}
