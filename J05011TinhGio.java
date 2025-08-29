
import java.util.ArrayList;
import java.util.Scanner;

public class J05011TinhGio {
    static class NC {
        String mnc,ten;
        int tgian;
        static int convert(String s) {
            String[] tmp = s.trim().split(":");
            int hh = Integer.parseInt(tmp[0]);
            int mm = Integer.parseInt(tmp[1]);

            return hh*60 + mm;
        }
        int mm , hh;

        NC(String mnc, String ten, String vao,String ra) {
            this.mnc = mnc;
            this.ten = ten;

            int tgvao = convert(vao);
            int tgra = convert(ra);

            this.tgian = tgra - tgvao;

            this.hh = this.tgian % 60;
            this.mm = this.tgian / 60;
        }
        void op() {
            System.out.printf("%s %s %d gio %d phut\n",this.mnc,this.ten,this.mm,this.hh);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();
        ArrayList <NC> ls = new ArrayList<>();
        for (int i = 0 ;i < tc;i++) {
            String mnc = sc.nextLine();
            String ten = sc.nextLine();
            String vao = sc.nextLine();
            String ra = sc.nextLine();

            ls.add(new NC(mnc,ten,vao,ra));
        }
        for (int i = 0 ;i < tc - 1 ;i++) {
            for (int j = i+1 ;j < tc;j++) {
                if (ls.get(i).tgian < ls.get(j).tgian) {
                    NC tmp = ls.get(i);
                    ls.set(i,ls.get(j));
                    ls.set(j,tmp);
                }
            }
        }
    
        for (NC i:ls) {
            i.op();
        }
    }
}
