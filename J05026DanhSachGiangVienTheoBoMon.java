import java.util.ArrayList;
import java.util.Scanner;

public class J05026DanhSachGiangVienTheoBoMon {
        static class GV {
        String ten,bm,ma,tenDau;
        
        static String getTen(String s) {
            String []tmp = s.trim().split(" ");

            return tmp[tmp.length -1];
        }
        GV(int stt,String ten,String bm) {
            this.ma = String.format("GV%02d", stt);
            
            this.ten = ten;
            this.bm = convert(bm);
            this.tenDau = getTen(this.ten);
        }
        void op() {
            System.out.printf("%s %s %s\n",ma,ten,bm);
        }
    }
    static String convert(String s) {
            String []tmp = s.trim().split(" ");      
            String xau = "";
            for (int i = 0; i < tmp.length; i++) {
                xau += tmp[i].toUpperCase().charAt(0);  
            }
            return xau;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tc = sc.nextInt();
        sc.nextLine();
        ArrayList <GV> ls = new ArrayList<>();

        for (int i = 0 ;i < tc ;i++) {
            String ten = sc.nextLine();
            String mon = sc.nextLine();

            ls.add(new GV(i+1,ten,mon));
        }
        
        int q = sc.nextInt();
        sc.nextLine();
        for (int i = 0 ;i < q;i++) {
            String x = sc.nextLine();
            x = convert(x);
            System.out.printf("DANH SACH GIANG VIEN BO MON " + x + ":\n");
            for (GV gv:ls) {
                if (gv.bm.equals(x)) {
                    gv.op();
                }
            }
        }
    }
}
