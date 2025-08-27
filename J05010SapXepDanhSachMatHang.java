
import java.util.ArrayList;
import java.util.Scanner;

public class J05010SapXepDanhSachMatHang {
    static class MH {
        int stt;
        String ma,nh;
        float loinhuan;

        MH(int stt,String ma,String nh,float loinhuan) {
            this.stt =stt;
            this.ma = ma;
            this.nh = nh;
            this.loinhuan = loinhuan;
        }
        void op() {
            System.out.printf("%d %s %s %.2f\n",stt,ma,nh,loinhuan);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        ArrayList <MH> a = new ArrayList <>();
        for (int i = 0;i < tc;i++) {
            sc.nextLine();
            String ma =sc.nextLine();
            String mh = sc.nextLine();
            float mua = sc.nextFloat();
            float ban = sc.nextFloat();
            float ln = ban - mua;

            a.add(new MH(i+1,ma,mh,ln));
        }
        for (int i = 0 ;i < tc - 1;i++) {
            for(int j = i+1;j<tc;j++) {
                if (a.get(i).loinhuan < a.get(j).loinhuan) {
                    MH tmp = a.get(i);
                    a.set(i,a.get(j));
                    a.set(j,tmp);
                }
            }
        }
        for (MH i:a) {
            i.op();
        }
    }
}
