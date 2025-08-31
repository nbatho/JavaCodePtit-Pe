
import java.util.ArrayList;
import java.util.Scanner;

public class J05042BangXepHang {
    static class TH {
        String ten;
        int c,t;
        TH(String ten,int c,int t) {
            this.ten = ten;
            this.c = c;
            this.t = t;
        }
        void op() {
            System.out.printf("%s %d %d\n",ten,c,t);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <TH> ls = new ArrayList<>();
        for (int i = 0 ;i < tc;i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            int c = sc.nextInt(), t = sc.nextInt();
            ls.add(new TH(ten,c,t));
        }
        ls.sort((TH a, TH b) -> {
            if (a.c != b.c) {
                return Integer.compare(b.c, a.c);
            }
            if (a.t != b.t) {
                return Integer.compare(a.t, b.t);
            }
            return a.ten.compareTo(b.ten); 
        });
        for (TH i:ls) {
            i.op();
        }
    }
}
