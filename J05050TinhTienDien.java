
import java.util.ArrayList;
import java.util.Scanner;

public class J05050TinhTienDien {
    static class TD {
        String ma;
        long hs,tien,phutroi,tra;

        TD(int i,String sd,long cu,long moi) {
            ma = String.format("KH%02d", i);
            if (sd.equals("KD")) hs = 3;
            else if (sd.equals("NN")) hs =5;
            else if (sd.equals("TT")) hs =4;
            else if (sd.equals("CN")) hs =2;

            long dis = moi - cu;
            tien = dis*hs*550;


            if (dis > 100) phutroi = tien;
            else if (dis >= 50) phutroi = Math.round(tien/100.0*35);
            else phutroi = 0;

            tra = phutroi + tien;
        }
        void op() {
            System.out.printf("%s %d %d %d %d\n",ma,hs,tien,phutroi,tra);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <TD> ls = new ArrayList<>();

        for (int i = 0 ;i < tc;i++) {
            sc.nextLine();
            String sd = sc.nextLine();
            long cu = sc.nextLong();
            long moi = sc.nextLong();

            ls.add(new TD(i+1,sd,cu,moi));
        }

        for (TD i:ls) {
            i.op();
        }
    }
}
