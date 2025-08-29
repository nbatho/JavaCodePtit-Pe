import java.util.ArrayList;
import java.util.Scanner;

public class J05027TimKiemGiangVien {
    static class GV {
        String ten,bm,ma;
        
        GV(int stt,String ten,String bm) {
            this.ma = String.format("GV%02d", stt);
            
            this.ten = ten;
            this.bm = convert(bm);
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
            System.out.printf("DANH SACH GIANG VIEN THEO TU KHOA " + x + ":\n");
            for (GV gv:ls) {
                if (gv.ten.toLowerCase().contains(x.toLowerCase())) {
                    gv.op();
                }
            }
        }
    }
}
