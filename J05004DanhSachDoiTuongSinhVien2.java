import java.util.ArrayList;
import java.util.Scanner;

public class J05004DanhSachDoiTuongSinhVien2 {
    static class SV {
        String msv;
        String ten = "",lop,ns;
        float gpa;
        String dd,yyyy,mm;
        ArrayList<String> tach = new ArrayList<>();
        SV(int stt,String msv,String ten, String lop,String ns,float gpa) {
            this.msv = msv + String.format("%03d", stt);
            for (String i:ten.toLowerCase().trim().split("\\s+")) {
                tach.add(i);
            }
            for (String i:tach) {
                this.ten += i.substring(0,1).toUpperCase() + i.substring(1) + " ";

            }


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
            System.out.printf("%s %s%s %s/%s/%s %.2f\n",msv,ten,lop,dd,mm,yyyy,gpa);
        }
    }
    public static void main(String[] args) {
        try {
            
            Scanner sc = new Scanner(System.in);
    
            int tc = sc.nextInt();
            for (int i = 0 ;i < tc;i++) {
                sc.nextLine();
                String ten = sc.nextLine();
                String lop = sc.nextLine();
                String ns = sc.nextLine();
                float gpa = sc.nextFloat();
                SV a = new SV(i+1, "B20DCCN", ten, lop, ns, gpa);

                a.op();

            }
        } catch (Exception e) {
        }
    }
}
