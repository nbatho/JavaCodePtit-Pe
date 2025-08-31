
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J05046BangKeNhapKho {
    static class Kho {
        String ten,ma;
        long ck,tck,tien;

        Kho(String ma,String ten,long sl,long gia) {
            this.ten = ten;
            this.ma = ma;

            if (sl > 10) ck = 5;
            else if (sl >= 8) ck = 2;
            else if (sl >= 5) ck = 1;
            else if (sl < 5) ck = 0;
            tck = gia*sl*ck/100;
            tien = gia*sl - tck;
        }
        void op() {
            System.out.printf("%s %s %d %d\n",ma,ten,tck,tien);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Kho> ls = new ArrayList<>();
        HashMap <String,Integer> mp = new HashMap<>();
        int tc = sc.nextInt();

        for (int i = 0 ;i < tc;i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            long sl = sc.nextLong();
            long gia = sc.nextLong();
            String tmp[] = ten.split(" ");
            String s = "" + tmp[0].toUpperCase().charAt(0) + tmp[1].toUpperCase().charAt(0);
            
            if (mp.get(s) == null) mp.put(s,1);
            else mp.put(s,mp.get(s) + 1);

            String ma = s + String.format("%02d", mp.get(s));

            ls.add(new Kho(ma,ten,sl,gia));
        }
        for (Kho i:ls) {
            i.op();
        }
    }
}
