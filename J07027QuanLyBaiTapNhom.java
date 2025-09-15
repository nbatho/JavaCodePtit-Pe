import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class J07027QuanLyBaiTapNhom {
      static class SV {
        String msv,ten,sdt;
        int stt;
        SV(String msv,String ten,String sdt) {
            this.msv = msv;
            this.ten = chuanhoaTen(ten);
            this.sdt = sdt;
        }
        void update(int stt) {
            this.stt = stt;
        }
        String chuanhoaTen(String s) {
            String tmp[] = s.toLowerCase().trim().split("\\s+");
            StringBuilder ans = new StringBuilder();
            for (String word : tmp) {
                ans.append(Character.toUpperCase(word.charAt(0)))
                .append(word.substring(1))
                .append(" ");
            }
            return ans.toString().trim();
        }
        public String toString() {
            return msv + " " + ten + " " + sdt + " " + stt;
        }

    }

    public static void main(String[] args) throws Exception{
        File f1 = new File("SINHVIEN.in");
        Scanner sc = new Scanner(f1);
        int n = sc.nextInt();
        ArrayList <SV> lsSV = new ArrayList<>();
        for (int i = 0 ;i < n;i++) {
            sc.nextLine();
            lsSV.add(new SV(sc.nextLine(),sc.nextLine(),sc.next()));
        }

        File f2 = new File("BAITAP.in");
        Scanner sc2 = new Scanner(f2);
        int m = sc2.nextInt();
        String[] bai = new String[m+1];
        sc2.nextLine();
        for (int i = 1 ;i <= m;i++) {
            String tenbai = sc2.nextLine();
            bai[i] = tenbai;
        }
        lsSV.sort((SV a,SV b) -> {
            return a.msv.compareTo(b.msv);
        });
        
        File f3 = new File("NHOM.in");
        Scanner sc3 = new Scanner(f3);
        for (int i = 0 ;i < n;i++) {

            String s[] = sc3.nextLine().split("\\s++");
            String msv = s[0];
            int stt = Integer.parseInt(s[1]);

            for (SV a:lsSV) {
                if (a.msv.equals(msv)) {
                    a.update(stt);
                }
            }
        }
        for (SV a:lsSV) {
            System.out.printf("%s %s\n",a,bai[a.stt]);
        }
    }
}
