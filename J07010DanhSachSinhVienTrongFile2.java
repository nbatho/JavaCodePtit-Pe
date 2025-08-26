
import java.io.File;
import java.util.Scanner;
public class J07010DanhSachSinhVienTrongFile2 {
    static class SV {
        String msv;
        String ten,lop,ns;
        double gpa;
        String dd,yyyy,mm;
        SV(int stt,String msv,String ten, String lop,String ns,double gpa) {
            this.msv = msv + String.format("%03d", stt);
            this.ten = ten;
            this.lop = lop;
            this.ns = ns;
            String s[] = this.ns.split("/");
            this.dd = s[0];
            if (this.dd.length() < 2) {
                this.dd = "0" + this.dd;
            }
            this.mm = s[1];
            if (this.mm.length() < 2) {
                this.mm = "0" + this.mm;
            }
            this.yyyy = s[2];
            this.gpa = gpa;
        }
        void op() {
            System.out.printf("%s %s %s %s/%s/%s %.2f\n",msv,ten,lop,dd,mm,yyyy,gpa);
        }
    }
    public static void main(String[] args) {
        try {
            
            File f = new File("SV.in");
            // Scanner sc = new Scanner(f);
            Scanner sc = new Scanner(f);
    
            int tc = sc.nextInt();
            for (int i = 0 ;i < tc;i++) {
                sc.nextLine();
                String ten = sc.nextLine();
                String lop = sc.nextLine();
                String ns = sc.nextLine();
                double gpa = sc.nextDouble();
                SV a = new SV(i+1, "B20DCCN", ten, lop, ns, gpa);

                a.op();

            }
        } catch (Exception e) {
        }
    }
}
