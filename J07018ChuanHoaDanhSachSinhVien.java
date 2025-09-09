
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class J07018ChuanHoaDanhSachSinhVien {
    static class SV {
        String ma;
        String ten,msv,ns;
        double gpa;

        SV(int i ,String ten,String msv,String ns,double gpa) {
            ma = "B20DCCN" + String.format("%03d", i);
            this.ten = chuanHoa(ten);
            this.msv = msv;
            this.ns = chuanhoaTime(ns);
            this.gpa = gpa;
        }
        static String chuanhoaTime(String ns) {
            String tmp[] = ns.split("/");
            String dd = tmp[0];
            if (dd.length() < 2) dd = "0" + dd;
            String mm = tmp[1];
            if (mm.length() < 2) mm = "0" + mm;
            String yyyy = tmp[2];

            return dd + "/" + mm + "/" + yyyy;
        }
        static String chuanHoa(String s) {
            s = s.trim().toLowerCase().replaceAll("\\s+", " ");
            String[] parts = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for (String x : parts) {
                sb.append(Character.toUpperCase(x.charAt(0)))
                  .append(x.substring(1))
                  .append(" ");
            }
            return sb.toString().trim();
        }
        void op() {
            System.out.printf("%s %s %s %s %.2f\n",ma,ten,msv,ns,gpa);
        }
       
    }
    public static void main(String[] args) {
        try {
            File f = new File("SINHVIEN.in");
            Scanner sc = new Scanner(f);

            int tc = sc.nextInt();
            ArrayList <SV> ls = new ArrayList<>();
            for (int i = 0 ;i < tc;i++) {
                sc.nextLine();
                String ten =sc.nextLine();
                String msv = sc.nextLine();
                String ns = sc.nextLine();
                double gpa = sc.nextDouble();

                ls.add(new SV(i+1,ten,msv,ns,gpa));
            }

            for (SV a:ls) a.op();
        } catch (Exception e) {
        }
    }
}
