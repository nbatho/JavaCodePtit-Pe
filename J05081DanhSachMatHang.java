
import java.util.ArrayList;
import java.util.Scanner;

public class J05081DanhSachMatHang {
    static class MH {
        String mmh, ten,cai;
        int mua,ban;
        int loinhuan;
        MH(int stt,String mmh,String ten, String cai,int mua,int ban) {
            this.mmh = mmh + String.format("%03d", stt);
            this.ten = ten;
            this.cai = cai;
            this.mua = mua;
            this.ban = ban;
            this.loinhuan = this.ban - this.mua;
        }
        void op() {
            System.out.printf("%s %s %s %d %d %d\n",mmh,ten,cai,mua,ban,loinhuan);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <MH> a = new ArrayList<>();
        for (int i = 0 ;i < tc;i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            String cai = sc.next();
            int mua = sc.nextInt();
            int ban = sc.nextInt();
            MH h = new MH(i+1,"MH",ten,cai,mua,ban);
            a.add(h);
        }
        for (int i = 0 ;i < a.size() - 1;i++) {
            for (int j = i+1 ;j < a.size();j++) {
                if (a.get(i).loinhuan < a.get(j).loinhuan) {
                    MH tmp = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, tmp);
                }
                else if (a.get(i).loinhuan == a.get(j).loinhuan) {
                    if (a.get(i).mmh.compareTo(a.get(j).mmh) > 0) {
                        MH tmp = a.get(i);
                        a.set(i, a.get(j));
                        a.set(j, tmp);
                    }
                }
            }
        }
        for (int i = 0 ;i < a.size();i++) {
            a.get(i).op();
        }
    }
}
