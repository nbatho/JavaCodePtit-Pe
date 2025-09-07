
import java.util.ArrayList;
import java.util.Scanner;

public class J06003QuanLyBaiTapNhom1 {
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
            return msv + " " + ten + " " + sdt;
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

        int q = sc.nextInt();
        while(q--> 0) {
            int stt = sc.nextInt();
            System.out.printf("DANH SACH NHOM %d:\n",stt);
            for (SV a:lsSV) {
                if (a.stt == stt) {
                    System.out.println(a);
                }
            }
            System.out.printf("Bai tap dang ky: %s\n",bai[stt]);
        }
    }
}
