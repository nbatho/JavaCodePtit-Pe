import java.util.ArrayList;
import java.util.Scanner;

public class J06004QuanLyBaiTapNhom2 {
        static class SV {
        String msv,ten,sdt;
        int stt;
        SV(String msv,String ten,String sdt,int stt) {
            this.msv = msv;
            this.ten = ten;
            this.sdt = sdt;
            this.stt = stt;
        }
        public String toString() {
            return msv + " " + ten + " " + sdt + " " + stt;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList <SV> lsSV = new ArrayList<>();
        for (int i = 0 ;i < n;i++) {
            sc.nextLine();
            lsSV.add(new SV(sc.nextLine(),sc.nextLine(),sc.next(),sc.nextInt()));
        }
        String[] bai = new String[m+1];
        sc.nextLine();
        for (int i = 1 ;i <= m;i++) {
            String tenbai = sc.nextLine();
            bai[i] = tenbai;
        }
        lsSV.sort((SV a,SV b) -> {
            return a.msv.compareTo(b.msv);
        });
        for (SV a:lsSV) {
            System.out.printf("%s %s\n",a,bai[a.stt]);
        }
    }
}
