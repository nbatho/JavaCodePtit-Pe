
import java.util.ArrayList;
import java.util.Scanner;

public class J05012TinhTien {
    static class MH {
        String ma,ten;
        int slMua;
        long gia,ck;
        long tong;
        MH(String ma,String ten,int slMua,long gia,long ck) {
            this.ma = ma;
            this.ten = ten;
            this.slMua = slMua;
            this.gia = gia;
            this.ck =ck;
            tong = gia*(long) slMua - ck;
        }
        void op() {
            System.out.printf("%s %s %d %d %d %d\n",ma,ten,slMua,gia,ck,tong);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();

        ArrayList <MH> ls = new ArrayList<>();
        for (int i = 0 ;i < tc;i++) {
            sc.nextLine();
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            int slMua = sc.nextInt();
            long gia = sc.nextLong();
            long ck = sc.nextLong();

            ls.add(new MH(ma,ten,slMua,gia,ck));
        }
        ls.sort((MH a,MH b) -> {
            return Long.compare(b.tong, a.tong);
        });

        for (MH i:ls) i.op();
    }
}
